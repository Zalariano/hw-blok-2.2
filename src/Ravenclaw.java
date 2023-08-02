public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;
    private final int ability;

    public void compareRavenclawStudents(Ravenclaw z) {
        if (this.getAbility() == z.getAbility()) {
            System.out.println(this.getName() + " " + "и " + z.getName() + " одинаковые когтевранцы");
        } else if (this.getAbility() > z.getAbility()) {
            System.out.println(this.getName() + " " + " лучший когтевранец чем " + z.getName());
        } else {
            System.out.println(z.getName() + " " + " лучший когтевранец чем " + this.getName());

        }

    }

    public Ravenclaw(String name, String surname, int magicPower, int transgressionDistance, int smart, int wise, int witty, int fullOfCreativity) {
        super(magicPower, transgressionDistance, name, surname);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
        this.ability = this.smart + this.wise + this.witty + this.fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getAbility() {
        return ability;
    }

    @Override
    public String toString() {
        return "Ravenclaw " + "name= " + getName() + " " +
                "surname= " + getSurname() + " " + "magicPower= " + getMagicPower() + " " +
                "transgressionDistance= " + getTransgressionDistance() + " " +
                "smart= " + smart + " " +
                "wise= " + wise + " " +
                "witty= " + witty + " " +
                "fullOfCreativity= " + fullOfCreativity;
    }
}
