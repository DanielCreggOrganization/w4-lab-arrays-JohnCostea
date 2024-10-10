package ie.atu.arrays;

public class ArrayOfObjects {public static void main(String[] args) {
    // Array of Strings (which are objects in Java)
    String[] names = {"Alice", "Bob", "Charlie"};

    // Array of custom objects
    Student[] students = new Student[2];

    students[0] = new Student("Dave", 20);
    students[1] = new Student("Eva", 22);

    for (Student student : students) {
        System.out.println(student.getName() + " is " + student.getAge() + " years old.");
    }

    Book[] books = new Book[3];
    books[0] = new Book("The Heist", "David Bergman");
    books[1] = new Book("The Boys", "John Newman");
    books[2] = new Book("Rose Red", "Stephen King");

    for (Book Books : books) {
        System.out.println("The book " + Books.getTitle() + " is written by " + Books.getAuthor());
    }

}
}
