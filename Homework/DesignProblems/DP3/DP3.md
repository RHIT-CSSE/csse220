# CSSE 220: Design Problem 3 - Spaceships
In a single player spaceship racing game, the mechanics surrounding ships are particularly important.  Each ship has its own current position, rotation, and velocity.  The game consists of a single player ship, controlled by the player, and several "enemy" ships controlled by AI.  Rotation and velocity can be increased or decreased to steer any ship. 
  - Ships controlled by AI are steered using a single AI strategy the depends on a *flying strategy*, that could be different for each enemy ship, which sets the rotation and velocity at regular intervals (say, every 10ms). 
  - The ship controlled by the player gets input from the player’s controller, which sets rotation and velocity. 

There are two commands to consider: 
  1. updatePlayerInput(inputData), which is called when a player presses a key on the controller 
  2. moveAllShips(), which first asks the enemy/AI ships to update their rotation and velocity and then updates the position of *all* ships in the game based on their current settings of rotation and velocity.

## Bad Design A
<img src="DP3_A.png" alt="Bad Design A" width="800"/>

[Source PlantUML](http://www.plantuml.com/plantuml/uml/NP31QiCm38RlVWhJKpgsLnZD68CUoih2TXUnICLSsLXA88oz--pCoq8lGlh_tv-H3gAGTBnw8v_44H9ShUZiCTT4_UAOteE8xIuKJq1iluorqSECwSXnr3m1lVYPUEWqWU8mP-a2x3o-HvU5yt-ueLAVGM6_XavXmjRxmfUcoEFoginF8EXUkJt-aHl9Qisiv4ro-UG6SWvItGvLYGUf5FEzMUrthI2a53YtAIZKTa8VUjAobg2-LQDbzr6D9jtRQPznPZtImwFTtUqMiZaWktp87m00)

## Bad Design B
<img src="DP3_B.png" alt="Bad Design B" width="800"/>

[http://www.plantuml.com/plantuml/uml/TP1DQWCn38NtFeN9AYdq2YKffP15Q67e0SHO9AAAR2nDm9JUlV8a7RfeDaBsU_hqirM3QjEPWtwI5AXmZcgDqMEbSLR2oA0QXnEL0v34hn3Z2IGnVfG4XkyC3UjUocHhwl4533QBwP0lk6FkvRhUXEy_k1a5zCgDv3XOTTYn-HVfbTaz_YnPoIYBfpKRtD8BSXx9kd-wpf7r6HJJcmnevaHljuWTTLDt-zzM_-jtzl79mtA3nwUuUbZDIuGjIl8x_G00)

