package TinhKeThua;

public class Person {
    String name;
    int age;
    Float height;
    public Person(String name, int age, Float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void getInfo(){
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("height: " + this.height);
    }

    public static void main(String[] args) {
        Person person = new Person("lee", 20, 165.8F);
        person.getInfo();
    }
}
