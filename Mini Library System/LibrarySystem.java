//Creating a mini library system using the oop concepts

import java.util.*;


abstract class Book {
    private String id;
    private String title;
    private String author;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public abstract String getBookType();

    @Override
    public String toString() {
        return "[" + getBookType() + "] " + title + " by " + author + " (ID: " + id + ")";
    }
}

class TextBook extends Book {
    public TextBook(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public String getBookType() {
        return "TextBook";
    }
}

class ReferenceBook extends Book {
    public ReferenceBook(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public String getBookType() {
        return "ReferenceBook";
    }
}


class Library {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getId(), book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(String id) throws Exception {
        if (!books.containsKey(id)) {
            throw new Exception("Book ID not found.");
        }
        books.remove(id);
        System.out.println("Book removed.");
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    public Book searchById(String id) {
        return books.get(id);
    }

    public Set<String> getAllBookIds() {
        return books.keySet();
    }
}


public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        
        Book b1 = new TextBook("T101", "Java Basics", "James Gosling");
        Book b2 = new ReferenceBook("R201", "Design Patterns", "Gamma et al.");
        Book b3 = new TextBook("T102", "Data Structures", "Mark Allen");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println("\n--- Library Books ---");
        library.listBooks();

        System.out.println("\n--- Searching Book by ID: R201 ---");
        Book found = library.searchById("R201");
        System.out.println(found != null ? found : "Book not found.");

        System.out.println("\n--- Removing Book with ID: T102 ---");
        try {
            library.removeBook("T102");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        
        library.listBooks();
    }
}
