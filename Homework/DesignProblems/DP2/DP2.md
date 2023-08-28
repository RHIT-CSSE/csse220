# CSSE 220: Design Problem 2 - Vapor Video Game Sales
Vapor, the popular video game digital store, has hired you as a consultant to design a sales management application. Each game available to purchase through Vapor has a title, ESRB rating (e.g., "T" for "Teen"), and price, all of which are fixed. You may assume game titles are unique. 

Vapor also sells game _bundles_, which complicates their sales records (hence why they hired you instead of designing the application themselves). Each bundle is a set of games with a clever name (e.g., "Boom Bundle 2") and price (less than the sum of the individual game prices) determined in advance by the marketing team. Every bundle contains at least two games, and a game may appear in more than one bundle. You may assume bundle names are unique. 

For any given bundle, Vapor wants to be able to generate a report including the bundle's name, price, included game titles, how many times the bundle was purchased, and the total revenue from that bundle. 

Also, Vapor wants to be able to produce a sales report for each game, including how many times the game has been sold individually or as a bundle, as well as the total revenue from that game. For calculating total revenue, Vapor distributes the sales price of each bundle evenly across all games in the bundle. For example, a bundle of four games sold for $60 should count as $15 of revenue for each game. 

Finally, Vapor wants a method to determine the game with the highest total revenue and a method to determine the most popular (i.e., most copies sold) bundle. 

## Bad Design A
<img src="DP2_A.png" alt="Bad Design A" width="800"/>

[Source PlantUML](http://www.plantuml.com/plantuml/uml/XPBTQW8n48NlynJ1Arli2on5r5xeHONY-WAZEwoX-Gd9f22bxzxPa4N3zkTcbypC-SuXarKa29IC5l5TMGy1Z8nqrSZVeCwv8yuQOfGjQ8nxiD1Za9_Yb6p7XKRk85xsu9zR5jX-8TSXmFLLHIgLvLA82mp3wwxRWi4vATBOo54GWFX_EtisvdRdqadZmrY_CJRPUTupwZYGOZFrN4ZBxN-P1TgYrjDabNMPAjxty0djZGyquFAD7T2xG7-JioAZAmsx_2hP8krKVy581_n0cp3d_s5gmoD3SYwMy7U1lyIutK7EMwrYYdepehf4OPDvSLvXR9tk6gaiCSiPdmYFZa2NN6mtAjYjUaHFozdZB3kB5Tek6VqD)

## Bad Design B
<img src="DP2_B.png" alt="Bad Design B" width="800"/>

[Source PlantUML](http://www.plantuml.com/plantuml/uml/hPB1Ri8m343l_eg8ozZ4VW1D2DY17RPfelo0HwqIpKsgn9c49lvzIGcY4OXTTccQs7v-ZJltWav2o-2_jEdGOQkyx9dYq-bj7u4je_UgGYR_XWORSke7O8UcPbhKzGfR6eiMfgcgOfLf9igXnFMyxo8iXciRFfdkJ-TdnZAabt4JKPj4ybErS0xthzhBqp5vDb4cXlzaPcX5p9TcHUkSbNiFuHUqZxYHXEjlOKsTTNABd2jwT55JTYbBLYGlkjcHbpLzamdK-r_9MiQKP1uFi_n0-02dYQNoEAb24yh9G769O4BxR3jDlh9SJvKs0d2d6fBtOI1rIw6jRRiWjB62d8rJABCE9urUCOdaRx_M-ERW_rkh-9CVPwE7KNQ4uvBFqlN1d4mTMlu5)
