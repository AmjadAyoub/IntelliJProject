package project;

//import class23.ChromeDriver;
//import class23.FirefoxDriver;

public class Task4 {
    /*Provide Implementation for the diagram below. Then
create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes and
see which methods available to them.*/
    public static void main(String[] args) {
       RemoteWebDriver [] array= {new ChromeDriver(),new FirefoxDriver(), new SafariDriver() };
      for (RemoteWebDriver arr:array){
          arr.navigate();
          arr.getScreenshot();
          arr.open();
          arr.close();
          arr.getTitle();

       }

    /*    ChromeDriver chrome=new ChromeDriver();
        chrome.open();
        chrome.close();
        chrome.getTitle();
        chrome.navigate();

        FirefoxDriver fire=new FirefoxDriver();
        fire.open();
        fire.close();
        fire.getTitle();
        fire.navigate();

        SafariDriver safari=new SafariDriver();
        safari.open();
        safari.close();
        safari.getTitle();
        safari.navigate();   */

    }

}
interface Webdriver {
    void open();
    void close();
    void getTitle();

}
interface TakesScreenshot {
    void getScreenshot();
}
interface RemoteWebDriver extends Webdriver, TakesScreenshot {
    void navigate();

}
class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Chrome driver opens");
    }

    @Override
    public void close() {
        System.out.println("Chrome driver closes");
    }

    @Override
    public void getTitle() {
        System.out.println("chrome driver gets Google");
    }

    @Override
    public void navigate() {
        System.out.println("Chrome driver navigates");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome gets Screenshot");

    }
}
class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Firefox driver opens");
    }

    @Override
    public void close() {
        System.out.println("Firefox driver closes");
    }

    @Override
    public void getTitle() {
        System.out.println("Firefox driver gets Firefox");
    }

    @Override
    public void navigate() {
        System.out.println("Firefox driver navigates");
    }
    public void getScreenshot() {
        System.out.println("Firefox driver gets Screenshot");

    }
}
class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Safari driver opens");
    }

    @Override
    public void close() {
        System.out.println("Safari driver closes");
    }

    @Override
    public void getTitle() {
        System.out.println("Safari driver gets Safari");
    }

    @Override
    public void navigate() {
        System.out.println("Safari driver navigates");
    }
    public void getScreenshot() {
        System.out.println("Safari driver gets Screenshot");

    }
}
