# TicTacToe

TicTacToe game I implemented using Java with the purpose of learning the language.
I implemented the opponents AI using the Minimax algorithm.  This algorithm was covered in "Fundamentals of artificial intelligence and its applications"  (course number 096210 at the Technion) I took this semester.

The game has no graphics except for basic terminal outputs:

![image](https://user-images.githubusercontent.com/75043268/229348539-9a95393c-19b8-496b-91b8-00244736eb00.png)


The Classes of the project are as follows:
* Main.java - Calls the relevant methods (basically controls the game).
* TicTacToe.java - The game class, creates and maintains the game board.
* MinimaxPlayer.java - An opponent class that uses the Minimax algorithm to make the next move.
* RndPlayer.java - An opponent class that chooses the next move randomly.
