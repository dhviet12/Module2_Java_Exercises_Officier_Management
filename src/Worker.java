public class Worker extends Officier {
    private String level;

    public Worker(String name, String birthday, String gender, String address, String level) {
        super(name, birthday, gender, address);
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString()+ "level =" + level;
    }
}
