
public class Book {
    //IMPLEMENT BOOK CLASS
    //CREATE BOOK PROPERTIES
    public String Title;
    public String Author;
    public Long ISBN;
    public Boolean Availability;

    public Book(String Title, String Author, Long ISBN) {
        //ADD CONSTRUCTOR
        this.Title = Title;
        this.Author = Author;
        this.ISBN = ISBN;
        this.Availability = true;
    }

    public void toggleAvailability() {
        this.Availability = !this.Availability;
    }
}
