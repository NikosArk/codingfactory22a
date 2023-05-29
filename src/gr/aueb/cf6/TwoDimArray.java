package gr.aueb.cf6;

public class TwoDimArray {

    public static void main(String[] args) {

        int[][] grid2 = new int[2][2];
        int[][]grid = { {0, 1},{2, 3} };
//
//        grid2[0][0] = 0;
//        grid2[0][1] = 1;
//        grid2[1][0] = 3;
//        grid2[1][1] = 4;

        for (int i = 0; i < grid.length; i++) {   //1os tropos
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] row : grid) {   //2os tropos
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
