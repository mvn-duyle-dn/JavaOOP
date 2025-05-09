package TinhDongGoi;

public class LoginPage {
    private String url = "https://crm.anhtester.com";
    private String Email;
    private String Password;

    public String getUrl() {
        return url;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

//    public void setUrl(String url) {
//        this.url = url;
//    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
    public void LoginCRM(){
        System.out.println("Open url: " + getUrl());
        System.out.println("Enter email: " + getEmail());
        System.out.println("Enter password: "+ getPassword());
    }
    public void LoginCRMAdmin(){
        System.out.println("Open url admin: " + getUrl() + "/authentication");
    }
    public void LoginCRMCustomer(){
        System.out.println("Open url customer: " + getUrl() + "/authentication/login");
    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
//        loginPage.setUrl("https://crm.anhtester.com/authentication/login");
        loginPage.setEmail("admin@example.com");
        loginPage.setPassword("123456");
        loginPage.LoginCRM();
        LoginPage loginPage1 = new LoginPage();
//        loginPage1.setUrl("https://crm.anhtester.com/authentication/login");
        loginPage1.setEmail("customer@example.com");
        loginPage1.setPassword("123456");
        loginPage1.LoginCRM();
        loginPage.LoginCRMAdmin();
        loginPage.LoginCRMCustomer();
    }
}
