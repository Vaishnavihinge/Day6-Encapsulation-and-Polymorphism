final class Student {
    private final int rollNo;
    private final String name;

    public Student(int rollNo, String name){   //Initialize fields using constructor
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo(){
        return rollNo;
    }

    public String getName(){
        return name;
    }

}

public class ImmutableClass {
    public static void main(String []args){
      Student s = new Student(101, "ABC");
      System.out.println(s.getRollNo());
      System.out.println(s.getName());

    }      
}

//Setter method not avaible in mutable class
//Object cannot be modified