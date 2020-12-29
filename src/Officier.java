public class Officier {
    private String name;
    private String birthday;
    private String gender;
    private String address;

    public Officier(String name, String birthday, String gender, String address) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
    }

    public Officier() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Officier{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
