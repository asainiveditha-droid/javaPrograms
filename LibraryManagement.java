class Book {

    private int bookId;
    private String bookName;
    private String author;
    private double price;

    Book() {
        bookId = 0;
        bookName = "Not Assigned";
        author = "Not Assigned";
        price = 0;
    }

    Book(
        int bookId,
        String bookName,
        String author,
        double price
    ) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}


class Person {

    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {

    private int rollNumber;

    Student(
        String name,
        int age,
        int rollNumber
    ) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    void displayStudent() {
        displayPerson();

        System.out.println(
            "Roll Number: " + rollNumber
        );
    }
}


class Faculty extends Person {

    private String department;

    Faculty(
        String name,
        int age,
        String department
    ) {
        super(name, age);
        this.department = department;
    }

    void displayFaculty() {
        displayPerson();

        System.out.println(
            "Department: " + department
        );
    }
}


class AreaCalculator {

    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    double calculateArea(
        double length,
        double breadth
    ) {
        return length * breadth;
    }

    double calculateArea(
        double base,
        double height,
        boolean triangle
    ) {
        return 0.5 * base * height;
    }
}


class Vehicle {

    void display() {
        System.out.println(
            "This is a Vehicle"
        );
    }
}


class Car extends Vehicle {

    @Override
    void display() {
        System.out.println(
            "This is a Car"
        );
    }
}


class Bike extends Vehicle {

    @Override
    void display() {
        System.out.println(
            "This is a Bike"
        );
    }
}


abstract class Shape {

    abstract void draw();
}


class Circle extends Shape {

    @Override
    void draw() {
        System.out.println(
            "Drawing a Circle"
        );
    }
}


class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println(
            "Drawing a Rectangle"
        );
    }
}


interface Printable {

    void print();
}


class Report implements Printable {

    @Override
    public void print() {
        System.out.println(
            "Printing Library Report"
        );
    }
}


public class LibraryManagement{
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.setBookId(101);
        book1.setBookName(
            "Java Programming"
        );
        book1.setAuthor(
            "James Gosling"
        );
        book1.setPrice(500);

        System.out.println(
            "BOOK 1 DETAILS"
        );

        book1.displayBook();


        Book book2 = new Book(
            102,
            "Object-Oriented Programming",
            "Herbert Schildt",
            650
        );

        System.out.println(
            "\nBOOK 2 DETAILS"
        );

        book2.displayBook();


        Student student = new Student(
            "Anu",
            20,
            25
        );

        System.out.println(
            "\nSTUDENT DETAILS"
        );

        student.displayStudent();


        Faculty faculty = new Faculty(
            "Ravi",
            40,
            "Computer Science"
        );

        System.out.println(
            "\nFACULTY DETAILS"
        );

        faculty.displayFaculty();


        AreaCalculator calculator =
            new AreaCalculator();

        System.out.println(
            "\nArea of Circle: "
            + calculator.calculateArea(5)
        );

        System.out.println(
            "Area of Rectangle: "
            + calculator.calculateArea(
                10,
                5
            )
        );

        System.out.println(
            "Area of Triangle: "
            + calculator.calculateArea(
                10,
                6,
                true
            )
        );


        Vehicle vehicle;

        vehicle = new Car();
        vehicle.display();

        vehicle = new Bike();
        vehicle.display();


        Shape shape;

        shape = new Circle();
        shape.draw();

        shape = new Rectangle();
        shape.draw();


        Printable printable =
            new Report();

        printable.print();
    }
}
