public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;
    private final int ability;

    public void compareHufflepuffStudents(Hufflepuff c) {
        if (this.getAbility() == c.getAbility()) {
            System.out.println(this.getName() + " " + "и " + c.getName() + " одинаковые когтевранцы");
        } else if (this.getAbility() > c.getAbility()) {
            System.out.println(this.getName() + " " + " лучший когтевранец чем " + c.getName());
        } else {
            System.out.println(c.getName() + " " + " лучший когтевранец чем " + this.getName());

        }

    }

    public Hufflepuff(String name, String surname, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(magicPower, transgressionDistance, name, surname);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
        this.ability = this.hardworking + this.loyal + this.honest;
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

    public int getAbility() {
        return ability;
    }

    @Override
    public String toString() {
        return "Hufflepuff " + "name= " + getName() + " " +
                "surname= " + getSurname() + " " + "magicPower= " + getMagicPower() + " " +
                "transgressionDistance= " + getTransgressionDistance() + " " +
                "hardworking= " + hardworking +
                "loyal= " + loyal +
                "honest= " + honest;
    }
}
