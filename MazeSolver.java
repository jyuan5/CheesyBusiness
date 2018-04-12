/**
   Answers whether or not the explorer can reach the treasure from the starting position, using recursive backtracking.
*/

public class MazeSolver {
    

    public boolean solve( Maze mazeToBeSolved) {
	if ( mazeToBeSolved.explorerIsOnA() == 0)
	    return true;
	else if ( mazeToBeSolved.explorerIsOnA() == 1)
	    return false;
	else {
	    mazeToBeSolved.dropA( 1);
	    Maze old = takeSnapshot(mazeToBeSolved);
	    mazeToBeSolved.go( 1);
	    if ( solve( mazeToBeSolved) == true)
		return true;
	    mazeToBeSolved = old;
	    mazeToBeSolved.go( 2);
	    if ( solve( mazeToBeSolved) == true)
		return true;
	    mazeToBeSolved = old;
	    mazeToBeSolved.go( 4);
	    if ( solve( mazeToBeSolved) == true)
		return true;
	    mazeToBeSolved = old;		
	    mazeToBeSolved.go( 8);
	    if ( solve( mazeToBeSolved) == true)
		return true;
	    mazeToBeSolved = old;
	    return false;
	    
	}
    }

    private static Maze takeSnapshot( Maze candidate) {
        Maze snapshot;
        snapshot = new Maze(candidate);
	return snapshot;
    }

	


}
