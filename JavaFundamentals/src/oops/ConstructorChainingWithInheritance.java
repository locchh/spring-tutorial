package oops;

class Document {

    String name;
    String type;
    int size;

    public Document(){
        System.out.println("Document Class Constructor Invoked");
        name = "Unknown";
    }

    public Document(String name){
        this.name = name;
        System.out.println("Document Class Parameterized Constructor Invoked");
    }
}

class PDF extends Document{
    String author;

    public PDF(){
        //super(); // Calling Parent Class Constructor
        System.out.println("PDF Class Constructor Invoked");
        author = "Unknown";
    }

    public PDF(String author, String name){
        super(name); // Calling Parent Class Parameterized Constructor
        this.author = author;
        System.out.println("PDF Class Parameterized Constructor Invoked");
    }


}
public class ConstructorChainingWithInheritance {
    public static void main(String[] args) {

        PDF pdf = new PDF();
        System.out.println("Name: " + pdf.name);
        System.out.println("Author: " + pdf.author);

        PDF pdf1 = new PDF("John Doe", "Java Programming");
        System.out.println("Name: " + pdf1.name);
        System.out.println("Author: " + pdf1.author);
    }
}
