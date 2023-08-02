public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name,String surname,int magicPower, int transgressionDistance, int resourcefulness, int lustForPower,int cunning,int determination,int ambition) {
        super(magicPower, transgressionDistance,name,surname);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
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

    @Override
    public String toString() {
        return "Slytherin " + "name= " + getName() + " " +
                "surname= " + getSurname() + " " + "magicPower= " + getMagicPower() + " " +
                "transgressionDistance= " + getTransgressionDistance()+ " " +
                "cunning= " + cunning + " " +
                "determination= " + determination + " " +
                "ambition= " + ambition + " " +
                "resourcefulness= " + resourcefulness + " " +
                "lustForPower= " + lustForPower;
    }
}
