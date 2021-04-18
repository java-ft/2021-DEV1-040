# 2021-DEV1-040
TicTacToe

## How to get this project
(In Intellij Idea)

File => New => Project from Version Control
Choose "Repository URL"
As Repository, enter: "https://github.com/java-ft/2021-DEV1-040.git".
You are free to choose which directory you want to clone the project to.
Then click on "Clone"

## How to run the application
(In Intellij Idea)

Go to your "Maven" tab and run the command "mvn clean install"
Build the project
Find the class "TictactoeApplication.java" and run it.

The SpringBoot application should be launching on http://localhost:8080.

## How to play TicTacToe

Go to http://localhost:8080.

Here are the APIs you can use to play:

- restart: restart the tictactoe game from beginning
Example: http://localhost:8080/restart
  
- cross?index={number}: add a cross at the selected index on the tictactoe grid
Example: http://localhost:8080/cross?index=1

- circle?index={number}: add a circle at the selected index on the tictactoe grid
Example: http://localhost:8080/circle?index=3

- view: show the tictactoe grid (without doing any other action)
Example: http://localhost:8080/view
