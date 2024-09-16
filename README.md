# IPL Tournament Simulation - Java

This project is a simulation of an IPL (Indian Premier League) cricket tournament built using Java. The simulation includes teams, players, matches, scorecards, and the determination of the tournament winner. The project demonstrates object-oriented programming principles by defining several classes for players, teams, and matches.

## Features
- **Players**: Includes both Batsmen and Bowlers, each with specific statistics like runs scored, wickets taken, and averages.
- **Teams**: Each team consists of 11 players with a mix of 6 batsmen and 5 bowlers.
- **Matches**: Simulates matches between teams with randomized scores and identifies the best performer for each match.
- **Scorecards**: Displays detailed scorecards for each match, including the winning team and the best performer.
- **Tournament Simulation**: Simulates an IPL tournament where each team plays against every other team twice and determines the overall tournament winner based on the number of wins.

## Classes
1. **Player**: Base class representing a player with attributes like name, age, and role.
2. **Batsman**: Extends `Player`, adding attributes specific to a batsman like runs scored and batting average.
3. **Bowler**: Extends `Player`, adding attributes specific to a bowler like wickets taken and bowling average.
4. **Team**: Represents a cricket team, containing a list of players and methods to add players and display team information.
5. **Match**: Simulates a match between two teams, generates scores, identifies the winner and best performer, and displays the match scorecard.
6. **IPL**: Manages the entire tournament, including adding teams and matches, running the tournament, and declaring the winner.

## How It Works
1. The `main` method in the `IPL` class initializes players and teams.
2. Matches are created such that each team plays against every other team twice (home and away).
3. The tournament is simulated, with each match displaying its scorecard, including the winner and best performer.
4. After all matches, the overall tournament winner is announced based on the number of wins.

## Requirements
- Java Development Kit (JDK) 8 or later.

