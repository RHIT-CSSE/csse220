# SuperComputerA log

## Versions 
Windsurf: 1.13.9
AI Used: Claude 3.5 Sonnet

## Chat Prompts
### Prompt 1
You are a code generator. I will give you PlantUML for a deliberately BAD design.
Rules:
- Generate minimal Java that follows the UML EXACTLY, including the SAME class names, fields, and methods.
- Do NOT improve the design. Preserve the flaws (e.g., message chains, God classes, type switches).
- Use default package (or tell me how to put into package X if I say so).
- Keep methods tiny, just enough to compile and make the flaw obvious.
- Provide one simple Main class that exercises the flaw in 5–10 lines.

Here is the PlantUML:

```plantuml
@startuml
skinparam style strictuml

class SupercomputerMain {
  handleProcessNextDataset()
  handleSubmitTask(name, priority, email, datasets)
  handleUpdatePriority(name, priority)
}
class WorkQueue {
  updatePriority(name, priority)
  submitTask(name, priority, email, datasets)
  findNextDataset()
}

class DataSet {
  taskName
  taskPriority
  taskEmail
  data
  computeEstimate()
  processDataset()
}

SupercomputerMain -> WorkQueue
WorkQueue -> "*" DataSet
@enduml
```

### Prompt 2
fix the files in the package supercomputerA to use the dataset object instead of the generic java Object class

## Manual Edits

## Flaw Locations
### 1A
no Task Class
Location UML
### 2C
Duplication of tastName, Priority, email
Location WorkQueue Line: 7