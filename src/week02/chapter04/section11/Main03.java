package week02.chapter04.section11;

// Interface

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    @Override
    public void show() {
        System.out.println("Showing document.");
    }

    @Override
    public void print() {
        System.out.println("Printing document.");
    }
}

public class Main03 {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.show();
        doc.print();
    }
}
