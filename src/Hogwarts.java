public class Hogwarts {
    private  int magicPower;
    private  int transgressionDistance;
    private  String name;
    private  String surname;

    public Hogwarts(int magicPower, int transgressionDistance,String name,String surname) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
        this.name = name;
        this.surname = surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
