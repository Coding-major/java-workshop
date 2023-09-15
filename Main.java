// public class Main {
//     public void fullThrottle() {
//         System.out.println("vvvvvvvvuummmmmmmmmmmmmmmmmmmmmmmm");
//     }

//     public void speed(int press) {
//         System.out.println("waaaaaaaaaaaaaaaaaaaa "+ press);
//     }

//     public static void main (String[] args) {
//         Main myCar = new Main();
//         myCar.fullThrottle();
//         myCar.speed(30);
//     }
// }


///////////////////////////////////////////////////////////////

// public class Main {
//   int modelYear;
//   String modelName;

//   public Main(String name) {
//     modelYear = 1990;
//     modelName = name;
//   }

//   public static void main(String[] args) {
//     Main myCar = new Main("Mustang");
//     System.out.println(myCar.modelYear + " " + myCar.modelName);
//   }
// }


//////////////////////////////////////////////////////////////////////

class Main {


  public int  factorial (int number) {
    if (number <= 0) {
      return 1;
    }

    return number * factorial(number-1);
  }
 

  public static void main (String[] args) {

    Main check = new Main();
    System.out.println(check.factorial(4));
  }
}


