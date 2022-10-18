package class22;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the Browser");
    }
    public void test(){
        System.out.println("Perform the testing");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class Chrome extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting the Google Chrome");
    }
    public void test(){
        System.out.println("Perform the testing on Google Chrome");
    }
    public void closeBrowser(){
        System.out.println("Closing the Google Chrome");
    }
}

class FireFox extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting the FireFox");
    }
    public void test(){
        System.out.println("Perform the testing on FireFox");
    }
    public void closeBrowser(){
        System.out.println("Closing the FireFox");
    }
}

class Safari extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting the Safari");
    }
    public void test(){
        System.out.println("Perform the testing on Safari");
    }
    public void closeBrowser(){
        System.out.println("Closing the Safari");
    }
}

class WebDriverTester {
    public static void main(String[] args) {

   /*     Safari safari=new Safari();
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();
        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();
        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.test();
        fireFox.closeBrowser();*/

// using enhanced loop
        WebDriver[] browsers={new Chrome(),new Safari(),new FireFox()};
        for (WebDriver browser:browsers
        ) {
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }

        // using for loop

 for (int i=0; i<browsers.length;i++) {
     browsers[i].startBrowser();
     browsers[i].test();
     browsers[i].closeBrowser();

 }

          /* Chrome chrome=new Chrome();
        FireFox fireFox=new FireFox();
        Safari safari=new Safari();
        WebDriver[] browsers={chrome,fireFox,safari};
        */
        /*
        Creating objects of all Child classes and storing them in an array of
        type Webdriver we can do this bcause upcasting allows us to do this
         */
    }
}
