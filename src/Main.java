public class Main {

    public static void showStudent(Hogwarts harryPotter) {
        System.out.println(harryPotter.toString());
    }

    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Harry", "Potter", 80, 70, 40, 50, 67);
        Griffindor hermioneGrenger = new Griffindor("Hermione", "Granger", 90, 100, 20, 35, 48);
        Griffindor ronWeasley = new Griffindor("Ron", "Weasley", 40, 27, 44, 87, 90);
        Slytherin dracoMalfoy = new Slytherin("Draco", "Malfoy", 70, 65, 44, 80, 20, 36, 42);
        Slytherin grahamMontagu = new Slytherin("Graham", "Montagu", 64, 65, 87, 90, 0, 22, 12);
        Slytherin gregoryGoyle = new Slytherin("Gregory", "Goyle", 55, 70, 38, 27, 40, 36, 39);
        Ravenclaw zhouChang = new Ravenclaw("Zhou", "Chang", 89, 87, 94, 77, 56, 48);
        Ravenclaw padmaPatil = new Ravenclaw("Padma", "Patil", 67, 92, 58, 55, 69, 80);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus", "Belby", 46, 54, 60, 70, 55, 80);
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias", "Smith", 65, 81, 78, 80, 75);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric", "Diggory", 98, 55, 30, 80, 95);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin", "Finch-Fletchley", 79, 55, 80, 60, 55);

        showStudent(marcusBelby);
        showStudent(padmaPatil);
        showStudent(grahamMontagu);
        showStudent(hermioneGrenger);
        ronWeasley.compareGryffindorStudents(harryPotter);
        dracoMalfoy.compareSlytherinStudents(gregoryGoyle);
        zhouChang.compareRavenclawStudents(marcusBelby);
        cedricDiggory.compareHufflepuffStudents(zachariasSmith);
        justinFinchFletchley.compareHogwartsffStudents(hermioneGrenger);
    }
}