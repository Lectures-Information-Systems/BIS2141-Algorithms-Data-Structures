package lecture04;

/**
 * The Student class models a basic student with a surname and prename.
 * <p>
 * This class includes methods for registering exams with different parameters and
 * provides a method to return a student ID. Additionally, it overrides the toString
 * method to give a default message.
 * </p>
 * 
 * <p>This example helps in understanding method overloading, basic method 
 * definitions, and the toString override in Java.</p>
 * 
 * @author Andreas R. Schneider
 */
public class Student 
{
    // Variables to hold the surname and prename of a student
    String surname, prename;
    
    /**
     * Registers a student for an exam by surname.
     * 
     * <p>This method uses a placeholder string "Hello!" as an example for now.
     * The actual implementation would typically involve code to register a student
     * by their surname.</p>
     * 
     * @param surname the surname of the student to register
     */
    public void registerExam(String surname)
    {
        surname = "Hello!";
        // placeholder for actual exam registration code
    }
    
    /**
     * Registers a student for an exam by exam number.
     * 
     * <p>This method would contain code to register a student for an exam using
     * their specific exam number.</p>
     * 
     * @param examNumber the exam number for the student's registration
     */
    public void registerExam(int examNumber)
    {
        // placeholder for actual code for exam registration using exam number
    }
    
    /**
     * Prints the student ID.
     * 
     * <p>This example method simply returns a sample student ID. In a real application,
     * this would likely fetch the actual ID associated with the student instance.</p>
     * 
     * @return a sample student ID as a double
     */
    public double printStudentID()
    {
        double id = 123456;
        return id;
    }
    
    /**
     * Returns a default string message for the Student object.
     * 
     * <p>This method is overridden from the Object class and will be called automatically
     * if an object of the Student class is printed without specifying a format.</p>
     * 
     * @return the default string message "Hello World!"
     */
    @Override
    public String toString()
    {
        return "Hello World!";
    }
}