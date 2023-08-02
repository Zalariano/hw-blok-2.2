public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    private final int ability;

    public void compareSlytherinStudents(Slytherin y) {
        if (y.getAbility() == this.getAbility()) {
            System.out.println(y.getName() + " " + "и " + this.getName() + " одинаковые слизеринцы");
        } else if (y.getAbility() > this.getAbility()) {
            System.out.println(y.getName() + " " + " лучший слизеринец чем " + this.getName());
        } else {
            System.out.println(this.getName() + " " + " лучший слизеринец чем " + y.getName());

        }

    }

    public Slytherin(String name, String surname, int magicPower, int transgressionDistance, int resourcefulness, int lustForPower, int cunning, int determination, int ambition) {
        super(magicPower, transgressionDistance, name, surname);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
        this.ability = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int getAbility() {
        return ability;
    }

    @Override
    public String toString() {
        return "Slytherin " + "name= " + getName() + " " +
                "surname= " + getSurname() + " " + "magicPower= " + getMagicPower() + " " +
                "transgressionDistance= " + getTransgressionDistance() + " " +
                "cunning= " + cunning + " " +
                "determination= " + determination + " " +
                "ambition= " + ambition + " " +
                "resourcefulness= " + resourcefulness + " " +
                "lustForPower= " + lustForPower;
    }
}
