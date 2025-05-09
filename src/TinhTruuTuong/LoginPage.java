package TinhTruuTuong;

public class LoginPage {
    public static void main(String[] args) {
        WebUI webUI = new WebUI();
        webUI.openUrl("https://crm.anhtester.com/authentication/login");
        webUI.setText("admin@example.com");
        webUI.setText("123456");
        webUI.clickElement();
    }
}
