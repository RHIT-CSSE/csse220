# CSSE 220: Design Problem 2 - Vapor Video Game Sales
Vapor, the popular video game digital store, has hired you as a consultant to design a sales management application. Each game available to purchase through Vapor has a title, ESRB rating (e.g., "T" for "Teen"), and price, all of which are fixed. You may assume game titles are unique. 

Vapor also sells game _bundles_, which complicates their sales records (hence why they hired you instead of designing the application themselves). Each bundle is a set of games with a clever name (e.g., "Boom Bundle 2") and price (less than the sum of the individual game prices) determined in advance by the marketing team. Every bundle contains at least two games, and a game may appear in more than one bundle. You may assume bundle names are unique. 

For any given bundle, Vapor wants to be able to generate a report including the bundle's name, included game titles, how many times the bundle was purchased, and the total revenue from that bundle. 

Also, Vapor wants to be able to produce a sales report for each game, including how many times the game has been sold individually or as a bundle, as well as the total revenue from that game. For calculating total revenue, Vapor distributes the sales price of each bundle evenly across all games in the bundle. For example, a bundle of four games sold for $60 should count as $15 of revenue for each game. 

Finally, Vapor wants a method to determine the game with the highest total revenue and a method to determine the most popular (i.e., most copies sold) bundle. 

## Bad Design A
<img src="DP2_A.png" alt="Bad Design A" width="800"/>

[Source PlantUML](http://www.plantuml.com/plantuml/uml/XPBDQW8n4CVlUOhWoHRx0b94xK4F5Ohh2uncs0tDnv9C12bzzyw6B6xOGozA9l-F7vdTHe90oHeHlxNh8O2LaHu6-JVeMxuHDmCnoWOCnXCuQ3787t5DJl5WBOyGknFqxmqRNBkIkn3WyQaZbSbc8qG7WtYdr04iBacJmRKS3G68_v_ddelvMlbqDVWopfyP-zoyRC7YHTF0CEzSIGSM_yiSmHeqPavMLHTLwPw6pzA--413N7wnC_O-q2pvxhMQwdDmvQWwAiC1wQZR3YETyOukOMQVuXRLdYK3DGyB-0JsLuoR7UoyqGfHr5iHrGCAb-o7xpN6nXkrbimlnCtRFX5UF84fN5nN74DRzG6zRHQlYzmijkXKikOF)

## Bad Design B
<img src="DP2_B.png" alt="Bad Design B" width="800"/>

[Source PlantUML](http://www.plantuml.com/plantuml/uml/hPB1Ri8m38RlUOg8ozZ4NW1D2DY17RPfehn0HgmIpKcgn4524-y-XxOYBT9ssQLf_Dk_lzfTHbA1aaKHlunhL51MHZeXy3EO_KKHUrGnoaeXn3VbL0r1VWjnK4uZhBJUA0jJCeGmbnLNkNecWo8-h_U6pLZMFdqYtFVngySwvPTfpLQxx1JdSXM2EhsQI4zjyc8c7Sj_UVPW5I3UaerRvwokTsb-u_R15yfsbobieV61RfoFtkWolpKkAiOzYe8Dq8kf3n1f2qTm2IxiOrpEMdDAfkPW1rx0daM_hLpEMneWYk5Mn620mYNxx1i3iVAevvBvXRYJDT1xAUHkMTfxsoI2dIU57J5BlTUvnsWH6QJuyd7ZNvV-trY3l_XnCNcOT8oYFRfO7fzOWjF9uWy0)
