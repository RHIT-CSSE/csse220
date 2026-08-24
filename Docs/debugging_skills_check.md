# Debugging Skill Check
- As stated in the syllabus, to earn a grade of C or better in the course, you must complete a debugging skill check (DSC). 
- Each DSC takes 5-15 minutes and can occur during normal office hours or a separate appointment. 
- You only need to pass one DSC, and you are permitted up to three attempts (at most one per week). 
- The earlier you get comfortable debugging, the faster you will be able to fix your bugs throughout the course, so consider attempting a DSC within the first few weeks. 

## DSC Process
1. When you arrive for a DSC, you will be sent a ZIP file via Teams containing a Java project. 
2. Disable Suggestions/Hints/Inspections in your IDE. In IntelliJ, go to `Settings > Editor > Inspections` and disable all in the "Java" category. 
3. Open the Java project in your IDE. In IntelliJ, go to `File > Open... (Ctrl+O)`, then select the (unzipped) project folder. 
4. Run the provided JUnit test(s), and review the failure message(s). 
5. Set a breakpoint on the ***first*** assert statement that fails. 
6. Run the debugger and use the IDE's step into/step over features to navigate the failing test case. 
7. Identify and fix the bug. 
8. The DSC is complete when all JUnit tests pass. 

## DSC Evaluation
Each DSC is graded "Met" or "Not Yet". To earn a "Met", you must satisfy each of the following criteria: 
- [ ] Set a breakpoint in the correct place
- [ ] Use both "step into" and "step over" debugging commands correctly
- [ ] Identify and fix the bug within a reasonable time frame
- [ ] Verbally explain debugging thought process correctly and clearly

If you earn a "Not Yet", no big deal; just set aside some time for additional practice with the debugger, and try again next week. 

> [!NOTE]
> Since the given buggy methods are intentionally kept short, you might see the bug without needing the debugger. However, the goal of the DSC is to make sure you can use the debugger effectively, so you will not earn a "Met" if you directly fix the bug without using the debugger. 

## DSC Clean-up
After each DSC, you should:
- Delete the project files so you are not tempted to share with peers. 
- Remind your instructor to delete the project ZIP file from Teams. 
- Restore your IDE's defaults for Suggestions/Hints/Inspections. In IntelliJ, go to `Settings > Editor > Inspections`, select the gear icon next to the "Profile" dropdown box, and select "Restore Defaults".  
- (Optional) After your successful DSC, remind your instructor to let you select a celebratory debugging sticker. 

