package StudentsManager;

public class Manager {
    private int id;
    private String fullName, address, phoneNumber;

    public Manager() {
    }

    public Manager(int id, String fullName, String address, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStudentGrade(Student std, double inputGrade) {
        std.setGrade(inputGrade);
    }

    public double getAverageGradeOfStudents() {
        double avg = 0;
        for (Student s : Main.studentsList) {
            avg += s.getGrade();
        }
        return avg /= Main.studentsList.length;
    }

    public void deleteStudent(int id) {
        int index = 0;
        for (int i = 0; i < Main.studentsList.length; i++) {
            if (Main.studentsList[i].getId() == id) {
                index = i;
                break;
            }
        }
        Student[] newList = new Student[Main.studentsList.length - 1];
        for (int i = 0; i < index; i++) {
            newList[i] = Main.studentsList[i];
        }
        for (int i = index; i < Main.studentsList.length - 1; i++) {
            newList[i] = Main.studentsList[i + 1];
        }
        Main.studentsList = newList;

    }

    public void add(Student std) {
        Student[] newList = new Student[Main.studentsList.length + 1];
        for (int i = 0; i < Main.studentsList.length; i++) {
            newList[i] = Main.studentsList[i];
        }
        newList[newList.length - 1] = std;
        Main.studentsList = newList;
    }
}
