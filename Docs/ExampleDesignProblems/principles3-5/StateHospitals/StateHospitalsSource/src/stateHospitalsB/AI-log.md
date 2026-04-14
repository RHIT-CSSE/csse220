# StateHospitalsB log

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

class Main{
  handleReportSubmission(stateId, hospitalId, type, data )
  handleDrawMap(stateId)
}
class StateData {
  id
updateReport(hospitalId, type, data)
computePartialScoreForReportA(dataA):double
  computePartialScoreForReportB(dataB):double
computeAggregateScore(hospitalId)
drapMap(graphics)
}

class StateMap {
  roadDataForDrawing
  borderDataForDrawing
  computeColorForScore(score)
  drawHospital(graphics, position, score)
  drawMap(graphics)
}

class Hospital {
  id
  latitude
  longitude
  latestReportAData
  latestReportBData
  getPosition()
  setReportA()
  getReportA()
  setReportB()
  getReportB()
}
Main-> "*" StateData
StateData--> StateMap
StateData--> "*" Hospital
@enduml
```

## Manual Edits

## Flaw Locations
### 2B
Location Hospital
Uses ask methods instead of operating on thier own data