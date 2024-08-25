package Challenges.in.example.Library;

public class TestLibraryItem {
    static int noOfBook;
    protected String itemId;
    protected String title;
    protected String author;
    boolean isBookAvailable;
    {
        noOfBook++;
    }

    public TestLibraryItem(String itemId) {
        this(itemId, "Unknown", "unknown");
    }

    protected TestLibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    protected void checkout(){
        if (!(isBookAvailable)){
            this.isBookAvailable = true;
            System.out.println("Thank your for checking out the book");
        }else {
            System.out.println("Book is not Available");
        }
    }

    public static int getTotalNoOfBooks() {
        return noOfBook;
    }

    protected void returnItem(){
        if (isBookAvailable){
            this.isBookAvailable = false;
            System.out.println("Thank your for returning the book");
        }else {
            System.out.println("Book is already available in Library");
        }
    }
    public static void main(String[] args) {
        TestLibraryItem designOfThings = new TestLibraryItem("1", "Design", "Author");
        TestLibraryItem myBook = new TestLibraryItem("2");
        System.out.println(TestLibraryItem.getTotalNoOfBooks());
        designOfThings.checkout();
        myBook.returnItem();
        designOfThings.checkout();
        designOfThings.returnItem();
        designOfThings.returnItem();
    }
}
