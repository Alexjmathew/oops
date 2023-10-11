import java.util.Scanner;

public class PlayerStatsTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        
        String[] playerNames = new String[numPlayers];
        int[] goals = new int[numPlayers];
        int[] assists = new int[numPlayers];

      
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("\nEnter details for Player " + (i + 1));
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            playerNames[i] = scanner.nextLine();
            System.out.print("Goals: ");
            goals[i] = scanner.nextInt();
            System.out.print("Assists: ");
            assists[i] = scanner.nextInt();
        }

        System.out.println("\nPlayer Stats Table");
                System.out.printf("%s %s %s/n", "Player Name", "Goals", "Assists");
               for (int i = 0; i < numPlayers; i++) {
            System.out.printf("%-20s %-10d %-10d%n", playerNames[i], goals[i], assists[i]);
        }

        scanner.close();
    }
}
