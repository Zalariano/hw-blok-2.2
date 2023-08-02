public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;
    private final int ability;

    public void compareGryffindorStudents(Griffindor x) {
        if (x.getAbility() == this.getAbility()) {
            System.out.println(x.getName() + " " + "и " + this.getName() + " одинаковые гриффиндорцы");
        } else if (x.getAbility() > this.getAbility()) {
            System.out.println(x.getName() + " " + " лучший гриффиндорец чем " + this.getName());
        } else {
            System.out.println(this.getName() + " " + " лучший гриффиндорец чем " + x.getName());

        }

    }

    public Griffindor(String name, String surname, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(transgressionDistance, magicPower, name, surname);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
        this.ability = this.nobility + this.honor + this.courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int getAbility() {
        return ability;
    }

    @Override
    public String toString() {
        return "Griffindor " + "name= " + getName() + " " +
                "surname= " + getSurname() + " " + "magicPower= " + getMagicPower() + " " +
                "transgressionDistance= " + getTransgressionDistance() + " " +
                "nobility= " + nobility + " " +
                "honor= " + honor + " " +
                "courage= " + courage;
    }
}
