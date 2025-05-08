package HamXayDung;

public class DemoHamXayDungCoThamSo {
    public String name;
    public String phone;
    //ham xay dung co tham so
    public DemoHamXayDungCoThamSo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public static void main(String[] args) {
        DemoHamXayDungCoThamSo demoHamXayDungCoThamSo = new DemoHamXayDungCoThamSo("Lee", "01234");
        DemoHamXayDungCoThamSo demoHamXayDungCoThamSo1 = new DemoHamXayDungCoThamSo("Hee", "09876");
        System.out.println(demoHamXayDungCoThamSo.name);
        System.out.println(demoHamXayDungCoThamSo.phone);
        System.out.println(demoHamXayDungCoThamSo1.name);
        System.out.println(demoHamXayDungCoThamSo1.phone);
    }
}
