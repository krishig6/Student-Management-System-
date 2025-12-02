import java.util.Scanner;
import java.util.ArrayList;

public class StudentManagementSystem {
    static class Student {
        int id;
        int age;
        String name;
        String course;

        Student() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter student's name: ");
            this.name = input.nextLine();
            System.out.println("Enter student's age: ");
            this.age = input.nextInt();
            input.nextLine();
            System.out.println("Enter student's course: ");
            this.course = input.nextLine();
            System.out.println("Enter student's id: ");
            this.id = input.nextInt();
            input.nextLine();
        }

        void printdetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Course : " + course);
            System.out.println("ID: " + id);
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int searchId;
        while (true) {
            System.out.println("Student Management System");
            System.out.println("Enter 1 to add a student");
            System.out.println("Enter 2 to view students");
            System.out.println("Enter 3 to exit");
            System.out.println("Enter 4 to search student by ID");
            System.out.println("Enter 5 to update a student");
            System.out.println("Enter 6 to delete a student");
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    Student a = new Student();
                    students.add(a);
                    System.out.println("Student is added");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("no students found");
                    } else {
                        System.out.println("Students list: ");
                        for (int i = 0; i < students.size(); i++) {
                            students.get(i).printdetails();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting ");
                    input.close();
                    break;

                case 4:
                    System.out.println("Enter the ID to search: ");
                    searchId = input.nextInt();
                    boolean found = false;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).id == searchId) {
                            System.out.println("Match found");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No match found");
                    }
                    break;
                case 5:
                    System.out.println("Enter the ID to search: ");
                    searchId = input.nextInt();
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).id == searchId) {
                            System.out.println("Enter your name: ");
                            students.get(i).name = input.nextLine();
                            System.out.println("Enter your age: ");
                            students.get(i).age = input.nextInt();
                            input.nextLine();
                            System.out.println("Enter your course: ");
                            students.get(i).course = input.nextLine();
                            System.out.println("Enter your ID: ");
                            students.get(i).id = input.nextInt();
                            input.nextLine();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Enter the ID to search: ");
                    searchId = input.nextInt();
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).id == searchId) {
                            students.remove(i);
                            System.out.println("Student removed");
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
            }
        }
    }
}