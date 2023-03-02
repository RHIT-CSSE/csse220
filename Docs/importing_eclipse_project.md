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

## What if I accidentally imported everything (or prefer to import all at once)?

If you want to import all projects at the same time or did so on accident, 
see this guide to using Eclipse's "Working Sets":
[Eclipse Working Sets](eclipse_working_sets.md)