# Assignment 3, grade 2
#### Group members: 
#### Gabriele Marinosci gm222hj, Ratmir Shchadrynski rs223ck, Raya Wagner rw222hi

The program is started by running the App class.

When running the code quality tests, 2 bugs are found in the model/game.java class. This is due to the fact that the controller/player.java class calls the getPlayer() and getDealer() method in order to add subscribers for the observer pattern. We are aware of the issue and that it could be solved by choosing the game as observable.  Unfortunately this was noticed too late, implementing the solution would require us to start again for the observer pattern requirement, that is why we decided against changing it.