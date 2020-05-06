package employee;
/**
 * @author jorienoll
 * CSC 4101 Programming Languages
 * Homework 1- Inheritance and Polymorphism
 */
public class Faculty extends Employee {
    //private variable for faculty code
    private String code;
    
    //faculty constructor
    Faculty(String firstName, String lastName, int number, String code){
        super(firstName, lastName, number);
        this.code = code;
    }
 
    //sets faculty code
    private String getCode(){
        return this.code;
    }
    
    //prints faculty member, overrides employee print method to add a line of department code
    @Override
    public void print(){
        super.print();
        System.out.printf("Department Code: %s\n", this.getCode());
    }
}
