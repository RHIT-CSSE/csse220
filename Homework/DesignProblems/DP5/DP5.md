# CSSE 220: Design Problem 5 - Inventory
***Laptop Inventory System:***
EIT needs to keep inventory of the laptops from various professors that are currently being serviced by EIT. It is important for EIT to know the current OS version installed so that it can be updated while being serviced, if necessary. Also, EIT must track the laptop's owner. Each device comes with an extra as follows:
  - SurfaceBook owners get a pen, for which we track the pen's model number.
  - MacBook owners get a trackpad and the condition of the trackpad should be tracked.
  - ChromeBook owners get an unlimited number of speakers to use with the Chromebook and the number must be tracked.

At the end of each workday the manager of EIT wants two different reports generated: 

  1.  A *service ticket report* that lists each laptop being serviced and includes: the laptop type (e.g., MacBook, Surface, etc.), its OS version, and its owner
  2.  A *laptop owner report* that just lists of all the owners of laptops currently being serviced by EIT with their respective extra device information.

## Bad Design
<img src="DP5.png" alt="Bad Design" width="1000"/>

[Source PlantUML](http://www.plantuml.com/plantuml/uml/nPBDQZ8n58RtSnN1LURxz0PS5Ac5KgXLEj9zcfngc4mIJZAAbDvxCyOGhVP7X7OpY-ITvvtpd1avpz2tZIguOiwHUsQziNTw1TeRt5GRvw4XhmKXPB1aMYYu1Gt8F5I0AybXBdaD_X6iGUzeUI8OaTEr1emnMfBYhI35wQw1C6izkEhzwv7n4aq3ryRKtsSdZFyiMBNumdYa5hkfSz5kL1BYW0-iWI6fF4gzYCUyHGpWgGtS9q0dZHuIOTfd1J7WBB0wlDasGoArBqXt_3_pwH6u_nMq_n5ORdcBptT0KyAFZx6qJE0KcgRFeMMUD5vLkPcMSPgmjMWiwhvSbqV6wnaJOwE5zE7w1Xp71DdPYrtdgqlm0-Ol2fplzrFHFQNjXip9B3J_bXTBjQ0dHe3gDdTeCfUSRpDH_q3aR5kj80n4zzsDG8ksKUy0)
