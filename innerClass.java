import java.util.ArrayList;

class School {

    private String schoolName;
    private String city;
    private ArrayList<Classroom> classrooms;

    public School(String schoolName, String city) {
        this.schoolName = schoolName;
        this.city = city;
        this.classrooms = new ArrayList<>();
    }

    public void showSchoolInfo() {
        System.out.println("School: " + schoolName);
        System.out.println("City: " + city);
    }

    public void addClassroom(String name, int count) {
        Classroom c = new Classroom(name, count);
        classrooms.add(c);
    }

    public ArrayList<Classroom> getClassrooms() {
        return classrooms;
    }

    public void showAllClassrooms() {
        for (Classroom c : classrooms) {
            c.showClassInfo();
        }
    }

    class Classroom {

        private String className;
        private int studentCount;
        private ArrayList<Student> students;

        public Classroom(String className, int studentCount) {
            this.className = className;
            this.studentCount = studentCount;
            this.students = new ArrayList<>();
        }

        public void showClassInfo() {
            System.out.println("\nClass: " + className);
            System.out.println("Student count: " + studentCount);
        }

        public void addStudent(String name, int id) {
            Student s = new Student(name, id);
            students.add(s);
        }

        public void showAllStudents() {
            System.out.println("Students in " + className + ":");
            for (Student s : students) {
                s.showStudentInfo();
            }
        }

        class Student {
            private String name;
            private int id;

            public Student(String name, int id) {
                this.name = name;
                this.id = id;
            }

            public void showStudentInfo() {
                System.out.println("Name: " + name + " | ID: " + id);
            }
        }
    }

    static class Teacher {

        private String name;
        private String subject;

        public Teacher(String name, String subject) {
            this.name = name;
            this.subject = subject;
        }

        public void showTeacherInfo() {
            System.out.println("\nTeacher: " + name);
            System.out.println("Subject: " + subject);
        }
    }
}

public class innerClass {
    public static void main(String[] args) {

        School school = new School("ABC School", "Istanbul");

        school.showSchoolInfo();

        school.addClassroom("10-A", 30);
        school.addClassroom("11-B", 25);

        school.showAllClassrooms();

        School.Classroom class1 = school.getClassrooms().get(0);

        class1.addStudent("Ali", 1);
        class1.addStudent("Ayse", 2);

        class1.showAllStudents();

        School.Teacher teacher = new School.Teacher("Emily", "Mathematics");
        teacher.showTeacherInfo();
    }
}