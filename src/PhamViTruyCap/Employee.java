package PhamViTruyCap;

public class Employee {
    private String name = "LEE";
    private int age = 20;

    private void getName(){
        System.out.println(name);
    }
    private void getInfo(){
        System.out.println(name + " and "+ age);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getName();
        employee.getInfo();
    }
}
