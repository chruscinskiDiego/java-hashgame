# Java Swing tic-tac-toe

Local two-player game with a Swing interface. The board alternates between X and O and checks for a winner or draw after each move.

## Features

- Nine-button game board.
- Alternating turns.
- Prevents selecting occupied cells.
- Displays the result and resets the board.

## Run locally

Requires a JDK and a graphical desktop environment.

```bash
javac -encoding UTF-8 -d out src/application/Program.java src/game/HashGame.java
java -cp out application.Program
```

## Structure

- `application/Program.java`: entry point.
- `game/HashGame.java`: interface, event handlers and rules.

## Scope

A study project covering Java, object-oriented programming and UI events. Games are local; there is no AI opponent, network multiplayer or persistence.
