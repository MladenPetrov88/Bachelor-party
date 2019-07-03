import java.util.Scanner;

public class BachelorParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int singer = Integer.parseInt(scanner.nextLine());
        String full = scanner.nextLine();
        int people = 0;
        int moneyCounter = 0;

        while (!full.equalsIgnoreCase("The restaurant is full")){
            int groups =Integer.parseInt(full);

            people+=groups;
            if (groups>=5){
                moneyCounter+=groups*70;
            } else {
                moneyCounter+=groups*100;
            }
            full=scanner.nextLine();
        }

        if (moneyCounter>=singer){
            System.out.printf("You have %d guests and %d leva left.",
                    people, moneyCounter-singer);
        }
        else{
            System.out.printf("You have %d guests and %d leva income, but no singer.",
                    people, moneyCounter);
        }

    }
}
