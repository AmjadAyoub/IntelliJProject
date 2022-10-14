package class21;

public class Browser {
    void openBrowser() {
        System.out.println("Opening a Browser");

    }
    void navigate() {
        System.out.println("Opening the URL");
    }
    void test(){
        System.out.println("Testing the webpage");
    }
    void closeBrowser() {
        System.out.println("Close the Browser");
    }
}

class Chrome extends Browser {
    void openBrowser(String name) {
        System.out.println("Opening the Browser in less than 1 sec");
    }

}

class FireFox {
    void openBrowser() {
        System.out.println("Opening the Browser in less than 2 sec");
    }
}

class BrowserTester {
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.openBrowser();
        chrome.openBrowser("Amjad");
        chrome.closeBrowser();

    }
}
