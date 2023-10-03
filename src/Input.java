import java.util.Scanner;

// Behandlar input från användare, kollar efter ogiltiga input och skickar vidare informationen till olika metoder

public class Input {
    private String userInput;


    Scanner scan = new Scanner(System.in);
    Library library = new Library();

    public void initialyzeBookshelf(boolean startingBookshelf) {
        Book book01 = new Book("Harry potter", "Rowling", 800);
        Book book02 = new Book("Java", "Jan Skansholm", 420);
        Book book03 = new Book("Bible", "Jesus", 2000);
        library.setBookShelf(book01);
        library.setBookShelf(book02);
        library.setBookShelf(book03);
    }

    public String getUserInput(String userChoice) {
        if (userChoice.equals("1")) {
            System.out.println("För att hyra bok sök på antingen titel eller författare");
            String userSearch = scan.nextLine();
            library.searchForBookAndRentItOut(userSearch);

        } else if (userChoice.equals("2")) {
            System.out.println("Dom här böckerna finns inne just nu:  ");
            System.out.println(library.getBookShelf());

        } else if (userChoice.equals("3")) {
            System.out.println("Skriv in titel på boken du vill lämna in: ");
            String returnBookTitle = scan.nextLine();
            System.out.println("Skriv in författare: ");
            String authorReturned = scan.nextLine();
            System.out.println("Skriv in sidantal i siffror: ");
            String pageAmountReturned = scan.nextLine();
            int pageAmountReturnedInt = 0;
            for (int i = 0; i < pageAmountReturned.length(); i++) {
                char character = pageAmountReturned.charAt(i);
                if (character != '1' && character != '2' && character != '3' && character != '4' && character != '5' && character != '6' && character != '7' && character != '8' && character != '9' && character != '0') {
                    System.out.println("Fel input av sidantal. Använd bara hela siffror");
                    break;
                } else if (pageAmountReturned.length() == i + 1) {
                    pageAmountReturnedInt = Integer.parseInt(pageAmountReturned); //Här kan programmet krascha pga vad jag tror är hur parseInt tar bara in max 10 tal i följd
                    Book book = new Book(returnBookTitle, authorReturned, pageAmountReturnedInt);
                    library.setBookShelf(book);
                }
            }

        } else if (userChoice.equals("4")) {
            System.out.println("Tack för ditt besök. Välkommen åter");
            System.exit(0);
        } else {
            System.out.println("Felaktig input. Skriv in en siffra mellan 1 och 4 för att få hjälp.");
        }
        return userInput;
    }
}