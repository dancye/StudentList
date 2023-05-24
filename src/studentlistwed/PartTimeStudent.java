/**
 * A class to model part time students
 */
package studentlistwed;

/**
 * A PartTime Student is like a student from our other class but with less courses
 * @author dancye
 */
public class PartTimeStudent extends Student
{
    private int numCourses;
    
    public PartTimeStudent(String name, int givenNumCourses)
    {
        super(name);
        numCourses = givenNumCourses;
    }

    /**
     * @return the numCourses
     */
    public int getNumCourses() {
        return numCourses;
    }

    /**
     * @param numCourses the numCourses to set
     */
    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
}
