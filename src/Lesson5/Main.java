package Lesson5;

public class Main {
    public static void main(String[] args) {

        //Employee1
    Employee employee1 = new Employee("Yulia", "QA Engineer", "jm@gmail.com", "891244455", 100000, 30);

        //Employee2
        Employee employee2 = new Employee("Denis", "GM", "gm@gmail.com", "890033355", 900000, 35);

        //Employee3
        Employee employee3 = new Employee("Nadya", "Team Leader", "nadya@gmail.com", "892233344", 74000, 56);

        //Employee4
        Employee employee4 = new Employee("Vadim", "Manager", "vadim@gmail.com", "890112345", 65000, 50);

        //Employee5
        Employee employee5 = new Employee("Sergey", "Sales Specialist", "sergey@gmail.com", "893322645", 70000, 45);

        Employee[] employees = new Employee[]{employee1, employee2, employee3, employee4, employee5};

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].Info();
            }
        }
    }
}
