class Matrix {
    private int[][] upper;
    private int[][] lower;
    private int[][] resultMatrix;

    public Matrix(int[][] upper, int[][] lower, int first, int second) {
        resultMatrix = new int[first][second];
        this.upper = upper;
        this.lower = lower;
    }

    public void addMatrix() {
        for(int i=0; i<upper.length; i++) {
            for(int j=0; j<upper[i].length; j++) {
                resultMatrix[i][j] += upper[i][j];
            }

            for(int j=0; j<lower[i].length; j++) {
                resultMatrix[i][j] += lower[i][j];
            }
        }
    }

    public void display() {
        for(int i=0; i<resultMatrix.length; i++) {
            for(int j=0; j<resultMatrix[i].length; j++) {
                System.out.println(resultMatrix[i][j]);
            }

            System.out.println("\n");
        }
    }
}

public class normal {
    public static void main(String[] args) {
        int first = 5;
        int second = 5;
        // int[][] upperMatrix = {
        //     {1,2,3,5,8},
        //     {2,3,4,3},
        //     {5,3,8},
        //     {9,4},
        //     {7}};

        // int[][] lowerMatrix = {
        //     {3}, 
        //     {5,4},
        //     {7,3,8},
        //     {9,3,6,4},
        //     {2,8,4,6,3}};
        

        int[][] upperMatrix2 = {
            {1,2,3,5,8},
            {0,4,2,3,4},
            {0,0,5,9,1},
            {0,0,0,9,4},
            {0,0,0,0,7}};

        int[][] lowerMatrix2 = {
            {3,0,0,0,0}, 
            {5,4,0,0,0},
            {7,3,8,0,0},
            {9,3,6,4,0},
            {2,8,4,6,3}};

        

        // System.out.println(lowerMatrix.length);
        Matrix m1 = new Matrix(upperMatrix2, lowerMatrix2, first, second);

        m1.addMatrix();
        m1.display();
    }
}
