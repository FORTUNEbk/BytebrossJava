import java.util.ArrayList;
import java.util.Scanner;

public class CrudOperation {
    public static void main(String[] args) {
        int choice;
        Scanner s = new Scanner(System.in);
        ArrayList<Employees> al = new ArrayList<>();

        do {
            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. UPDATE");
            System.out.println("0. EXIT");
            System.out.println("Enter Your Choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Employee No: ");
                    int empno = s.nextInt();

                    s.nextLine(); // Consume newline

                    System.out.println("Enter Employee Name:");
                    String ename = s.nextLine();

                    System.out.println("Enter Employee Salary:");
                    int Salary = s.nextInt();

                    al.add(new Employees(empno, ename, Salary));
                    break;

                case 2:
                    System.out.println("Employee List:");
                    for (Employees emp : al) {
                        System.out.println(emp);
                    }
                    break;

                case 3:
                    System.out.println("Enter Employee No to UPDATE:");
                    int updateEmpNo = s.nextInt();

                    Employees empToUpdate = null;
                    for (Employees emp : al) {
                        if (emp.getEmpno() == updateEmpNo) {
                            empToUpdate = emp;
                            break;
                        }
                    }

                    if (empToUpdate != null) {
                        s.nextLine(); // Consume newline

                        System.out.println("Enter New Employee Name:");
                        String newEname = s.nextLine();

                        System.out.println("Enter New Employee Salary:");
                        int newSalary = s.nextInt();

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

    public static class Employees {
        private int empno;
        private String ename;
        private int Salary;

        public Employees(int empno, String ename, int Salary) {
            this.empno = empno;
            this.ename = ename;
            this.Salary = Salary;
        }

        public int getEmpno() {
            return empno;
        }

        public int getSalary() {
            return Salary;
        }

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public void setSalary(int Salary) {
            this.Salary = Salary;
        }

        @Override
        public String toString() {
            return empno + " " + ename + " " + Salary;
        }
    }
}
