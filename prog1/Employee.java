package employee;

/**
 * @author jorienoll
 * CSC 4101 Programming Languages
 * Homework 1- Inheritance and Polymorphism
 */
public class Employee {
    //private employee variables declared
    private String firstName;
    private String lastName;
    private int number;
    private String ID;
    
    //employee constructor
    Employee(String firstName, String lastName, int number){
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.ID = this.createID();
    }
    
    //prints employee name and ID
    public void print(){
        System.out.println("-----------------------------------------");
        System.out.println("Employee name: " + this.createFullName());
        System.out.println("Employee ID: " + this.createID());
    }
   
    //sets first name
    private void setFirstName(String newValue){
        this.firstName = newValue;
    }

    //sets last name
    private void setLastName(String newValue){
        this.lastName = newValue;
    }

    //sets employee number
    private void setNumber(int newValue){
        //if the employee number is not 4 digits, the number is not set and console prints an error message
        if (newValue < 999 || newValue > 9999){
            System.out.println("Cannot Change Number. The Employee Number should be exactly 4 digits.");
        }
        else{
            this.number = newValue;
        }
    }

    //combines first and last name to create full name string
    private String createFullName(){
        return this.firstName + " " + this.lastName;
    }

    //creates employee ID by combining the first name, last name, and number into one string
    private String createID(){
        return this.firstName.toLowerCase().charAt(0) + this.lastName.toLowerCase().substring(0,3) + number;
    }
    
    public static void main(String[] args){
        //inputs new array of employees
        int i;
        Employee[] emps = new Employee[3]; 
        emps[0] = new Employee( "Robert", "John", 6611 );
        emps[1] = new Faculty("Sara", "Brown", 2010, "CSC");
        emps[2] = new Instructor("Steven", "Hank", 3344, "ECE", 20);

        //prints each item in array
        for(i=0; i < emps.length; i++){
            emps[i].print();
        }
        System.out.println("-----------------------------------------");
        
        //resets the employee number at element 0 in array
        emps[0].setNumber(331);
        System.out.println(emps[0].createFullName() + ": " + emps[0].createID());
    }
 }
