## MazeSolver

### Personnel

Maia Brydon, Jessie Yuan

### Problem

v0. Return the boolean value of "it is possible to leave the starting position and reach treasure."

### Recursive Abstraction
When asked to 

  return the boolean value of "it is possible to leave the starting position and reach treasure"
  
the recursive abstraction can 

  return the boolean value of "it is possible to leave the starting position moved by one unit and reach the treasure"
  
### Base Case
- The starting position is the position which contains the treasure.
- If all four neighboring cells are marked as illegal, then there is no treasure.

### English/Pseudocode Description of Algorithm
Check if the starting position is the position which contains the treasure.

If not, invoke the recursive abstraction:
- determine the next possible cardinal direction with a legal cell and record it
- If there is one legal neighboring cell, then mark the current cell as illegal and move one unit in the previously recorded cardinal direction. If there is more than one legal neighboring cell, then it is a junction; do not mark current cell as illegal and move one unit in the next possible cardinal direction.
- make the new position the new starting position
- invoke the recursive step 

### Class(es), with fields and methods

### Version *n* wishlist
