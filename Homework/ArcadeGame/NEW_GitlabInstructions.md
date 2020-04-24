# THESE INSTRUCTIONS ARE IN PROGRESS... DO NOT START YET

# Using Git for Your Arcade Game Project

For the arcade game project, you will be doing group development.
Therefore, we'll be asking you to use a source control system called
git.  You've already used git to checkout code/homework from the
CSSE220 repo, but for this project you will be managing a repo and
also using it to submit your homework.

# Step 1: Accepting the Github assignment.




# Step 2: Checking out the Repo OUT OF DATE

This step should be done by everyone in your team.

1. In your browser, go to https://ada.csse.rose-hulman.edu and verify
   that you have access to your project.  Copy the Repo URL.
2. Open your Eclipse and go to File > Import > Git > Projects from Git
3. Select "Clone URI"
4. In the URI field paste the URL you took from the website.  Host and
   repository path should get filled out for you
5. In Authentication, enter your rose credentials (you might find it
   convenient to have it save these for you) and hit Next
6. In branch selection make sure master is checked and click next
7. In local destination, you can configure anywhere you like *except*
   the directories that your existing CSSE220 repos are being checked
   out to
8. Select "Import existing eclipse projects" and select next.
9. You should see "ArcadeGameGit" on the list, make sure it's checked
   and select next
10. You should see a folder for ArcadeGameGit in your project browser

# Step 3: Test Push and Pull

Have *one* member of your team make a change and push it.  Here's how:

1.  In eclipse, edit the Main.java file (maybe edit the @author?
    whatever) and save it
2.  Right click on the project folder and select Team > Commit
3.  Verify that main.java appears in your list of "Staged Changes"
4.  Also add the .gitignore to your staged changes by selecting it and
    clicking +
5.  Add some text in the commit message
6.  Select Commit and push

Have *everyone else* on your team pull the latest version

1. Right click on the project folder and select Team > Pull
2. You might have to enter your credentials
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
6. Write click on the project folder and select Team > Commit
7. Manually move all your files into "Staged changes" with the +
8. Commit and push
9. Now have the original committer pull and they should have the
    merged version too
10. If they are any other members of year team, have them do step 4
    onward
    
# Step 5: Let's do this

You have the basics!

1. Have the team member who has the latest version of your source code
   copy all the files into ArcadeGameGit
   (hint: you can select files in the eclipse package explored and use
   right click copy and paste)
2. Test and verify that the game runs in its new project
3. Stage all the files, and then commit and push them
4. Have everyone else pull the changes
5. Verify that everyone has a running up to date game on their eclipse

Done!

# Good Advice for Minimal Merge Conflicts

* Pair program whenever possible
* Always do a Team Pull before you begin programming
* Always to a Team Commit/Push when you finish
* If you do have to resolve a merge conflict, remember you must
  accommodate *both* changes
