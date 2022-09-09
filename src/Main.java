import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SuperGreeter superGreeter = new SuperGreeter();
        Scanner scanner = new Scanner(System.in);

        System.out.printf(superGreeter.getDetVirker());
        System.out.println("Hvad er dit navn?");
        superGreeter.setNavn(scanner.nextLine());
        System.out.println("hej " + superGreeter.getNavN());

        System.out.println("Hvor gammel er du?");
        superGreeter.setAge(scanner.nextInt());
        System.out.println("Hej " + superGreeter.getNavN() + " , du er " + superGreeter.getAge());


    }
}