public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String name,String surname,int magicPower, int transgressionDistance, int smart, int wise, int witty, int fullOfCreativity) {
        super(magicPower, transgressionDistance,name,surname);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
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

    @Override
    public String toString() {
        return "Ravenclaw " + "name= " + getName() + " " +
                "surname= " + getSurname() + " " + "magicPower= " + getMagicPower() + " " +
                "transgressionDistance= " + getTransgressionDistance()+ " " +
                "smart= " + smart + " " +
                "wise= " + wise + " " +
                "witty= " + witty + " " +
                "fullOfCreativity= " + fullOfCreativity;
    }
}
