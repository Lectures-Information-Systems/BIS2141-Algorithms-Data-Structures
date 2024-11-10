package lecture05;

/**
 * The Student class represents a student with an ID, surname, and prename. It
 * provides constructors for different ways of initialising student information,
 * as well as getter methods and a toString method for displaying the student's
 * information.
 *
 * @author Andreas R. Schneider
 */
public class Student
{

    // Private instance variables to store the student's information
    private int studentID;
    private String surname;
    private String prename;

    /**
     * Constructs a Student object with the given student ID, surname, and
     * prename.
     *
     * @param studentID The ID of the student
     * @param surname The surname of the student
     * @param prename The prename of the student
     */
    public Student(int studentID, String surname, String prename)
    {
        this.studentID = studentID;
        this.surname = surname;
        this.prename = prename;
    }

    /**
     * Constructs a Student object with only the student ID. The surname and
     * prename are set to "Unknown" by default.
     *
     * @param studentID The ID of the student
     */
    public Student(int studentID)
    {
        this(studentID, "Unknown", "Unknown");
    }

    /**
     * Constructs a Student object with the given surname and prename, but
     * without specifying a student ID.
     *
     * @param surname The surname of the student
     * @param prename The prename of the student
     */
    public Student(String surname, String prename)
    {
        this.surname = surname;
        this.prename = prename;
    }

    /**
     * Gets the student's ID.
     *
     * @return The ID of the student
     */
    public int getStudentID()
    {
        return studentID;
    }

    /**
     * Gets the student's surname.
     *
     * @return The surname of the student
     */
    public String getSurname()
    {
        return surname;
    }

    /**
     * Gets the student's prename.
     *
     * @return The prename of the student
     */
    public String getPrename()
    {
        return prename;
    }

    /**
     * Returns a string representation of the Student object, displaying the
     * student's ID, surname, and prename.
     *
     * @return A string containing the student's information
     */
    @Override
    public String toString()
    {
        return "Student{"
                + "studentID=" + studentID
                + ", surname='" + surname + '\''
                + ", prename='" + prename + '\''
                + '}';
    }
}
