# BooksA log

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

class Book {
   name
   author
   printReport()
   addKid(kid)
}
class Kid {
   name
   gradeLevel
   printReport()
   addBook(book)
}
class BookMain {
   handleNewReading(bookName, kidName)
   handlePrintReportForKid(kidName)
   handlePrintReportForBook(bookName)
}

BookMain -> "*" Kid
Kid "*" <-> "*" Book
@enduml
```

## Manual Edits

## Flaw Locations
### 1B
Location UML and BookMain line 33
Bookmain has no global list of books so has to iterate through every kid to find the book
Very inefficient and violates storing the required information in BookMain