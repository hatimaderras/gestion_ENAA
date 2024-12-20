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
    private static void addApprenant(Scanner scanner) {
        System.out.println("Enter ID:");
        int ID = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Name:");
        String Nom = scanner.nextLine();

        System.out.println("Enter Prenom:");
        String Prenom = scanner.nextLine();

        System.out.println("Enter Email:");
        String Email = scanner.nextLine();

        int n = 0;
        while (true) {
            System.out.println("Enter number of notes (maximum 10):");
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n <= 0 || n > 10) {  // Set a reasonable limit on the number of notes
                    System.out.println("Please enter a valid number of notes between 1 and 10.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for notes.");
            }
        }

        int[] notes = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter note " + (i + 1) + ":");
            notes[i] = scanner.nextInt();
        }

        Apprenant apprenant = new Apprenant(ID, Nom, Prenom, Email, notes);
        apprenants.add(apprenant);

        System.out.println("Apprenant added successfully!");
    }
    private static void viewApprenants() {
        if (apprenants.isEmpty()) {
            System.out.println("No apprenants available.");
        } else {
            for (Apprenant apprenant : apprenants) {
                System.out.println(apprenant);
            }
        }
    }

