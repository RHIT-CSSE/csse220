A guide for how to setup a new version of CSSE220.

# Getting yourself capable of locally demoing website

Not 100% needed but will save you some agony if you can do it

1.  Install ruby and rubygems

2.  Install bundler (this tracks versions of gems for individual projects)

        gem install bundler

3.  Load up the various gems needed

        bundle install

4.  Try running the website (should be visible on localhost:4000)

        bundle exec jekyll serve --watch
    
    "make demo" should do the same thing 

# Generating the new schedule

1.  Edit the moodle link in ../_config.yml

2.  Edit the dates in date_convert.rb and deploy a new date file to
    the data directory
    
        ruby gen_dates.rb > ../_data/date_convert.yml 

3.  Make any changes you want in schedule.yml

4.  Update the dates in ../_data/assignments.csv - take care that your
    spreadsheet doesn't munge the date format

5.  You should see your updates on the schedule page.  Tweak the dates
    till you're happy.

# Moodle

1.  Pick a single course to be the "master" 220 (usually it's CSSE220-01)

    Change the name of the course to CSSE220 ALL SECTIONS or similar

    For all other courses, Go to Course Administration > Users > Enrollment Methods
    
    Connect to the other courses using a course meta link (you must be
    an admin of linked course to do so)

2.  Import a previous version of 220 to get yourself started

    Course Administration > Import
    
3.  Update dates of all assignments 

    Course Administration > Reports > Dates

