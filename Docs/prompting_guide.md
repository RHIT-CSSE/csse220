# CSSE 220 GenAI Prompting Guide
This document provides guidelines, tips, and tricks for writing effective and efficient prompts for GenAI tools such as ChatGPT, Claude, and Gemini. For additional details, follow links to external resources. 

*Prompt engineering* is an often-used, but misleading, term for the process of developing effective prompts to get useful outputs from GenAI tools. There's [no real engineering](https://hbr.org/2023/06/ai-prompt-engineering-isnt-the-future) happening; it's just trial-and-error. However, there are some characteristics of good prompts that you can use as a guide. 

Below, you'll find two prompting frameworks: the CCLEAR approach, and OpenAI's advice. Look for similarities between the two, and take what you find useful from each. 
## The CCLEAR Approach
*The following is adapted from "The CCLEAR Approach to Effective Prompting (v. 1.0)" by Dr. C.S. Tritt at MSOE, accessed via [KEEN Card #4212](https://app.engineeringunleashed.com/card/4212). Dr. Tritt's framework is expanded from [Leo Lo's CLEAR path](https://doi.org/10.1016/j.acalib.2023.102720) by adding "Contextual".* 

An effective GenAI prompt is: **C**ontextual, **C**oncise, **L**ogical, **E**xplicit, **A**daptive, and **R**eflective. 
### Contextual: Provide relevant background. 
For example, instead of "Explain how to implement a basic user interface", ask "Explain how to implement a basic Java Swing user interface to a first-year software engineering student learning object-oriented development."
### Concise: Use clear and brief prompts. 
Example: "Briefly describe the key features and uses of Java's `String.format` with particular emphasis on output format control using placeholders." 
### Logical: Structure your prompts coherently. 
Good Example: "Outline how to read floating point values from a text file. In particular, cover opening the file, reading that data, converting it from text to numbers, and displaying the numeric values. Provide sample code for reading three values calling them a, b, and c."

Bad Example: "Provide sample code for reading three values from a text file, calling them a, b, and c. Outline how to display the numeric values of a, b, and c. Cover converting the data from text to numbers. In particular, discuss opening the file and reading the data."
### Explicit: Clearly specify the desired output. 
Instead of "I need a function to convert degrees C into degrees F", say "Create a static Java method that converts its argument, a temperature as a double, from degrees C to degrees F and returns the converted temperature as a double. The conversion equation is T (deg. F) = 9/5 x T (deg. C) + 32."
### Adaptive: Be flexible and customize your prompts. 
Experiment with different phrasings and, if present, the creativity/focus options of the GenAI tool. When you receive results, adapt them as needed to meet your requirements. 
### Reflective: Continuously evaluate and improve your prompts. 
Think about how well the GenAI tool is performing on the tasks you give it. Identify areas for improvement and adjust your approach accordingly. 
## OpenAI Training
*The following is a summary of the OpenAI Academy videos "[Intro to Prompt Engineering](https://academy.openai.com/home/videos/introduction-to-prompt-engineering-2025-02-13) and "[Advanced Prompt Engineering](https://academy.openai.com/home/videos/advanced-prompt-engineering-2025-02-13)".*

### Three Pillars of Effective Prompts
A great prompt incorporates: 
1. **Context**: The material to be worked on (e.g., background info for uploaded documents)
2. **Role**: You and your role (e.g., "I am a CS student learning object-oriented design")
3. **Expectation**: The desired material to be generated (e.g., output format, length, structure)
### Top Tip for Getting Started: Ask GenAI for Good Prompts
> I am a (insert major and year) undergraduate student in CSSE 220: Object-Oriented Software Development. I am learning to use GenAI tools. Provide the top 5 prompts for how I can use GenAI for a wide range of use cases. 
<!-- example: https://chatgpt.com/share/68767be4-7644-8002-8726-a0259b8923ba --> 

Consider adding to this request for prompts some of the above tips. For example, you might add at the end, "Include context, role, and expectation in each prompt."
### Encourage the GenAI tool to Adopt a Persona
Instructing the GenAI tool to take on a certain point of view may lead to more specific and useful results. For example, instead of saying, "Please summarize trends in energy drink sales in the Midwest for the past three years," say, "**You are a marketing manager at an energy drink company exploring new territories to launch products.** Summarize energy drink sales trends in the Midwest for the past three years."
### Use delimiters (such as triple quotes) to create logical breaks
For example: 
> Translate the text delimited by triple quotes to French. 
>  
> """
> 
> The quick brown fox jumps over a lazy dog.
> 
> """
### Provide step-by-step instructions
Breaking down a process into multiple steps may help the GenAI tool give meaningful responses and show its work (which also gives you a chance to check its intermediate outputs). 
### Provide example(s) for GenAI to emulate
This is sometimes called one-shot (or few-shot) prompting. Giving an input/output example helps establish expectations and may reduce the chances of hallucinations. 
