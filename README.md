# ⚅⚄⚃⚂⚁⚀ -Dice-and-Dungeon- ⚀⚁⚂⚃⚄⚅
Dungeons and Dragons style game, where you roll a dice to determine the outcome of your story. When you start the game you get the chances to make your way through the dungeons by first selecting your character and then choosing a final boss to face. 

## Table of Contents
 - [⚀ Description](#description)
 - [⚁ Features](#features)
 - [⊹ Prerequisites](#prerequisites)
 - [⚂ How to Run](#how-to-run)
 - [⚃ Contributing](#contributing)
 - [⚄ Author](#author)
 - [⚅ License](#license)

## Description
This is a Dice and Dungeons game base where you get to choice of outcomes and from that choice your chances of succeeding determines on a dice roll. At each stage you make choices to get closer to the final boss. You begin with 3 lives: failing certain rolls costs you a life, and if you lose all 3, your journey ends.

## Features
- Dice rolling with ASCII art
- 3-life system: lose lives on bad rolls, restart stages while you still have lives
- Story outcomes with multiple choices options
- Name input, player character selection, final boss selection
- Final text file with the final outcome of the game with ASCII art

## Prerequisites
- Java 21 (this project uses a Java 21 toolchain)

## How to Run
1. Clone the repository

### Option A (recommended): Run with Gradle
1. Open a terminal in the project root
2. Run:
   - macOS/Linux: `./gradlew run`
   - Windows: `gradlew.bat run`
3. Follow the prompts

### Option B: Run without Gradle (plain Java)
1. Compile:
   - macOS/Linux: `javac -d out src/main/java/*.java`
   - Windows: `javac -d out src\main\java\*.java`
2. Run:
   - macOS/Linux: `java -cp out Game`
   - Windows: `java -cp out Game`
3. Follow the prompts

## Contributing
Contributions are welcome! Please open an issue or submit a pull request.

## Author
Ahmed Mussa - Contact me on GitHub username: aymussa for any questions.
https://github.com/Aymussa/Dice-and-Dungeon-

## License
This is a university project