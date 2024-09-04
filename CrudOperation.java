import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CrudOperation {
    public static void main(String[] args) {
        int choice = -1;
        Scanner s = new Scanner(System.in);
        ArrayList<Employees> al = new ArrayList<>();

        do {
            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. UPDATE");
            System.out.println("0. EXIT");
            System.out.print("Enter Your Choice: ");
            
            while (true) {
                try {
                    choice = s.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Invalid input! Please enter a number: ");
                    s.next(); // Consume the invalid input
                }
            }

            switch (choice) {
                case 1:
                    int empno = 0;
                    String ename;
                    int salary = 0;

                    while (true) {
                        System.out.print("Enter Employee No: ");
                        try {
                            empno = s.nextInt();
                            if (isEmpnoUnique(al, empno)) {
                                break; // Empno is unique, exit loop
                            } else {
                                System.out.println("Employee number already exists! Please enter a different Employee No.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.print("Invalid input! Please enter a valid Employee No: ");
                            s.next(); // Consume the invalid input
                        }
                    }

                    s.nextLine(); // Consume newline

                    System.out.print("Enter Employee Name: ");
                    ename = s.nextLine();

                    System.out.print("Enter Employee Salary: ");
                    while (true) {
                        try {
                            salary = s.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.print("Invalid input! Please enter a valid Salary: ");
                            s.next(); // Consume the invalid input
                        }
                    }

                    al.add(new Employees(empno, ename, salary));
                    break;

                case 2:
                    System.out.println("Employee List:");
                    for (Employees emp : al) {
                        System.out.println(emp.toString());
                    }
                    break;

                case 3:
                    int updateEmpNo = 0;

                    System.out.print("Enter Employee No to UPDATE: ");
                    while (true) {
                        try {
                            updateEmpNo = s.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.print("Invalid input! Please enter a valid Employee No: ");
                            s.next(); // Consume the invalid input
                        }
                    }

                    Employees empToUpdate = null;
                    for (Employees emp : al) {
                        if (emp.getEmpno() == updateEmpNo) {
                            empToUpdate = emp;
                            break;
                        }
                    }

                    if (empToUpdate != null) {
                        s.nextLine(); // Consume newline

                        System.out.print("Enter New Employee Name: ");
                        String newEname = s.nextLine();

                        System.out.print("Enter New Employee Salary: ");
                        int newSalary = 0;
                        while (true) {
                            try {
                                newSalary = s.nextInt();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.print("Invalid input! Please enter a valid Salary: ");
                                s.next(); // Consume the invalid input
                            }
                        }

                        empToUpdate.setEname(newEname);
                        empToUpdate.setSalary(newSalary);

                        System.out.println("Employee details updated successfully.");
                    } else {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter again.");
            }

        } while (choice != 0);

        s.close();
    }

    // Method to check if an Employee No is unique
    public static boolean isEmpnoUnique(ArrayList<Employees> al, int empno) {
        for (Employees emp : al) {
            if (emp.getEmpno() == empno) {
                return false;
            }
        }
        return true;
    }

    public static class Employees {
        private int empno;
        private String ename;
        private int salary;

        public Employees(int empno, String ename, int salary) {
            this.empno = empno;
            this.ename = ename;
            this.salary = salary;
        }

        public int getEmpno() {
            return empno;
        }

        public int getSalary() {
            return salary;
        }

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employees [empno=" + empno + ", ename=" + ename + ", Salary=" + salary + "]";
        }
    }
}
