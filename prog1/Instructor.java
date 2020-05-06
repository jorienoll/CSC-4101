package employee;

/**
* @author jorienoll
 * CSC 4101 Programming Languages
 * Homework 1- Inheritance and Polymorphism
 */
public class Instructor extends Faculty {
    //private int variable for instructor hourly rate
    private int rate;
    
    //instructor constructor
    Instructor(String firstName, String lastName, int number, String code, int rate){
        super(firstName, lastName, number, code);
        this.rate= rate;
    }
    
    //set rate
    private int getRate(){
        return this.rate;
    }
    
    //prints instructor, overrides print method from faculty to add a line that prints rate
    @Override
    public void print() {
        super.print();
        System.out.printf("Rate: %d $/hour\n", this.getRate());
    }
}
