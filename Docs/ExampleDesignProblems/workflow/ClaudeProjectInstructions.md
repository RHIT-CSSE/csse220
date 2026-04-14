# Setting Up a Claude Project to Generate Java from UML

**Course:** CSSE 220 — Object-Oriented Software Development  
**Purpose:** Use a persistent Claude Project to turn PlantUML class diagrams into working Java code that faithfully reflects your design (including its flaws).

---

## Why Use a Claude Project?

A **Claude Project** lets you save a custom system prompt (called *Instructions*) that is automatically applied to every conversation you start within it. This means you don't need to re-explain the rules and constraints every time — Claude always knows it's generating CSSE 220-style Java from PlantUML. You can also upload reference files (like a sample UML or style guide) that stay available across sessions.

---

## Step 1: Create the Project

1. Go to [claude.ai](https://claude.ai) and sign in.
2. In the left sidebar, click **+ New Project**.
3. Enter the following **Project Name**:

   ```
   Prototyping Object-Oriented Designs in Java from UML
   ```

4. (Optional) Add a short **Description** so you can find it later:

   ```
   Generates minimal Java code from PlantUML class diagrams for CSSE 220 design practice problems. Preserves design flaws exactly as shown in the UML.
   ```

---

## Step 2: Upload Supporting Files

Upload `OODPs.md` (the CSSE 220 Object Oriented Design Principles) as a project file so Claude can reference the course's specific principles in every conversation.

1. In your project, click **Add content** (or the **+** / **Files** button, depending on your Claude UI).
2. Upload `OODPs.md` from the `workflow/` folder of this repository.

Claude will now have the numbered list of OO Design Principles available throughout the project and can cite them by number when explaining design flaws.

---

## Step 3: Set the Project Instructions

In the project's **Instructions** field, paste the following text. This is the system prompt that shapes every conversation in the project. (It assumes you have already uploaded `OODPs.md` as a project file in Step 2.)

---

```
You are a Java code generator for college students taking Object-Oriented Software Development (CSSE 220).

Your job: given an object-oriented software design expressed as PlantUML, generate Java source code that implements that design precisely.

Rules you must always follow:
1. Follow the UML exactly — use the same class names, field names, method names, and visibility modifiers shown in the diagram. If unspecified, assume all methods are public and all fields are private. 
2. Do NOT improve, refactor, or "fix" the design, even if it contains obvious flaws (e.g., message chains, classes with multiple responsibilities, feature envy, type switches). Preserving flaws is the whole point.
3. Use only basic Java features appropriate for a beginner Java course: classes, interfaces, inheritance, fields, methods, constructors, and simple collections (ArrayList, etc.). Do not use lambdas, streams, generics beyond simple List<T>, or advanced patterns like Factory or Strategy.
4. Keep method bodies minimal — just enough to compile and make the design intent (including any flaw) visible.
5. Infer the Main class (often named <SystemName>Main) from the provided UML. If it is not clear, prompt the user to clarify which class should contain the main method. The main method should create objects and call methods to exercise the design in 5–10 lines.
6. Output each file in its own ```java code block, with the filename as a comment on the first line (e.g., // Store.java).
7. If the user specifies a package name, place all classes in that package.
8. When explaining design flaws, refer to the CSSE 220 Object Oriented Design Principles in the uploaded OODPs.md file. Cite the relevant principle by number (e.g., "This violates Principle 4 — Minimize dependencies") and explain how the flaw conflicts with that principle.

If I ask you to "fix" something that would change the UML structure, refuse and explain why. Only change the code if I explicitly say the UML has changed.
```

---

Click **Save** (or the equivalent button in the Claude UI) to store the instructions.

---

## Step 4: Use the Project

Open a **New Chat** inside your project. You'll see the project name in the header, confirming your instructions are active.

### Basic prompt (generating code from a PlantUML diagram)

Paste the following into the chat, replacing the PlantUML block with your own:

```
Generate Java for the following PlantUML. Put all classes in package storeA.

@startuml
title Bad Design A – Message Chain
class StoreMain {
  - inventory: Inventory
  + getInventory(): Inventory
  + printItemPrices(): void
}
class Inventory {
  - catalog: Catalog
  + getCatalog(): Catalog
}
class Catalog {
  + findBySku(sku: String): Item
}
class Item {
  + getPrice(): double
}
StoreMain --> Inventory
Inventory --> Catalog
Catalog --> Item
@enduml
```

Claude will respond with one `java` block per class. 

### Specifying a package

To separate Solution A and Solution B code in the same Eclipse/IntelliJ project, use different package names:

- `Put all classes in package storeA.` (for the first bad design)
- `Put all classes in package storeB.` (for the second bad design)

### If Claude tries to "fix" the design

If Claude refactors the design instead of following the UML exactly, reply:

```
Please revert. This assignment requires preserving the design exactly as shown in the UML, including any flaws.
```

---

## Step 5: Copy Code into Your IDE

1. Copy each `java` block from Claude's response.
2. In your IDE (Eclipse or IntelliJ), create a new `.java` file with the name shown in the comment at the top of the block (e.g., `StoreMain.java`).
3. Paste the code and verify it compiles.
4. If there are minor compilation errors (missing imports, typos), ask Claude to fix just those:

   ```
   The code doesn't compile because of a missing import for ArrayList. Please add it.
   ```

---

## Tips for Good Results

| Situation | What to do |
|---|---|
| Claude adds methods not in the UML | Ask: "Please remove any methods not shown in the UML." |
| Claude uses an unfamiliar Java feature | Ask: "Rewrite without [feature]. Use only basic Java." |
| You want to test an improved design | Paste the new PlantUML and say: "Here is an updated UML. Generate new code for package storeB." |
| You want to understand a flaw in the generated code | Ask: "Without changing the code, explain where the [message chain / class with multiple responsibilities / etc.] flaw is visible." |
| You need Eclipse project files | Ask: "Does this code need any special Eclipse setup, or can I paste it directly into a Java project?" |

---

## Reference: What Makes a Good PlantUML for This Project

Claude works best when your PlantUML:
- Uses `class` and `interface` keywords (not just notes)
- Explicitly marks visibility: `+` (public), `-` (private), `#` (protected)
- Specifies field types and method return types (e.g., `- name: String`, `+ getName(): String`)
- Uses association arrows (`-->`) rather than only text descriptions of relationships

