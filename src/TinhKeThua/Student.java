package TinhKeThua;

public class Student extends Person{
    private String gender;
    private String address;
    public Student(String name, int age, Float height, String gender, String address){
        super(name, age, height);
        this.gender = gender;
        this.address = address;
    }

    public void showInfo(){
        getInfo(); //tu class person
        System.out.println("gender:" + this.gender);
        System.out.println("address:" + this.address);

    }
    public static void main(String[] args) {
        Student student = new Student("Lee", 20, 165.5F, "male", "danang");
        student.showInfo();
    }
}
