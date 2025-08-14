import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Parent class
class ManagementSystem {
    protected String systemName;
    protected List<String> logs;

    public ManagementSystem(String systemName) {
        this.systemName = systemName;
        this.logs = new ArrayList<>();
    }

    public void addLog(String log) {
        logs.add(log);
    }

    public void showLogs() {
        System.out.println("\n--- System Logs ---");
        for (String log : logs) {
            System.out.println(log);
        }
    }

    public void displaySystemName() {
        System.out.println("Management System: " + systemName);
    }
}

// Child class
class School extends ManagementSystem {
    private List<String> students;
    private List<String> teachers;

    public School(String systemName) {
        super(systemName);
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public void addStudent(String name) {
        students.add(name);
        addLog("Student added: " + name);
    }

    public void addTeacher(String name) {
        teachers.add(name);
        addLog("Teacher added: " + name);
    }

    public void showStudents() {
        System.out.println("\n--- Students ---");
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (String s : students) {
                System.out.println(s);
            }
        }
    }

    public void showTeachers() {
        System.out.println("\n--- Teachers ---");
        if (teachers.isEmpty()) {
            System.out.println("No teachers found.");
        } else {
            for (String t : teachers) {
                System.out.println(t);
            }
        }
    }
}
class SchoolManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School school = new School("ABC Public School");

        int choice;
        do {
            System.out.println("\n===== School Management Menu =====");
            school.displaySystemName();
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Show Students");
            System.out.println("4. Show Teachers");
            System.out.println("5. Show Logs");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String sName = sc.nextLine();
                    school.addStudent(sName);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter teacher name: ");
                    String tName = sc.nextLine();
                    school.addTeacher(tName);
                    System.out.println("Teacher added successfully!");
                    break;

                case 3:
                    school.showStudents();
                    break;

                case 4:
                    school.showTeachers();
                    break;

                case 5:
                    school.showLogs();
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}