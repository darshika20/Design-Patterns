public class StudentVO {

    private int roll;
    private String name;

    public StudentVO(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "StudentVO{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
