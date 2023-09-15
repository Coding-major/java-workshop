// public class example1 {
//     public static void main (String[] args) {
//         System.out.println(factorial(4));
//     }

//     public static int factorial(int number) {
//         if (number <= 0) {
//             return 0;
//         } else {
//             return number + factorial(number-1);
//         }
//     }
// }

/////////////////////////////////////////////////////////////////////////////
// public class test {
//     int x;
//     public test (int x) {
//         return x;
//     }
    
// }

import java.util.*;
public class example1 {
    // int x;
    // public example1 (int x) {
    //     this.x = 5;
    // }

    public static void main (String[] args) {
        int result;
        int num = 10;
        while (num>=0) {
            result += num;
            num--;
        }
        
        // example1 musty = new example1(10);
        System.out.println(result);
    }
}



