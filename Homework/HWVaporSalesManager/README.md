# HWVaporSalesManager - Implementing Design Problem 2

## Overview
In this assignment, you will implement the sales manager for Vapor video games (Design Problem 2). This is a _Pair Programming_ assignment: you will work in a team of two, alternating Navigator and Driver roles so that each person has each role at least twice. Why? Because you will be working on a multi-week team project at the end of this quarter. Now is a good time to start building teamwork skills and looking for possible final project teammates. 

There is a _Manual Part_, which you must complete without external resources beyond the Java API Docs and CSSE 220 course materials. Then, there is a _GenAI Part_, in which you will use a GenAI tool to add some features and write a brief report on the experience. 

You and your partner should write all code on one of your machines, then send the final version (after submission) to the other person via email or Teams for future reference. If you split the work across more than one session, consider sending intermediate versions of the code too. 

## Content Learning Targets
_After completing this assignment, you should be able to say:_
- I can develop new objects, complete with fields and methods. 
- I can implement a small object-oriented application given a UML class diagram, system requirements, and unit tests. 
- I can interpret unit test results and apply them to accelerate the debugging process. 
- I can review code that I didn't write with respect to design principles and documentation/style guidelines. 

## Process Skill Goals
_During the activity, you should make progress toward:_ 
- Forming shared understanding of system requirements with a teammate. (Teamwork)
- Writing reflections with technical detail on the software development process. (Communication)

## Rubrics:
Your overall grade for this assignment comes from these parts: 
1. (50% of grade) *Manual Part* unit tests passed (percentage)
2. (10% of grade) *GenAI Part* unit tests passed (percentage)
3. (30% of grade) *GenAI Part* written report
4. (10% of grade) *Commenting & Conventions*

### 3) Written Report Details
Complete the report template in [VaporSalesReport.docx](./VaporSalesReport.docx). 
**TODO: Additional rubric details**

### 4) Commenting & Conventions Details
To earn full credit for *Commenting & Conventions*, follow the style guidelines in [the CSSE 220 Grading Guide](../../Docs/grading_guide.md). In particular, make sure you add Javadoc *class-level* comments at the top of each class: `SalesManagerMain`, `Game`, and `Bundle`. 
For this assignment, you do NOT need Javadocs for every method. 

## To do:
1. Import this project (HWVaporSalesManager) from your local copy of the CSSE220 repo into your IDE.  
2. Modify the classes `SalesManagerMain`, `Game`, and `Bundle` to implement the required functionality. You may use your own DP2 solution, or you can refer to the DP2 solution we provided in class or via email (the delivery method varies by quarter). 
3. Run the included JUnit tests to ensure your solution passes all the unit tests - do this by running *RunAllManualTests.java* and *RunAllGenAITests.java*
4. Upload one copy per team of the completed *.java* files to this assignment's drop box: 
    - *Game.java*
    - *Bundle.java*
    - *SalesManagerMain.java*
5. Upload one copy per team of the written report, [VaporSalesReport.docx](./VaporSalesReport.docx), to this assignment's drop box. 

## Notes
### The Manual Part (required to be done with no external resources such as GenAI, StackOverflow, etc.)
In this program, you are implementing a video game sales manager for Vapor, a hypothetical digital game distributor. This application will keep track of sales of games and game bundles.  From the [Design Problem 2 instructions](../DesignProblems/DP2/DP2.md):

> Vapor, the popular video game digital store, has hired you as a consultant to design a sales management application. Each game available to purchase through Vapor has a title, ESRB rating (e.g., "T" for "Teen"), and price, all of which are fixed. You may assume game titles are unique. 
> 
> Vapor also sells game _bundles_, which complicates their sales records (hence why they hired you instead of designing the application themselves). Each bundle is a set of games with a clever name (e.g., "Boom Bundle 2") and price (less than the sum of the individual game prices) determined in advance by the marketing team. Every bundle contains at least two games, and a game may appear in more than one bundle. You may assume bundle names are unique. 
> 
> For any given bundle, Vapor wants to be able to generate a report including the bundle's name, price, included game titles, how many times the bundle was purchased, and the total revenue from that bundle. 
> 
> Also, Vapor wants to be able to produce a sales report for each game, including how many times the game has been sold individually or as part of a bundle (e.g., "TeamCastle has sold 27 copies individually and 44 copies as part of a bundle"). 
> 
> The game's sales report should also include the total revenue from that game. For computing total revenue, Vapor distributes the sales price of each bundle evenly across all games in the bundle. For example, a bundle of four games sold for $60 should count as $15 of revenue for each game. 
> 
> Finally, Vapor wants a method to determine the game with the highest total revenue and a method to determine the most popular (i.e., most copies sold) bundle. 

To run this app, run *SalesManagerMain.java* as a Java application. 
To test this app, run *RunAllManualTests.java* and *RunAllGenAITests.java* as JUnit tests. 

The interface for this program is entirely text-based and the example input/output (below) will give
you an idea of how the program will work. The green\* text is user input, and the rest of the text is the program output:

\**GitHub may not show this text as green, but if you view the README in your IDE or copy/paste the raw Markdown content into [Markdown Live Preview](https://markdownlivepreview.com/), the green text will be green.*

<pre>
Welcome to the Vapor Sales Manager.  Enter commands.  Type 'exit' to end. 
<font color="009900">add-game MoonCraft E 27.49</font>
ok
<font color="009900">add-game TeamCastle2 T 35</font>
ok
<font color="009900">add-game TowerRise E10+ 45.49</font>
ok
<font color="009900">add-game Limitl3ss M 60</font>
ok
<font color="009900">add-game KangarooJane T 39.95</font>
ok
<font color="009900">print-game-sales-report TowerRise</font>
Title: TowerRise
Rating: E10+
Price: $45.49
Copies Sold Individually: 0
Copies Sold in Bundles: 0
Total Copies Sold: 0
Total Revenue: $0.00
<font color="009900">add-bundle BuilderBundle 75 MoonCraft TowerRise</font>
ok
<font color="009900">add-bundle BoomerangBundle 100 TowerRise Limitl3ss KangarooJane</font>
ok
<font color="009900">sell-game MoonCraft</font>
ok
<font color="009900">sell-game KangarooJane</font>
ok
<font color="009900">sell-bundle BuilderBundle</font>
ok
<font color="009900">print-game-sales-report MoonCraft</font>
Title: MoonCraft
Rating: E
Price: $27.49
Copies Sold Individually: 1
Copies Sold in Bundles: 1
Total Copies Sold: 2
Total Revenue: $64.99
<font color="009900">exit</font>
</pre>

Note that the total revenue for MoonCraft is determined by adding the individual sales revenue, (1 copy) x ($27.49 per copy), to the bundle revenue portions, (1 BuilderBundle) x ($75 per BuilderBundle) / (2 games in BuilderBundle). 

The good news is that the difficulty of dealing with the text-based input and output of the program has all been done for you. All you will have to write is the code to update the program's games, bundles, and sales records, as well as generate sales reports. 

To solve this problem, you will modify 3 classes. 
1. An instance of the `Game` class will keep track of a game's title, rating, price, and number of copies sold. 
2. An instance of the `Bundle` class will keep track of a bundle's name, which games are in the bundle, the bundle's price, and how many copies of the bundle have been sold. 
3. The `SalesManagerMain` class will store a list of all `Game` objects and a list of all `Bundle` objects, as well as handling input/output. 

The starter code in SalesManagerMain supports the following commands:

1. `add-game [title] [rating] [price]`: creates a new `Game` object with the given info

See the `handleAddGame` method in `SalesManagerMain.java`, and add anything you need to add to the `Game` class. 

2. `add-bundle [name] [price] [gameTitle1] [gameTitle2] [...] [gameTitleN]`: creates a new `Bundle` object with the given info, where `N` is the number of games in the bundle

See the `handleAddBundle` method in `SalesManagerMain.java`, and add anything you need to add to the `Bundle` class. 

3. `sell-game [title]`: adds one to the number of copies sold for the `Game` with the given title

See the `handleSellGame` method in `SalesManagerMain.java`, and add anything you need to add to the `Game` class. 

4. `sell-bundle [name]`: adds one to the number of copies sold for the `Bundle` with the given name

See the `handleSellBundle` method in `SalesManagerMain.java`, plus anything you need to add to the `Bundle` class. 

5. `print-game-sales-report [title]`: prints a sales report for the `Game` with the given title. 

See the `handlePrintGameSalesReport` method in `SalesManagerMain.java`, and add anything you need to add to the `Game` class. 

The report should look like:
<pre>
Title: TeamCastle2
Rating: T
Price: $35.00
Copies Sold Individually: 120
Copies Sold in Bundles: 100
Total Copies Sold: 220
Total Revenue: $6700.00
</pre>

6. `print-bundle-sales-report [name]`: prints a sales report for the `Bundle` with the given title. 

See the `handlePrintBundleSalesReport` method in `SalesManagerMain.java`, and add anything you need to add to the `Bundle` class. 

The report should look like: 
<pre>
Name: BoomerangBundle
Games: TowerRise,Limitl3ss,KangarooJane
Price: $100.00
Copies Sold: 4
Total Revenue: $400.00
</pre>

> [!NOTE]
> **Tip:** If you are having trouble matching the expected sales report formats, use the IDE's expected vs. actual comparison tool. 
> In the test results view, find the failed test, and select the option to view the difference between the expected and actual test results. See the IntelliJ example below. 
> This can help you find missing/extra whitespace and other small formatting errors. 

<!-- <img src="comparison_failure_screenshot.png" alt="Comparison failure in Eclipse" width="800"/>
<img src="expected_vs_actual_screenshot.png" alt="Expected vs Actual Test Result in Eclipse" width="800"/> -->

<img src="comparison_failure_screenshot_intellij.png" alt="Comparison failure in IntelliJ" width="400"/>
<img src="expected_vs_actual_screenshot_intellij.png" alt="Expected vs Actual Test Result in IntelliJ" width="600"/>


Some additional details and hints are provided in the comments of the methods themselves. 

Unit tests for these methods have been provided. 

### The GenAI Part

For this part, you will use a GenAI chatbot tool of your choice. Start by completing Section 1 of the written report in [VaporSalesReport.docx](./VaporSalesReport.docx). 

For each of the tasks below, you will prompt the GenAI tool to complete the task. Be sure to include all necessary context. If the GenAI-produced solution does not pass the unit tests, try to guide it with additional prompts. Refer to [the CSSE 220 GenAI Prompting Guide](../../Docs/prompting_guide.md) for tips. 

If you cannot get a working solution from the GenAI tool after additional prompting, either manually fix its implementation or restart with a different GenAI tool. 

Review any and all GenAI-produced lines of code, and modify them as needed to meet the [documentation and style guidelines](../../Docs/grading_guide.md). 

After your code passes all unit tests, return to [VaporSalesReport.docx](./VaporSalesReport.docx) and complete Section 2. 

#### GenAI Part Tasks
1. Implicitly create games if they appear in an `add-bundle` command but do not yet exist. The default price (if purchased individually) for a new game should be 49.95 USD, and the default rating should be "T". 
2. Implement the `handleGetBestSellingBundle` method in `SalesManagerMain.java`, which will be called when the user enters the `best-selling-bundle` command. Remember that "best-selling" means most copies sold, not highest total revenue. 
3. Implement the `handleGetHighestRevenueGame` method in `SalesManagerMain.java`, which will be called when the user enters the `highest-revenue-game` command. Remember that the total revenue for a game includes any revenue portions earned from selling bundles including that game. 

Example: 

<pre>
Welcome to the Vapor Sales Manager.  Enter commands.  Type 'exit' to end. 
<font color="009900">add-bundle ImplicitBundle 94.96 DeadMitochondria CallOfDestiny</font>
ok
<font color="009900">sell-game DeadMitochondria</font>
ok
<font color="009900">sell-game CallOfDestiny</font>
ok
<font color="009900">add-game VertebrateCrossing E 39.99</font>
ok
<font color="009900">add-bundle MixedBundle 78.24 CallOfDestiny VertebrateCrossing</font>
ok
<font color="009900">sell-bundle ImplicitBundle</font>
ok
<font color="009900">sell-bundle MixedBundle</font>
ok
<font color="009900">sell-bundle MixedBundle</font>
ok
<font color="009900">best-selling-bundle</font>
MixedBundle
<font color="009900">print-bundle-sales-report MixedBundle</font>
Name: MixedBundle
Games: CallOfDestiny,VertebrateCrossing
Price: $78.24
Copies Sold: 2
Total Revenue: $156.48
<font color="009900">highest-revenue-game</font>
CallOfDestiny
<font color="009900">print-game-sales-report CallOfDestiny</font>
Title: CallOfDestiny
Rating: T
Price: $49.95
Copies Sold Individually: 1
Copies Sold in Bundles: 3
Total Copies Sold: 4
Total Revenue: $175.67
<font color="009900">exit</font>
</pre>

