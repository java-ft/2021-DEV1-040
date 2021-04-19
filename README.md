# 2021-DEV1-040
TicTacToe

## How to get this project
*(In Intellij Idea)*

File => New => Project from Version Control <br />
Choose "Repository URL" <br />
As Repository, enter: "https://github.com/java-ft/2021-DEV1-040.git". <br />
You are free to choose which local directory you want to clone the project to. <br />
Then click on "Clone" <br />

## How to run the application
*(In Intellij Idea)*

Go to your "Maven" tab and run the command "mvn clean install" <br />
Build the project <br />
Find the class "TictactoeApplication.java" and run it. <br />

The SpringBoot application should be launching on http://localhost:8080.

## How to play TicTacToe

Go to http://localhost:8080.

Here are the APIs you can use to play:

- **restart <br />** restart the tictactoe game from beginning <br />
Example: http://localhost:8080/restart
  
- **cross?index={number}** <br /> Add a cross at the selected index on the tictactoe grid <br /> Number goes from 0 to 8 <br />
Example: http://localhost:8080/cross?index=1

- **circle?index={number}** <br /> Add a circle at the selected index on the tictactoe grid <br /> Number goes from 0 to 8 <br />
Example: http://localhost:8080/circle?index=3

- **view** <br /> Show the tictactoe grid (without doing any other action) <br />
Example: http://localhost:8080/view
