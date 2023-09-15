public class examples {
    public static void main (String[] args) {

////////////////////////////////////////////////////////////////////
        // float num1 = 4.892f;
        // String name = "mustapha"
        // int num2 = (int) num1;
        // System.out.println(num2);

///////////////////////////////////////////////////////////////////////
        // String[] names = {"mustey", "hacker", "musteyan", "others"};

        // for (String a : names) {
        //     System.out.println(a);
        // }

////////////////////////////////////////////////////////////////////////

        // String[] names = {"mustey", "hacker", "musteyan", "others"};

        // for (int i = 0; i<4; i++) {
        //     System.out.println(names[i]);
        // }

        // names[1] = "abdullateef";

        // System.out.println("////////////////////////////");


        // for (int i = 0; i<4; i++) {
        //     System.out.println(names[i]);
        // }


/////////////////////////////////////////////////////////////////////////
//////////// matrices
        int matrixLength = 5;
        int[][] resultMatrix = new int[5][5];
        int[][] upperMatrix = {
                    {1,2,3,5,8},
                    {2,3,4,3},
                    {5,3,8},
                    {9,4},
                    {7}};

        int[][] lowerMatrix = {
                    {3}, 
                    {5,4},
                    {7,3,8},
                    {9,3,6,4},
                    {2,8,4,6,3}};



        for (int i = 0; i<5; i++) {
            for (int j = 0; j < upperMatrix[i].length; j++) {
                resultMatrix[i][i+j] = upperMatrix[i][j];
            }

            for (int j = 0; j<lowerMatrix[i].length; j++) {
                resultMatrix[i][j] += lowerMatrix[i][j];
            }
        }

        for (int i = 0; i<resultMatrix.length; i++) {
            for (int j = 0; j<resultMatrix[i].length; j++) {
                System.out.println(resultMatrix[i][j]);
            }

            System.out.println("\n");
        }


    // int[][] upperMatrix = {
	// 		{33,428,23,232,21,88},
	// 		{848,18,28,33,1},
	// 		{99,912,23,88},
	// 		{66,77,52},
	// 		{23,9},
	// 		{322}
	// 	}; 
    

    // int[][] lowerMatrix = {
	// 		{82},
	// 		{43,5},
	// 		{7,223,45},
	// 		{14,783,0,1},
	// 		{23,23,33,558,9},
	// 		{342,94,13,98,32,1}
	// 	};

        
    }


}