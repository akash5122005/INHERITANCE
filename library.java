
class LibraryItem {
    
    protected String title;
    protected int itemID;


    public LibraryItem(String title, int itemID) {
        this.title = title;
        this.itemID = itemID;
    }

    
    public void displayDetails() {
        System.out.println("Title: " + title + ", Item ID: " + itemID);
    }
}


class Book extends LibraryItem {
    private String author;
    private String ISBN;

  
    public Book(String title, int itemID, String author, String ISBN) {
        super(title, itemID); 
        this.author = author;
        this.ISBN = ISBN;
    }


    public void displayBookDetails() {
        System.out.println("Book: " + title + ", Item ID: " + itemID +
                ", Author: " + author + ", ISBN: " + ISBN);
    }


    @Override
    public void displayDetails() {
        displayBookDetails();
    }
}


class Magazine extends LibraryItem {
    private int issueNumber;
    private String publicationDate;


    public Magazine(String title, int itemID, int issueNumber, String publicationDate) {
        super(title, itemID); 
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    
    public void displayMagazineDetails() {
        System.out.println("Magazine Details: \nTitle: " + title + ", Magazine ID: " + itemID +
                ", Issue Number: " + issueNumber + ", Publication Date: " + publicationDate);
    }

    
    @Override
    public void displayDetails() {
        displayMagazineDetails();
    }
}

public class Main {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);


        int choice = scanner.nextInt();
        scanner.nextLine(); 

        if (choice == 1) {
            
           
            String title = scanner.nextLine();

            
            int bookID = scanner.nextInt();
            scanner.nextLine(); 

        
            String author = scanner.nextLine();

    
            String ISBN = scanner.nextLine();

            
            Book book = new Book(title, bookID, author, ISBN);
            
            book.displayDetails();

        } else if (choice == 2) {
           
           
            String title = scanner.nextLine();

          
            int magazineID = scanner.nextInt();
            scanner.nextLine(); 


            int issueNumber = scanner.nextInt();
            scanner.nextLine(); 

          
            String publicationDate = scanner.nextLine();

        
            Magazine magazine = new Magazine(title, magazineID, issueNumber, publicationDate);
        
            magazine.displayDetails();
        } 

        scanner.close();
    }
}
