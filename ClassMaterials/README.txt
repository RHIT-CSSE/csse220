Basic things you need to know about the Schedule Generator.

- It currently lives outside of this repo. Amanda, Buffalo, and Matt have copies.

- It uses a small config.txt file to give the first day of the term and relative paths to the folders to your input and output files in the repo.

- To run it: python ScheduleBuilder.py

- order.txt in this folder gives the order of topics used to generate the schedule.

- projects.txt in this folder gives the start and due dates of each project ***Check and modify the number of days each project is given each term, because depending on breaks and which day of the week the class meets, it can generate weird due dates. 

- In 201820, we had it post all solutions to in-class code at the start of the term. 
Hardcoded SolutionPoster.py/shouldPostSolution() to return True.

It can easily be changed back to post it on the day they are done (the original design) by changing  SolutionPoster.py/shouldPostSolution() back.


