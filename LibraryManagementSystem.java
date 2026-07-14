import java.util.ArrayList;
import java.util.Scanner;


class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        int choice = 0;

        while (choice != 5) {

            System.out.println("\n Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();

                System.out.print("Enter Author Name: ");
                String author = sc.nextLine();

                Book b = new Book(id, title, author);
                books.add(b);

                System.out.println("Book added successfully.");

            } else if (choice == 2) {

                if (books.size() == 0) {
                    System.out.println("No books available.");
                } else {

                    for (int i = 0; i < books.size(); i++) {

                        System.out.println("---------------------");
                        System.out.println("Book ID : " + books.get(i).id);
                        System.out.println("Title   : " + books.get(i).title);
                        System.out.println("Author  : " + books.get(i).author);
                    }
                }

            } else if (choice == 3) {

                System.out.print("Enter Book ID to search: ");
                int searchId = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < books.size(); i++) {

                    if (books.get(i).id == searchId) {

                        System.out.println("Book Found");
                        System.out.println("Book ID : " + books.get(i).id);
                        System.out.println("Title   : " + books.get(i).title);
                        System.out.println("Author  : " + books.get(i).author);

                        found = true;
                    }
                }

                if (found == false) {
                    System.out.println("Book not found.");
                }

            } else if (choice == 4) {

                System.out.print("Enter Book ID to delete: ");
                int deleteId = sc.nextInt();

                boolean deleted = false;

                for (int i = 0; i < books.size(); i++) {

                    if (books.get(i).id == deleteId) {

                        books.remove(i);
                        deleted = true;
                        break;
                    }
                }

                if (deleted == true) {
                    System.out.println("Book deleted successfully.");
                } else {
                    System.out.println("Book not found.");
                }

            } else if (choice == 5) {

                System.out.println("Program closed.");

            } else {

                System.out.println("Invalid choice.");

            }

        }

        sc.close();
    }
}
