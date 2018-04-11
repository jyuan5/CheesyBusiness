## MazeSolver

### Personnel

Maia Brydon, Jessie Yuan

### Problem

v0. Return the boolean value of "it is possible to leave the current position and reach treasure."

### Recursive Abstraction
When asked to 

  return the boolean value of "it is possible to reach the treasure from the current position"
  
the recursive abstraction can 

  return the boolean value of "it is possible to reach the treasure from the current position moved by one step"
  
### Base Case
- The current position is the position which contains the treasure (return true).
- The current position is on a wall (return false).

### English/Pseudocode Description of Algorithm
Check if the starting position is the position which contains the treasure.

If not, invoke the recursive abstraction:
- determine the next possible cardinal direction with a stepping stone
- DropA wall on the current position of the explorer
- move one step in the next possible cardinal direction
- invoke the recursive step

### Class(es), with fields and methods

### Version *n* wishlist
