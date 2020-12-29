import java.util.Scanner;
public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    static Management managementOfficier = new Management();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1.ADD OFFICIER");
            System.out.println("2.FIND OFFICIER BY NAME");
            System.out.println("3.SHOW LIST OFFICIER");
            System.out.println("0.EXIT");
            choice = Integer.parseInt(SCANNER.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter number of officiers you want to add");
                    int number = Integer.parseInt(SCANNER.nextLine());
                    for (int i = 0; i < number; i++) {
                        addOfficier();
                    }
                    break;
                case 2:
                    System.out.println("Enter name you want to find");
                    String name = SCANNER.nextLine();
                    managementOfficier.findByName(name);
                    break;
                case 3:
                    managementOfficier.displayAll();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static void addOfficier() {
        System.out.println("Enter name:");
        String name = SCANNER.nextLine();
        System.out.println("Enter birthday");
        String birthday = SCANNER.nextLine();
        System.out.println("Enter gender");
        String gender = SCANNER.nextLine();
        System.out.println("Enter address");
        String address = SCANNER.nextLine();
        System.out.println("Enter task");
        String task = SCANNER.nextLine();
        System.out.println("Enter level");
        String level = SCANNER.nextLine();
        System.out.println("Enter major");
        String major = SCANNER.nextLine();
        Officier staff = new Staff(name, birthday, gender, address, task);
        Officier worker = new Worker(name, birthday, gender, address, level);
        Officier engineer = new Engineer(name, birthday, gender, address, major);
        Officier officier = new Officier(name, birthday, gender, address);
        System.out.println("Enter object you want to add OFFICIER/STAFF/WORKER/ENGINEER");
        String result = SCANNER.nextLine();
        if(result.equalsIgnoreCase("Officier")){
            managementOfficier.addOfficier(officier);
            System.out.println("Successfully added");
        } else if (result.equalsIgnoreCase("Staff")){
            managementOfficier.addOfficier(staff);
            System.out.println("Successfully added");
        } else if(result.equalsIgnoreCase("Worker")){
            managementOfficier.addOfficier(worker);
            System.out.println("Successfully added");
        } else if (result.equalsIgnoreCase("engineer")){
            managementOfficier.addOfficier(engineer);
            System.out.println("Successfully added");
        }
    }
}
