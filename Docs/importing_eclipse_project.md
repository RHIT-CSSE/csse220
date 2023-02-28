---
title: Importing an Eclipse Project
---

# How to import an existing Eclipse project from your CSSE220 Repo

## Requires:
- These instructions assume you have already cloned the [CSSE220 Repo](https://github.com/RHIT-CSSE/csse220.git)
- Only once do you clone the CSSE220 Repo. This cloned repo resides on your machine. From then on, you import Eclipse projects (e.g., HW1) from the clone residing on your machine
- These instructions will not work if you have not already cloned the CSSE220 Repo

***

## Instructions:

1. Start Eclipse
2. Go to *File > Import* in Eclipse's menu bar
3. Select *Git > Projects From Git* from the folder list and click *Next*
4. Select *Existing Local Repository*
5. Select your cloned repo from the list of repos located on your machine and click *Next*
6. Select *Import existing Eclipse projects* and click *Next*
7. Click *Deselect All*, then:
   * Use the project search box at the top of the list of projects to search for the project you want to import
   * For example, type *HW1* into the search box to find the HW1 Eclipse project
   * Check the box located in front of the desired homework (e.g., *HW1*) and then click *Finish*
8. The Eclipse project you imported will show up in Eclipse's *Package Folder* pane

## Eclipse Working Sets:

1. If you prefer to import all projects at once, or did so by accident, there is a way to set up "folders" for Eclipse projects
2. Make sure to select the "Package Explorer View" NOT the "Project Explorer View"
3. To verify you have the in Eclipse Select Window->Show View->Package Explorer (If for some reason it is not an option select Other->Java->Package Explorer)
4. From the Package Explorer, click on the small icon with three vertical dots, then select Top Level Elements->Working Sets
5. After that, click the three tiny dot icon again and select "Configure Working Sets"
6. Create Working Sets for all the major categories of projects we will have in CSSE220:
 * PracticeSolutions (move all items that start with PracticeSolution here)
 * Practice (move all items that start with Practice but NOT PracticeSolution here)
 * Homework (move all items that start with HW here)
 * SampleExam (move all items that start with SampleExam here)
 * Current (we will use this to select the current proejcts for the day we will use)
 * Completed (we will move completed project here to remove the clutter of too many projects )
7. As described above you can move all the projects into these folders
8. As you work on Practice project (in-class exercises) you can move them to Current
9. As you complete Practice projects (in-class exercises) you can move them to Completed
10. Any projects you import such as Exams will be imported in the "Other" working set by default
