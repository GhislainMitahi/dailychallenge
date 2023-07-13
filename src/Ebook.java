public class Ebook extends Book {
    private String format;
    Ebook(String title, String auth,int pageCount, String format){
        super(title, auth, pageCount);
        this.format = format;
    }
}
