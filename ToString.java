// class student{
//     int rollno;
//     String name ;

//     public student(int rollno, String name){   // constructor 
//         this.rollno = rollno ;
//         this.name = name ;
//     }
// }


// public class toString {
//     public static void main(String[] args) {

//         student s1 = new student(44, "satyam");
//         // System.out.println(s1.rollno);
//         // System.out.println(s1.name);
//         System.out.println(s1); //compiler writes here s1.toString() 

        
//     }
// }




class student{
    int rollno;
    String name ;

    public student(int rollno, String name){   // constructor 
        this.rollno = rollno ;
        this.name = name ;
    }

    @Override
    public String toString(){
        return rollno + "  " + name ;
    }
}


public class ToString {  // A toString() is an in-built method in Java that returns the value given to it in string format
    public static void main(String[] args) {

        student s1 = new student(44, "satyam");

        System.out.println(s1);//compiler writes here s1.toString() 
        
    }
}




