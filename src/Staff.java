public class Staff extends Officier{
    private String task;

    public Staff(String name, String birthday, String gender, String address, String task) {
        super(name, birthday, gender, address);
        this.task = task;
    }

    @Override
    public String toString() {
        return super.toString()+ "task= "+ task;
    }
}
