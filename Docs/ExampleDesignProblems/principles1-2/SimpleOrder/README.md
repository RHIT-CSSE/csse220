# Simple Order

## System Description
A particular company tracks orders for items.  When an order is placed it consists of a customer name, a list of item ids, and a list of quantities.  For example and order "Steve", [30012,30044], [1,2] would mean Steve has ordered one of item 30012 and 2 of item 30044.  The ordering system keeps track of all the items that can be ordered - each item has id, name, and (per item) price.   When an order is placed the system gives order id that can be used to identify the order later.  Using that order id, the user can at any time display a report containing the names and quantities of all items ordered, the price of each item, and the total price.

## Solution A
![Solution A UML Diagram]()

[PlantUML link](https://www.plantuml.com/plantuml/uml/TL1BYa8n4DptAO8htw1N60JTl8M_cRb0yz8mZVcPxeV8uDqdYQ8Yk0b5LNLNL-J08M56RqJFZigRUT3HEu25AEO61uSYvfjzShJDbl8QEPW_-CLW7MterCXfG4ypmqg-jp8pnn63iZ99TtEkM9B3StD_KOfPfx7YtdPmWLjCN-RBRhPGzq4gzz13RRCFjOPj2f26TjLxXVjxE0mnb5RZeC-vNQ5h7QMVgEYMKIftWTUIyqyp-PXSZtedDW8M56pzjty0)


## Solution B
![Solution B UML Diagram]()

[PlantUML link](https://www.plantuml.com/plantuml/uml/TL1BgW913Dpd58qhH_GA8lWsir11lK2O3hpm-cSdWmpYtUrk1KLucn2gAfLAv8z3mepUY4wEIiqywEWTm4OKSsi7XoBcn3uvEcHBUOSSp0r-CLX7UxesS1xGqzAmak-jBCrbnA2iJDAzb3yioU7Kr4TACUiyrhwt7TpXjQOlyyMRBLG_I2KFlTas-sQ764hYST1Fpwx0DQhIEIgwRPIAtU7xWDNQp1QpvyB_o0P0gvzws52mzJKF)
