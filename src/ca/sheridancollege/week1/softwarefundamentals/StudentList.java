package ca.sheridancollege.week1.softwarefundamentals;

/**
 * This class creates an array of Student Object
 * and prints out their names
 *
 * @author Joy Jieun Jung 2021
 */
public class StudentList
{
    /**
     * Creates an array of Student Object
     *
     * @param args the command line arguments
     */
    public static void main (String[] args)
    {
        Student[] studentList = new Student[5];
        Student Ola = new Student("Ola");
        studentList[0] = Ola;
        //System.out.println(studentList[0].getStudentID());
        studentList[1] = new Student("Chi");
        // System.out.println(studentList[1]);
        studentList[2] = new Student("Nadia");
        studentList[3] = new Student("Markus");
        studentList[4] = new Student("Vitalii");

        for (Student s : studentList) {
            System.out.println(s.getName());// shortcut: sout+tab
        }

    }
}
