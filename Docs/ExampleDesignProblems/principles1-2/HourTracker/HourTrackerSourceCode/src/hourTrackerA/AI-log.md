# HourTrackerA log

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

class HourTrackerMain {
handleStartWork(employeeId, startDateAndTime)
handleStopWork(employeeId, stopDateAndTime)
handlePrintPayReport(employeeId)
  }
class WorkLog {
  employeeId
  startDateAndTime
  stopDateAndTime
}

HourTrackerMain -> "*" WorkLog
@enduml
```

## Manual Edits

## Flaw Locations
### 1A
Location WorkLog
A does not store name, social security #.  Putting that in worklog would cause data duplication.

### 2A
Location UML
No Employee class, not storing employee information properly for functionality
