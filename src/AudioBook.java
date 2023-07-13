public class AudioBook extends Book {
    private int runTime;

    AudioBook(String title, String auth, int runTime){
        super(title, auth, 0);
        this.runTime = runTime;
    }
}
