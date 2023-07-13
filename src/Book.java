public class Book {
    private String title;
    private String auth;
    private int pageCount;

    Book(String title, String auth,int pageCount){
        this.title = title;
        this.auth = auth;
        this.pageCount = pageCount;
    }

    public String getTitle(){
       return this.title;
    }
    public String getAuth(){
        return this.auth;
    }

    public int getPageCount(){
        return this.pageCount = pageCount;
    }
    public String toString(){
        return String.format("%s by %S ", this.title, this.auth);
    }
}
