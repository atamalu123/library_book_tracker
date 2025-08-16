/*
Implement methods that let users add new books, remove books from the collection, 
and search for books by attributes such as title or author. The tracker should maintain 
a collection of books in memory, which could be stored using an ArrayList or similar data structure. 

The CLI should provide a simple menu where users can enter commands to perform each action. 
Error handling (e.g., trying to remove a non-existent book) should be considered for a 
smoother user experience
*/
import java.util.ArrayList;
import java.util.Scanner;

public class BookTracker {
    
    private ArrayList<Book> BookList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {

        // Menu
        System.out.println("Library Menu:");
        System.out.println("1: Add book");
        System.out.println("2. Remove book");
        System.out.println("3. Search book");
        System.out.println("4. List all books");
        System.out.println("5. Exit");

        // CLI
        while (true) { 

            // Get input
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            // Route input
            switch(choice) {
                case 1 -> addBook();
                case 2 -> removeBook();
                case 3 -> searchBook();
                case 4 -> listAllBooks();
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    // Add book to library
    private void addBook() {

        // Get book title
        System.out.println("Enter book title: ");
        String title = scanner.nextLine();

        // Get author
        System.out.println("Enter author name: ");
        String authorName = scanner.nextLine();

        // Get genre
        System.out.println("Enter genre: ");
        String genre = scanner.nextLine();

        // Get ISBN
        System.out.println("Enter ISBN: ");
        String isbn = scanner.nextLine();

        // Add to book list
        BookList.add(new Book(title, new Author(authorName), genre, isbn));
        System.out.println(title + " added to books!");
    }

    // Remove book from library
    private void removeBook() {
        // Get ISBN
        System.out.println("Enter ISBN of book to remove: ");
        String isbn = scanner.nextLine();

        // Remove book from list
        BookList.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Book (ISBN: " + isbn + ") removed!");
    }

    // Find book in library
    private void searchBook() {
        // Get book title
        System.out.println("Enter title to search: ");
        String title = scanner.nextLine();

        // Loop across BookList to find book
        for(Book book : BookList){
            if(book.getTitle().equalsIgnoreCase(title)){
                System.out.println("Found book: " + title);
                return;
            }
        }
        // If book doesn't exist
        System.out.println("Book not found.");
    }

    // List all books in library
    private void listAllBooks() {
        if(BookList.isEmpty()) {
            System.out.println("No books have been added to the list.");
        } else {
            BookList.forEach(System.out::println);
        }
    }
    
}
