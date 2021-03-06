# OOA / OOD / OO Programming / OO QA

## Jukebox

![Jukbox_Pic](/image/juke_box.jpg)

## Description

Design a Juke Box that allows customers to select songs they want played or to submit a play list that they have already created previously. If a request is made for song that is not contained by a local Juke Box, it will query for that song from other Jukeboxes elsewhere in the country - thus they are networked. Although reminiscent of Napster, like the original jukebox, we want to provide a mechanism for owners, record companies and artists to earn a profit. Therefore, for this Juke Box we want to provide not only a coin drop and cash feed mechanism, but also a card swipe mechanism and a cell dial payment capability.

## Juke Box spec

Allow customers to

- select songs they want to play.
- submit a play list that they have already created previously.

The Juke Box can search other Juke Boxes from Internet for songs that are not contained by a local Juke Box. To provide a mechanism for owners, record companies and artists to earn a profit. The Juke Box contains

- A coin drop
- Cash feed mechanism
- A card swipe mechanism
- A cell dial payment capability.

## Diagrams

- Use Case Diagram
- Class Diagram
- Sequence Diagram

## Junit Test Suite

Junit test suite structure diagram

![JUnit_Pic](/image/junit_test.JPG)

- Test files are under Tests folder

## Test Instruction

### Complie Program
1. Run javac *.java on the folder
2. Run java Jukebox for the output

### Junit Test
1. cd to the Tests folder.
2. Run javac *.java 
3. Run java JBTestSuiteRunner for the output
