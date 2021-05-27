package ca.sheridancollege.week1.softwarefundamentals;
/**
 * This class models Students. Student have a name and
 * a studentID.
 *
 * @author Joy Jieun Jung 2021
 */
public class Student
{
    private String name;
    private String studentID;

    public Student (String givenname, String givenstudentID)
    {
        name = givenname;
        studentID = givenstudentID;
    }

    public Student (String givenName)
    {
        name = givenName;
    }

    public Student ()
    {
        // intentionally left blank
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getStudentID ()
    {
        return studentID;
    }

    public void setStudentID (String studentID)
    {
        this.studentID = studentID;
    }

}
