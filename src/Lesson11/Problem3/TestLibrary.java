package Lesson11.Problem3;

public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook("12345", "The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("67890", "To Kill a Mockingbird", "Harper Lee");
        library.addBook("54321", "1984", "George Orwell");

        // Listing all books
        System.out.println("\nAll Books in the Library:");
        library.listAllBooks();

        // Borrowing a book
        System.out.println("\nBorrowing a Book:");
        library.borrowBook("12345");
        library.borrowBook("12345"); // Trying to borrow again

        // Listing borrowed books
        System.out.println("\nBorrowed Books:");
        library.listBorrowedBooks();

        // Returning a book
        System.out.println("\nReturning a Book:");
        library.returnBook("12345");
        library.returnBook("12345"); // Trying to return again

        // Checking if a book is borrowed
        System.out.println("\nChecking if a book is borrowed:");
        System.out.println("Is 'The Great Gatsby' borrowed? " + library.isBookBorrowed("12345"));

        // Getting details of a book
        System.out.println("\nGetting Book Details:");
        library.getBookDetails("67890");

        // Trying to get details of a non-existing book
        System.out.println("\nGetting Details of a Non-existing Book:");
        library.getBookDetails("11111");

    }
}
