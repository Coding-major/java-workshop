// public class triangleMatrix {
//     public static void main (String[] args) {
//         int matrixLength = 5;
//         int[][] resultMatrix = new int[5][5];
//         int[][] upperMatrix = {
//                     {1,2,3,5,8},
//                     {2,3,4,3},
//                     {5,3,8},
//                     {9,4},
//                     {7}};

//         int[][] lowerMatrix = {
//                     {3}, 
//                     {5,4},
//                     {7,3,8},
//                     {9,3,6,4},
//                     {2,8,4,6,3}};



//         for (int i = 0; i<5; i++) {
//             for (int j = 0; j < upperMatrix[i].length; j++) {
//                 resultMatrix[i][i+j] = upperMatrix[i][j];
//             }

//             for (int j = 0; j<lowerMatrix[i].length; j++) {
//                 resultMatrix[i][j] += lowerMatrix[i][j];
//             }
//         }

//         for (int i = 0; i<resultMatrix.length; i++) {
//             for (int j = 0; j<resultMatrix[i].length; j++) {
//                 System.out.println(resultMatrix[i][j]);
//             }

//             System.out.println("\n");
//         }
//     }
// }

public class triangleMatrix {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int[] runningSum = new int[5];
        int num = 0;

        for (int i=0; i<nums.length; i++) {
            num += nums[i];
            runningSum[i] = num;
        }

        for (int i=0; i<runningSum.length; i++) {
            System.out.println(runningSum[i]);
        }
        
    }
}