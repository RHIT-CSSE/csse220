# Using Git for Your Arcade Game Project

For the arcade game project, you will be doing group development.
Therefore, we'll be asking you to use a source control system called
git.  You've already used git to checkout code/homework from the
CSSE220 repo, but for this project you will be managing a repo.

# A video walk through of this process can be found here:

[Video walkthrough](https://rose-hulman.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=b91558fb-1f30-4269-b6d5-abaf015fb139)


# Step 0: Create a github account (if needed)

1. Go to: https://github.com/join
2. Create an account with the following username: rhit-student
3. Be sure to replace "student" with your Rose-Hulman username.

# Step 1: Accepting the github assignment

1. Check your email for a link to accept a github assignment from your professor
2. It will look something like this:  https://classroom.github.com/g/xyzabc
3. Click "Authorize github"
4. Join the team number defined by your instructor (or create one with the correct name, i.e. team11 )

# Step 2: Checking out the Repo

This step should be done by everyone in your team.

1. In your browser, at the top of this page, you should find a green 
button you can use to copy the URI of this project to your clipboard.

![Checking out repo](https://github.com/RHIT-CSSE/csse220/blob/master/Docs/misc/checkout_repo.PNG)

2. Open your Eclipse and go to File > Import > Git > Projects from Git
3. Select "Clone URI"
4. It should automatically get filled out for you, but if not, in the 
   URI field paste the URL you took from the website.  Host and
   repository path should get filled out for you.
5. In Authentication, enter your GITHUB username and password (you might find it
   convenient to have it save these for you) and hit Next
6. In branch selection make sure master is checked and click next
7. In local destination, you can configure anywhere you like *except*
   the directories that your existing CSSE220 repos are being checked
   out to
8. Select "Import existing eclipse projects" and select next.
9. You should see "ArcadeGameGit-00" on the list, make sure it's checked
   and select next
10. You should see a folder for ArcadeGameGit-00 in your project browser

# Step 3: Test Push and Pull

Have *one* member of your team make a change and push it.  Here's how:

1.  In eclipse, rename your project to have your team number instead of 00.
    Right Click on ArcadeGameGit-00 then Refactor->Rename:

![Checking out repo](https://github.com/RHIT-CSSE/csse220/blob/master/Docs/misc/rename_project.png)

![Checking out repo](https://github.com/RHIT-CSSE/csse220/blob/master/Docs/misc/rename_project_with_number.PNG)

2.  Right click on the project folder and select Team > Commit
3.  Verify that .project appears in your list of "Staged Changes"
4.  Also add the .gitignore to your staged changes (if not already) by selecting it and
    clicking +
5.  Add some text in the commit message
6.  Select Commit and push

Have *everyone else* on your team pull the latest version

1. Right click on the project folder and select Team > Pull
2. You might have to enter your GITHUB username and password
3. You should get the updated files

# Step 4: Cause a Merge Conflict

Have *everyone* in your team

1. Edit the same line of code in a different way.  Say add your name
   to the println.
2. Attempt to commit and push.
3. The first person who does it should succeed.  The rest should get
   a "rejected non-fast-forward" error.

For one of those those who failed: 

1. Right click on the project folder and select team > Pull
2. You should see a message about conflict and things will look sort
   of scary
3. Look at the edited file.  You should see that both versions of the
   code are there plus some <<<<< ===== >>>> lines
4. Figure out what the *combination* of the changes ought to be
   (probably all your names in the println) and edit the file to be
   correct, deleting all unnecessary stuff
5. Test your code and make sure that everything works as expected
6. Right click on the project folder and select Team > Commit
7. Manually move all your files into "Staged changes" with the +
8. Commit and push
9. Now have the original committer pull and they should have the
    merged version too
10. If they are any other members of year team, have them do step 4
    onward
    
# Step 5: Let's do this

You have the basics!

0. Do this only if you already have some version of coding running.
1. Have the team member who has the latest version of your source code
   copy all the files into ArcadeGameGit-**
   (hint: you can select files in the eclipse package explored and use
   right click copy and paste)
2. Test and verify that the game runs in its new project
3. Stage all the files, and then commit and push them
4. Have everyone else pull the changes
5. Verify that everyone has a running up to date game on their eclipse

Done!

# Good Advice for Minimal Merge Conflicts

* [Pair program whenever possible](https://rose-hulman.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=ddab27fc-a8a4-4cd0-a8f8-abaf013a3f22)
* Always do a Team Pull before you begin programming
* Always to a Team Commit/Push when you finish
* In Eclipse: Right Click -> Replace With -> HEAD Revision is a nice way to remove 
  your local changes before doing a Team->Pull if you don't care about
  the local version of your code and just want to get your partner's version
* If you do have to resolve a merge conflict, remember you must
  accommodate *both* changes 

# Git bash

* A more advanced and full feature program can be used to use [Git for Windows](https://gitforwindows.org/)
* MacOS and Linux have terminal/consoles that can interact with git natively
* There might be times when using these toola will be easier than Eclipse alone
* You are welcome to install it, but in most cases it should not be required
* More about git: [git-handbook](https://guides.github.com/introduction/git-handbook/)
