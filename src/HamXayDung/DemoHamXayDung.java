package HamXayDung;

public class DemoHamXayDung {
    public String name;
    public String phone;

    //ham xay dung (giong ten class)
    public DemoHamXayDung() {
        name = "Lee";
        phone = "123456";
    }

    public static void main(String[] args) {
        DemoHamXayDung demoHamXayDung = new DemoHamXayDung();
        System.out.println(demoHamXayDung.name);
        System.out.println(demoHamXayDung.phone);
    }
}
