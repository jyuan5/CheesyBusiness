/**
   Answers whether or not the explorer can reach the treasure from the starting position, using recursive backtracking.
*/

public class MazeSolver {

    public final int[] direction = {Maze.EAST, Maze.NORTH, Maze.SOUTH, Maze.WEST};

    public boolean solve( Maze mazeToBeSolved) {

	//base cases
	if ( mazeToBeSolved.explorerIsOnA() == 0){
	    System.out.println ("base case!");
	    return true;
	}
	else if ( mazeToBeSolved.explorerIsOnA() == 1){
	    System.out.println ("base case!");
	    return false;
	}

	//recursive case
	else {

	    //drop wall and take snapshot
	    mazeToBeSolved.dropA( 1);
	    Maze old = takeSnapshot(mazeToBeSolved);
	    System.out.println ("wall dropped and snapshot taken" + old);

	    //iterate through the directions
	    for (int i = 0; i < 4; i++){
		System.out.println ("next direction " + i );
		
		//move the explorer in that direction
		mazeToBeSolved.go(direction[i]);
		System.out.println ("explorer moved " + mazeToBeSolved);
		
		//answer the problem for new mazeToBeSolved
		if ( solve( mazeToBeSolved) == true){
		    System.out.println ("explorer found treasure");
		    return true;}
	        System.out.println ("explorer did not find treasure");
		
		//restore snapshotted maze if answer to problem is false
		mazeToBeSolved = old;
		System.out.println ("snapshot restored " + mazeToBeSolved);
	    }
	    //none of the directions return true, explorer cannot reach treasure
	    return false;
	}
    }

    private static Maze takeSnapshot( Maze candidate) {
        Maze snapshot;
        snapshot = new Maze(candidate);
	return snapshot;
    }

}
