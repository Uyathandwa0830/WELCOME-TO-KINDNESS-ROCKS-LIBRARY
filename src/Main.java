
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //CREATE AN ARRAY LISTS
    static ArrayList<Book> BookCollection = new ArrayList();
    static ArrayList<Member> MemberCollection = new ArrayList();

    public Main() {
    }

    public static void AddBook() { //create method addBook
        System.out.println("Enter Book Title: "); //UserInput
        Scanner Title = new Scanner(System.in);
        String title = Title.nextLine();
        System.out.println("Enter Author Name: "); //UserInput
        Scanner Author = new Scanner(System.in);
        String author = Author.nextLine();
        System.out.println("Enter ISBN: "); //UserInput
        Scanner ISBN = new Scanner(System.in);
        Long isbn = ISBN.nextLong();
        Book books = new Book(title, author, isbn);
        BookCollection.add(books);
        System.out.println(title + " by " + author + " has been added");
    }

    public static void searchBar() {
        String[] books = new String[]{"Things I Never Said To Myself", "All Hope Is Found", "Hamlet", "It Ends With Us", "The Alchemist"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title of the book to search:"); //USER INPUT
        String searchTitle = scanner.nextLine(); //READLINE
        int index = searchBar(books, searchTitle);
        if (index != -1) {
            System.out.println("Book not found");
        } else {
            System.out.println("Book not found.");
        }

    }

    private static int searchBar(String[] books, String searchTitle) {
        return 0;
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"; //Enter valid email input
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void AddMember() {
        System.out.println("Enter Member Name: "); //UserInput
        Scanner MemberName = new Scanner(System.in);
        String name = MemberName.nextLine();
        String email = "";
        boolean Valid = false;

        while(!Valid) {
            System.out.println("Enter Member Email: "); //UserInput
            Scanner Email = new Scanner(System.in);
            email = Email.nextLine();
            Valid = isValidEmail(email);
            if (!Valid) {
                System.out.println("Invalid Email");
            }
        }

        new Member(name, email);
    }

    public void checkoutBook(Book book, Member member) {
        if (!book.Availability) {
            System.out.println("Book Unavailable");
        } else {
            System.out.println("Book Is Available");
        }

        book.Availability = false;
    }

    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList();
        Book book1 = new Book("Things I Never Said To Myself", "Duduzile Noeleen Ngwenya", 978063972023L);
        Book book2 = new Book("All Hope Is Found", "Sarah Jakes", 9781400339877L);
        Book book3 = new Book("Hamlet", "William Shakespeare", 9780140707342L);
        Book book4 = new Book("It Ends With Us", "Collen Hover", 9781501110368L);
        Book book5 = new Book("The Alchemist", "Paulo Coelho", 9780694524440L);
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        ArrayList<Member> libraryMembers = new ArrayList();
        Member member1 = new Member("Duduzile Noeleen Ngwenya", "noeleen@example.com");
        Member member2 = new Member("Sarah Jakes", "sarah@example.com");
        Member member3 = new Member("William Shakespeare", "willian@example.com");
        Member member4 = new Member("Collen Hover", "collen@example.com");
        Member member5 = new Member("Paulo Coelho", "paulo@example.com");
        libraryMembers.add(member1);
        libraryMembers.add(member2);
        libraryMembers.add(member3);
        libraryMembers.add(member4);
        libraryMembers.add(member5);
        System.out.println("WELCOME TO KINDNESS ROCKS LIBRARY"); //LIST OF BOK ITEMS
        System.out.println("1. ADD A BOOK: ");
        System.out.println("2. SEARCH FOR A BOOK:");
        System.out.println("3.REGISTER A NEW MEMBER");
        System.out.println("4.RETURN A BOOK");
        System.out.println("5.Display Books");
        System.out.println("6.EXIT");
        System.out.print("Choose an Option: ");
        Scanner userInput = new Scanner(System.in);
        switch (userInput.nextLine()) {
            case "1" -> AddBook();
            case "2" -> searchBar();
            case "3" -> AddMember();
            case "4" -> AddBook();
            case "5" -> DisplayBooks(library);
            case "6" -> System.exit(0);
        }

        main(args);
    }

    public static void DisplayBooks(ArrayList<Book> books) {
        //CREATE A FOR LOOP TO DISPLAY BOOKS IN ORDER
        for(int l = 0; l < books.size(); ++l) {
            int L = l + 1;
            System.out.println("(" + L + ") " + ((Book)books.get(l)).Title + " by " + ((Book)books.get(l)).Author);
        }

    }
}
