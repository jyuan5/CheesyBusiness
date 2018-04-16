## MazeSolver

### Personnel

Maia Brydon, Jessie Yuan

### Problem

v0. Return the boolean value of "it is possible to leave the current position and reach treasure."
v1. Return the number of solutions to the maze.

### Recursive Abstraction
When asked to 

  return the boolean value of "it is possible to reach the treasure from the current position"
  
the recursive abstraction can 

  return the boolean value of "it is possible to reach the treasure from the current position moved by one step"
  
### Base Case
- The current position is the position which contains the treasure (return true).
- The current position is on a wall (return false).

### English/Pseudocode Description of Algorithm
Check if the current position contains the treasure.
Check if the current position is a wall.
If not, invoke the recursive abstraction:
- DropA wall on the current position of the explorer
- take snapshot
- move one step in the next possible cardinal direction
- invoke the recursive step (and restore snapshot)

### Class(es), with fields and methods
- Maze
  - terminal fields (treasure, wall, stepping stone)
  - cardinal direction fields (east, north, south, west)
  - maze
  - MAX_RANKS
  - rankCount
  - explorerPosition
  - Maze() constructor
  - Maze() copy constructor
  - go()
  - dropA()
  - explorerIsOnA()
  - private Vector class
    - rank, file
    - Vector() constructor
    - Vector() copy constructor
    - add()
    - equals()
- UserOfMaze
  - displayer
  - main()
  - moveTest()
  - dropTest()
  - copyConstructTest()
  - displayerTest()
  - snapshotDemo()
- MazeSolver
  - direction
  - solve()
  - takeSnapshot()
- UserOfMazeSolver
  - displayer
  - main()
  - testSolver()

### Known Bugs
None

### Version *n* wishlist
- is there a solution
- what is a solution
- how many solutions
- what are the solutions
