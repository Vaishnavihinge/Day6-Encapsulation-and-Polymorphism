
public class Employee1 {
    
    private int age;

    public void setAge(int age){  //Setter used to assign value with validation
        
        if(age >= 18 && age <= 60){
            this.age = age;
        }
        else{
            System.out.println("Invalid Age : " + age);
        }
    }
    public int getAge(){  //Getter expose only meaningful data
        return age;  
    }

    public static void main(String args[]){
        
        Employee1 e1 = new Employee1();

        e1.setAge(50);

        System.out.println("Employee age : " + e1.getAge());
   
    }
}