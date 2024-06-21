package Lesson11.Problem3;

import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author) {
        if(books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " already exists in the library.");
        } else {
           books.put(ISBN, new Book(ISBN, title, author));
            System.out.println("Book added to the library: " + title);
        }
    }

    public void borrowBook(String ISBN) {
        if (!books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " does not exist in the library.");
            return;
        }

        Book book = books.get(ISBN);
        if (book.isBorrowed()) {
            System.out.println("Book with ISBN " + ISBN + " is already borrowed.");
        } else {
            book.setBorrowed(true);
            System.out.println("Book borrowed: " + book.getTitle());
        }
    }

    public void returnBook(String ISBN) {
        if (!books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " does not exist in the library.");
            return;
        }

        Book book = books.get(ISBN);
        if(book.isBorrowed()) {
            book.setBorrowed(false);
            System.out.println("Book return: " + book.getTitle());
        } else {
            System.out.println("Book with ISBN " + ISBN + " was not borrowed.");
        }
    }

    public boolean isBookBorrowed(String ISBN) {
        if (!books.containsKey(ISBN)) {
            return false;
        }
        Book book = books.get(ISBN);
        return book.isBorrowed();
    }

    public void getBookDetails(String ISBN) {
        if(!books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " does not exist in the library.");
        } else {
            Book book = books.get(ISBN);
            System.out.println("Book detail : " + book);
        }
    }

    public void listAllBooks() {
        for (Book book: books.values()) {
            System.out.println(book);
        }
    }

    public void listBorrowedBooks() {
        for(Book book : books.values()) {
            if(book.isBorrowed()) {
                System.out.println("The borrowed Books : " + book.getTitle() );
            }

        }
    }


}
