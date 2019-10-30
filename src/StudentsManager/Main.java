package StudentsManager;

public class Main {
    public static Student [] studentsList = new Student[1];
    public static void main(String[] args) {
        studentsList[0] = new Student(1,"PEPEG","OMEGALUL","0846546556465",5);
        Manager admin = new Manager();
        admin.add(new Student(2,"KEKW","OMEGALUL","09845664",10));
        System.out.println(studentsList.length);
        admin.deleteStudent(1);

        System.out.println(admin.getAverageGradeOfStudents());
    }

}
