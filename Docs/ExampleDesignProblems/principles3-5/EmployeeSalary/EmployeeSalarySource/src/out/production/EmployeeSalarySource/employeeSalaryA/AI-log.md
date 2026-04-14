# SpiritesB log

## Versions 
Windsurf: 1.13.9
AI Used: Claude Opus 4.6

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

class Main{
  handleUpdateEmployeeSalary( name, salary )
  handleGetSalary(name ): double
}
class Employee{
  name: String
  managerName: String
  isManager: boolean
  salary: double
  setSalary( salary: double)
  getSalary() : double
}
Main-> "*" Employee
@enduml
```

## Manual Edits

## Flaw Locations
