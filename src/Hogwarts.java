public class Hogwarts {
    private int magicPower;
    private int transgressionDistance;
    private String name;
    private String surname;

    public void compareHogwartsffStudents(Hogwarts v) {
        if (this.getMagicPower() == v.getMagicPower() && this.getTransgressionDistance() == v.getTransgressionDistance()) {
            System.out.println(this.getName() + " равен по силе магии и расстоянию трансгрессии с " + v.getName());
        } else if (this.getMagicPower() == v.getMagicPower() && this.getTransgressionDistance() > v.getTransgressionDistance()) {
            System.out.println(this.getName() + " равен по силе магии " + v.getName() + " но его расстояние трансгрессии больше ");

        } else if (this.getMagicPower() == v.getMagicPower() && this.getTransgressionDistance() < v.getTransgressionDistance()) {
            System.out.println(this.getName() + " равен по силе магии " + v.getName() + " но его расстояние трансгрессии меньше ");

        } else if (this.getMagicPower() > v.getMagicPower() && this.getTransgressionDistance() == v.getTransgressionDistance()) {
            System.out.println(this.getName() + " равен по расстоянию трансгрессии с " + v.getName() + " но его сила магии больше ");
        } else if (this.getMagicPower() < v.getMagicPower() && this.getTransgressionDistance() == v.getTransgressionDistance()) {
            System.out.println(this.getName() + " равен по расстоянию трансгрессии с " + v.getName() + " но его сила магии меньше ");

        } else if (this.getMagicPower() > v.getMagicPower() && this.getTransgressionDistance() > v.getTransgressionDistance()) {
            System.out.println(this.getName() + " cильнее по всем показателям чем " + v.getName());
        } else if (this.getMagicPower() < v.getMagicPower() && this.getTransgressionDistance() < v.getTransgressionDistance()) {
            System.out.println(this.getName() + " слабее по всем показателям чем " + v.getName());
        } else if (this.getMagicPower() < v.getMagicPower() && this.getTransgressionDistance() > v.getTransgressionDistance()) {
            System.out.println(this.getName() + " расстояние трансгрессии больше чем у " + v.getName() + " но его сила магии меньше ");
        } else {
            System.out.println(this.getName() + " расстояние трансгрессии меньше чем  у " + v.getName() + " но его сила магии больше ");
        }


    }

    public Hogwarts(int magicPower, int transgressionDistance, String name, String surname) {
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
