This is a repo where I'll be keeping my solutions to various algorithm design problems I come across and solve.

Each algorithm problem in this repo, has a folder named after the problem. In each folder there is a txt file containing the prompt for the problem, and a folder for each language I have written a solution in. My goal is to write solutions in Java and Python for each problem.

I've added a script called `AddProblem.sh` to help add problems to this repo. Just run the script, and type in the name of your new prompt.

For Example, to add the Queens on a Chess board problem,

Simply run `./AddProblem.sh QueensOnChessBoard`. This will create a new folder for the problem, that will contain a text file for the prompt, and a java and python folder, both containing a basic java/python file. Adding new languages to the script is pretty easy if you know any Bash scripting.

This script will also add a java test file. It doesn't use an actual testing framework, it's just a basic class, I use to run my solution class. It's a little prettier than putting the code to solve these problems, with the code to run those solutions, and check the answers.
