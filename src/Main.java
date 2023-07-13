//import java.util.Scanner;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User User = new User("Ghislain Mitahi", "1910-01-01");
        Book carmilla = new Book("Qui a picker mon fromage", "Ghislain Mitahi", 20000);
        AudioBook dracula = new AudioBook("Deracula", "Bram Stocker", 50000);
        Ebook jeeves = new Ebook("Carry On Jeeves", "P.G. Wodehouse", 50000, "PDF");

        User.borrow(carmilla);

        System.out.printf("%s was born back in %s and here is now %d years olds. \n", User.getName(), User.getBirthDay().toString(), User.age());
        System.out.printf("%s has borrowed these books:%s \n", User.getName(), User.borrowBooks());
        System.out.printf(dracula.toString());
        System.out.printf(jeeves.toString());

    }
}