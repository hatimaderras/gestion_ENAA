import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private static ArrayList<Apprenant> apprenants = new ArrayList<>();
    private static ArrayList<Formateur> formateurs = new ArrayList<>();
    private static ArrayList<classe> classes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Manage Apprenants");
            System.out.println("2. Manage Formateurs");
            System.out.println("3. Manage Classes");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manageApprenants(scanner);
                    break;
                case 2:
                    manageFormateurs(scanner);
                    break;
                case 3:
                    manageClasses(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    private static void manageApprenants(Scanner scanner) {
        while (true) {
            System.out.println("\n--- Manage Apprenants ---");
            System.out.println("1. Add Apprenant");
            System.out.println("2. View Apprenants");
            System.out.println("3. delete Apprenants");
            System.out.println("4. update Apprenants");
            System.out.println("5. Back to Main Menu");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addApprenant(scanner);
                    break;
                case 2:
                    viewApprenants();
                    break;
                case 3:
                    deleteApprenant(scanner);
                    return;
                case 4:
                    updateApprenant(scanner);
                    return;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
