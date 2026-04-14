# BooksB log

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
   kidsRead
   kidsGradeLevels
   printReport()
   addKid(kid)
}
class Kid {
   name
   gradeLevel
   bookNamesRead
   bookAuthorsRead
   printReport()
   addBook(book)
}
class BookMain {
   handleNewReading(bookName, kidName)
   handlePrintReportForKid(kidName)
   handlePrintReportForBook(bookName)
}

BookMain -> "*" Kid
BookMain  -> "*" Book
@enduml
```

## Manual Edits

## Flaw Locations
### 1C
Location UML and Book Line 11 and Kid line 11
Book and kid do not store each other but rather information about each other thus duplicating data