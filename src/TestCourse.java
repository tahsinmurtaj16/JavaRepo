public class TestCourse
{
    public static void main(String[] args)
    {
        Course c = new Course("OOP");
        Course c1 = new Course("CN");

        c.addStudent("Tahsin");
        c.addStudent("Murtaj");
        c.addStudent("Mohammad");

        c1.addStudent("Mohammad");
        c1.addStudent("Tahsin");

        System.out.println("The number of students in "+c.getCourseName()+" is "+c.getNumberOfStudents());
       String[] std = c.getStudents();
        for(int i = 0 ;i<c.getNumberOfStudents();i++)
        {
            System.out.print(std[i]+", ");
        }
        System.out.println();
        System.out.println("The number of Students in "+c1.getCourseName()+" is "+c1.getNumberOfStudents());
        std = c1.getStudents();
        for(int i = 0 ;i<c1.getNumberOfStudents();i++)
        {
            System.out.print(std[i]+", ");
        }
        System.out.println();
    }
}