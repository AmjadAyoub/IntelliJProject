package class23;

public class HW2 {
    //Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(),
    //maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
    public static void main(String[] args) {
        WebDriver[] arr = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver array : arr) {
            array.openBrowser();
            array.closeBrowser();
            array.findElement();
            array.maximizeWindow();

        }

    }
}

interface WebDriver {

    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();


}

class ChromeDriver implements WebDriver {


    @Override
    public void openBrowser() {
        System.out.println("Open chrome driver");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Close chrome driver");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize window of chrome");

    }

    @Override
    public void findElement() {
        System.out.println("Find element of chrome driver");

    }
}

class FirefoxDriver implements WebDriver {


    @Override
    public void openBrowser() {
        System.out.println("Open firefox driver");

    }

    @Override
    public void closeBrowser() {
        System.out.println("close firefox Driver");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window of Firefox driver");

    }

    @Override
    public void findElement() {
        System.out.println("Find element of Firefox Driver");

    }
}




