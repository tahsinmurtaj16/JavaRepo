public class TestBook {
    public static void main(String[] args) {
     Book b1 = new Book("Introduction to java","D. Liang","Pearson",3000000);
        Book b2 = new Book("The Hobbit","G.R.R. Tolkien","Allen & Unwin",60000000);
        Book b3 = new Book("Angel & Demons","Dan Brown","Corgi Books",10000000);
        System.out.println("Author name: "+b1.getAuthor()+" Book name: "+b1.getTitle());
        System.out.println("Author name: "+b2.getAuthor()+" Book name: "+b2.getTitle());
        System.out.println("Author name: "+b3.getAuthor()+" Book name: "+b3.getTitle());

    }
}
class Book{
    private String title;
    private String author;
    private String publisher;
    private int copiesSold;

    public Book(String title,String author,String publisher,int copiesSold)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copiesSold = copiesSold;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(final String publisher) {
        this.publisher = publisher;
    }

    public int getCopiesSold() {
        return this.copiesSold;
    }

    public void setCopiesSold(final int copiesSold) {
        this.copiesSold = copiesSold;
    }
}