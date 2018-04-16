/**
   Tests the MazeSolver class.
*/

public class UserOfMazeSolver {

    private static Displayer displayer;

    public static void main(String[] commandLine)
        throws java.io.FileNotFoundException {
        System.out.println();

        //java UserOfMazeSolver mazes/intersection_treasureNorth.txt 1 1

        Maze maze = new Maze( commandLine[0]
                             , Integer.parseInt( commandLine[1])
                             , Integer.parseInt( commandLine[2])
                            );
        System.out.println( maze + System.lineSeparator());

        MazeSolver testMaze = new MazeSolver();
        System.out.println(testSolver(testMaze, maze));


    }

    public static int testSolver( MazeSolver solver, Maze x) {
        return solver.solve(x);
    }
}

