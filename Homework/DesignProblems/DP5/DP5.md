# CSSE 220: Design Problem 5 - Tag (Part 1/2)
***Tag!***
*We are designing a portion of a multiplayer tag game with some interesting features. There are characters and each character is designated a rendering color (blue, red, etc.) and a name. Characters may collide with circuit boards that may be collected (max of 4) and each circuit board has an ID and a total number of ports (ports are used to store power-ups) on each board.  Circuit boards carry power-ups, one per port. Characters can also collide with power-ups on the playing surface, and if there is an open port on any circuit board, the power-up can be attached to a board.  Once the ports are filled, no more power-ups may be added nor any discarded.  When characters collide, their power-up combinations determine who “tagged” whom. For simplicity, think of a complex “Paper, Rock, Scissors” type set of rules (or “Paper, Rock, Scissors, Lizard, Spock” if you’re a Big Bang Theory fan) for all the power-ups -- each power-up, or set therein, can beat some and lose to others. The set of rules for the power-ups are an implementation detail that is not important to our design, we simply need the names of the power-ups of each character to determine which character “won” the tag. Also, for simplicity, assume we only need to track the characters, circuit boards and power-ups (each with pertinent data); we will not worry about the rendering/drawing parts of the design or the playing surface (which could be 2D or 3D) or even the movement of the characters.  When characters collide, the winner name should be printed along with all the names of the winner's power-ups.*

## Bad Design A
<img src="DP5_A.png" alt="Bad Design A" width="1000"/>

[Source PlantUML](http://www.plantuml.com/plantuml/uml/VP0_Ry8m4CLtVmehKwWWwj2f0qA59KjXe68-x2EnwZ_H-IA44D-zG698ggfBOh-xzxjxNaG6ujPP4R-DRu30oSWdYzSl6NMlA0inoYrKPr63rnQNDH0eHbe6Qut6k3DSBmsfrl170DAvIXsVu70gLLShLvEEy2TW4uv8NyrlRnEEtN7ot_IDXHDIVZ0K-T4mbH5LyFeX9CI6ZEUTyHwfz8T03jW4dnzlIZ_hqiT-UELPg6032GyEXHhCJXidQuKyV8oOFsb3_GeiLyAtRe-qFfI-QJaAq3gzGnSy4Njr2EibUUvMgf1l_sl37e7Zcckan0g3o-HTxaEm25vSn1OgEPlBx2Lx9XNFp3CoLSspUVPQ56_PQ7qnl2H6F-AEBUxUOZvsZIgfVO5Ujyx-0000)

# CSSE 220: Design Problem 5 - Inventory (Part 2/2)
***Laptop Inventory System:***
EIT needs to keep inventory of the laptops from various professors that are currently being serviced by EIT. It is important for EIT to know the current OS version installed so that it can be updated while being serviced, if necessary. Also, EIT must track the laptop's owner. At the end of each workday the manager of EIT wants two different reports generated: 

  1.  A *service ticket report* that lists each laptop being serviced and includes: the laptop type (e.g., MacBook, Surface, etc.), its OS version, and its owner
  2.  A *laptop owner report* that just lists of all the owners of laptops currently being serviced by EIT

## Bad Design B
<img src="DP5_B.png" alt="Bad Design B" width="1000"/>

[Source PlantUML](http://www.plantuml.com/plantuml/uml/pPF1IiD048Rl-nH3JucQ5-X1YZs8e0QCU14FwsPCGxCpONRIKgJlRkkoL6ZLGY-z9lz-Cz-_x2Ie5HryPrndGu1xsoltTxH0KfPLjGgA7ZuD01GpItM7jqWeLh52MRGEdritHtt2daL3bXy8HcIv99GOYwbBRrlAh3HX39LAIythMmvWrWRCuIsAcfTKN8ykHZ2T2NkyOPx_dtsmxhXWDSY7TP4A1c8ZFqP1h05ug_9eFQR5usStY21fsM_8BoYXPHf3pSDxXmQ-ZNUeR8znzTVvM5ZpU_DPIkXqdvBbYPD2PPg--PKSriau5NQoRkISj-lkpa_tJQnpTPuWrTkN_WK0)
