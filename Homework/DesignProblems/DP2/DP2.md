# CSSE 220: Design Problem 2 - Team Gradebook
This is a grading application for a hypothetical school's class. In this class, each student is a member of one or more teams - each team has a unique name.  For students, a name and email should be tracked. The teams are assigned grades for the work they submit.  Students only receive grades by belonging to a team and that team getting a grade. Since students can belong to multiple teams, a student's average is the average of all the grades earned by each of the teams to which that student is a member. The app will also track each student's absences.  There should also be a method to find all the grades a student has received across all the teams to which the student belongs. There should be a method to get a String representation of the best Team. NOTE that "best team" is different from the team with the best students. To find the best team, averages should be calculated using the grades FOR THAT TEAM - not including grades any students might have in a different team.

## Bad Design A
<img src="DP2_A.png" alt="Bad Design A" width="800"/>

[Source PlantUML](http://www.plantuml.com/plantuml/uml/dLF1QiCm33qlNs5wIiUs3mYZj6MZbx5BToizAB78lDhEi9H06Ftt4JTUdU31M2u9qilJUy_ocXWSjqPdT5Bs4nmOGTnh5CHELRvJQI0IRmXcvq1YsJGdSJXyG0S5nyM72UHu55_PpJjOgN4ZvPvRYPPpkhnVmM0XzkoKhU_4M7mse7IeBiD7HB8f2Ms5Sv8aV8SymYc9Jz0F-lF1qbITGLEY6sfKY8rpqByeuiTBUnKHrSYZpMq_m7Cx7-YRqKIVLc9aFTGB8Pksr9Yqrg63-iz9R97OkxisnVZyQF7f_-Typj66_BuOVX_2qBdZqF36fp4_-GnM0J7HaZgFAnLw5mdB48AVnzmrIiR_XvIN0HDJx2CXESRH1APpDhqqzoknk5tudB8rMjaQ_Gq0)

## Bad Design B
<img src="DP2_B.png" alt="Bad Design B" width="800"/>

[Source PlantUML](http://www.plantuml.com/plantuml/uml/dLF1Ji9043tBLsmuWL4_e344Y8QByO8tmc7AJcfbTsjsfYJ4-E_IxIxTcZaOEHGox_7UpBpfaXWyjzPCw5YxJ_1W5V7PuENfwqD03WQ8r1k2tNZGM3RDKUrs7t22WlFYmuYotwkloSqxE6rmfVMMMusEPzH_luB5Gcql7gwwKx7uRA4sgJfFFpAHLKde3lXBHAPla2ET1Buet_K_wqOQTsVHbkYx6XLgvJsSNshYnnvUP48LSXnpVUxeCpSsZ63c6BObM5PTlL2wQKk3ucWdz53zUHDh90xJ3Q2AdsilOVl_oUSxNaWSJxwD28QhIDQ2Ly84ompC5pO66WQJOYzKxJX1OQNZ09_2TXS30qChmeuW9TK7qcjTQAUcrldV0ua4WMf8R9vYpTNJOGkQ4Ggg-Jo4t2U6tPEIfQ3Gq_Aynk_o_K9DRwVNwroYqwqrFm00)

