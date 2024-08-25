public class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;
    static {
        System.out.println("Welcome to coder's library");
        totalBooks = 0;
    }
    {
        totalBooks++;
    }
    Book(String isbn, String title, String author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }
    Book(String isbn){
        this("isbn", "unknown","unknown");
    }

    public static int getTotalBooks() {
        return totalBooks;
    }
    public void borrowbook(){
        if(isBorrowed){
            System.out.println("Sorry this( " + title + " ) book is already borrowed by someone");
        }
        else {
            this.isBorrowed = true;
            System.out.println("enjoy the book and please return the book in time " + title);
        }
    }
    public void returnBook(){
        if (isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed the book " + title);
        }else {
            System.out.println( title + " book is already in library");
        }
    }

    public static void main(String[] args) {
        Book newbook = new Book("1", "Wonders of world", "Dr. peter lalu");
        Book nextElections = new Book("2");
        System.out.println(Book.getTotalBooks());
        newbook.borrowbook();
        newbook.borrowbook();
        nextElections.returnBook();
        newbook.returnBook();

    }
}

