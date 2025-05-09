package TinhTruuTuong;

public class WebUI extends Actions{
    @Override
    public void openUrl(String url) {
        System.out.println("Open url: " + url);
    }

    @Override
    public void clickElement() {
        System.out.println("Click element");
    }

    @Override
    public void setText(String text) {
        System.out.println("Input text: " + text);
    }

    @Override
    public void setText(String text, String keys) {
        System.out.println("Input text: " + text);
        System.out.println("Enter: " + keys);
    }
}
