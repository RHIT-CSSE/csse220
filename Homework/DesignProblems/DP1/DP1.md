# CSSE 220: Design Problem 1 - Online Quizzes
In an online quiz application, teachers update quizzes and students take them.  Quizzes and questions have their own unique id number. The same quiz question can appear in multiple different quizzes.  If a teacher updates the actual query made by a quiz's question, it's important that this update to the query is reflected in all quizzes that utilize that question. A student takes a quiz by providing a quizId to the app at the time of taking the quiz.

## Bad Design A
<img src="DP1_A.png" alt="Bad Design A" width="800"/>

[Source PlantUML](http://www.plantuml.com/plantuml/uml/RP31Ja8n44NtynKtR0IL7s1XC75Z8b62VC24LfXGva4xNQZntssfaFSIDvDfJywzQTDUzCYH3qZs6NoPKJQM3u5edenZMs_m5bXjlNZ1HnVnga7KOvdb2wikP9DEyKYq2PpI-Nh1elWc07SxLXVy-kZOV4NBx5CLngU_vTdDHEqUb_CJ6y-miYYwdVGYtdb_3XYVoYWIYZMXdtvjgvJ6-gWb3p7mRsNLha-OHjdkRFemkXrTK-Yo36XLYEPUNVsnNm00)

## Bad Design B
<img src="DP1_B.png" alt="Bad Design B" width="800"/>

[Source PlantUML](http://www.plantuml.com/plantuml/uml/RP1DJiCm48NtFiLJDr2W5-W2WSG6YGggqWECQjEEuao2FLuGnDtn3w20s4IJ-VIz9q_iM4OAr2FgctVv6_YWgVV6t4IbqCOpF7aItMyUy384F8fdSTWcdh0RV58U1BV673p5MDSROi6x0N1v8h7UxKTBwWhQ9XUBSFxwDTpRDOjUuVl_ZfJMs6bWEIvd4S_KrO0iyfGbP6jfFkQrhP8RcwEM_1i3_rOMxUS9gy37awwk5nUBMb39dssBCFbWJcmvroS0)

### Hint
Both designs have the worst kind of problem: *they don’t function*.