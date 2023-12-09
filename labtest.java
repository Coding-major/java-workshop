// class Employee {
//     protected String name;
//     protected String id;
//     protected String number;
//     protected float[] Salary;
// }

// class AcademicStaff extends Employee {
//     protected String rank;
//     protected StrictMath qualification;
// }
interface parent {
    public void name();
    public void ages();
}

interface parent1 extends parent{
    public void ages1();
    public void ages2();
}

class child implements parent1 {

    public void name() {
        System.out.println("okay");
    }

    public void ages() {
        System.out.println("ppppppppppp");
    }

    public void ages1() {
        System.out.println("ppppppppppp");
    }

    // public void ages2() {
    //     System.out.println("ppppppppppp");
    // }

    

    public void display() {
        System.out.println("ddddddddddddddddd");
    }
    
}

// class child2 extends child {
       
// }


public class labtest {
    public static void main(String[] args) {
        child c1 = new child();
        c1.name();
        c1.display();
    }

    
}

