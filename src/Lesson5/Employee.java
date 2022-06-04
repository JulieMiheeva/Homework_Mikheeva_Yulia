package Lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void Info () {
        System.out.println("["+ name + ", " + position + ", " + email + ", "
                + phone + ", " + salary + ", " + age + "]");
    }

    public int getAge() {
        return age;
    }
}
