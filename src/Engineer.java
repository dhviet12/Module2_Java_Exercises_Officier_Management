public class Engineer extends Officier{
    private String major;

    public Engineer(String name, String birthday, String gender, String address, String major) {
        super(name, birthday, gender, address);
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString()+ "major ="+ major;
    }
}
