public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name,String surname,int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(magicPower, transgressionDistance,name,surname);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff " + "name= " + getName() + " " +
                "surname= " + getSurname() + " " + "magicPower= " + getMagicPower() + " " +
                "transgressionDistance= " + getTransgressionDistance()+ " " +
                "hardworking= " + hardworking +
                "loyal= " + loyal +
                "honest= " + honest;
    }
}
