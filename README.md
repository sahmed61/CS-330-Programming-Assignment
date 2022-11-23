# CS-330-Programming-Assignment

Part 1:
1. The user will be prompted to enter a number 
-  Here you can enter a string of your choosing 
2. Any character that is not 0-9 will be discarded 
3. The string will then be printed 
4. The program will check if the string contains the unlock or lock access code 
- My unlock access code is : 419061
- My lock access code is : 419064
5. The program will then signal the action of unlock or lock 

Part 2:
1. The program tries to estimate how long it will take to break the lock by specifying the number of digits in the string, the number of attempts it can take to break the lock and the total number of successful attempts 
2. With the use of a random number generator which is turned into a string, an estimate is found on the average number of successful attempts to break the lock with a unlock code of 419061
3. The actual test is then conducted with the help of another random number generator that is turned into a string 
4. The program checks if the lock was unlocked and prints true or false 
5. How many times the lock was unlocked 
6. Finally how many symbols were generated until the lock was unlocked
7. In case the lock was not unlocked the user will be asked to run the program again

Executables:

build:
javac Part1.java
run:
java Part1

build: 
javac Part2.java
run: 
java Part2

The program has been tested on Windows 10/11
