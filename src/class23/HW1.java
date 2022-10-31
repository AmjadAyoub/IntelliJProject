package class23;

public class HW1 {
    /*Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method while open is
      an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
       Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc*/


    public static void main(String[] args) {
        File [] arr= {new JavaFile(), new PdfFile(), new WordFile()};
        for(File array: arr) {
            array.open();
        }

        }
    }

  abstract class File {
    abstract void open();

    void Edit() {
        System.out.println("Edit the file");
    }
    void Close () {
        System.out.println("Close the file");
    }

}
class JavaFile extends File {
    void open() {
        System.out.println("You will need notepad");
    }

}
class WordFile extends File{
    void open() {
        System.out.println("You will need Microsoft word");
    }

}
class PdfFile extends File {
    void open() {
        System.out.println("You will need Adobe Reader");
    }

}

class FileTester {
    public static void main(String[] args) {

    }

}
