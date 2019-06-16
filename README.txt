I selected the problem statement is Merchant's Guide to the Galaxy.

Created Below Classes for the execution of the solution:
========================================================
     1) Application.java is gate way class, which will take input from the eclipse command prompt.
     2) There is a Paragraph class reads each line and validates the input is proper or not and return Type of Question.
     3) Internally each Question will be extracted to roman number and it is converting to Number(Amount)
     4) There is an AppTest class will take input from inputFile.txt and executes the testMain().


Exception Handling:
===================
if the Question is not identified properly we will display the custom message.

Execution:
==========

Type mvn clean install 
 
 it will execute with Testcases.    