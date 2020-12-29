import java.util.ArrayList;

public class Management {
    private ArrayList<Officier> officiers = new ArrayList<>();

    public void addOfficier(Officier officier) {
        officiers.add(officier);
    }

    public void findByName(String name) {
        boolean notFound = true;
        for (int i = 0; i < officiers.size(); i++) {
            Officier officier = officiers.get(i);
            boolean hasName = officier.getName().equalsIgnoreCase(name);
            if (hasName) {
                notFound = false;
                System.out.println(officier);
            }
        }
        if (notFound) {
            System.out.println("Not found");
        }
    }

    public void displayAll() {
        System.out.println(officiers);
    }
}
