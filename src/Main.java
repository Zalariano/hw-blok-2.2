public class Main {

    public static void showStudent(Hogwarts harryPotter) {
        System.out.println(harryPotter.toString());
    }

    public static void compareGryffindorStudents(Griffindor harryPotter,Griffindor ronWeasley){
        int firstSumm = harryPotter.getCourage() + harryPotter.getHonor() + harryPotter.getNobility();
        int secondSumm = ronWeasley.getCourage() + ronWeasley.getHonor()+ ronWeasley.getNobility();
        if (firstSumm == secondSumm){
            System.out.println(harryPotter.getName() + " "+ "и " + ronWeasley.getName() +" одинаковые гриффиндорцы");
        } else if (firstSumm>secondSumm) {
            System.out.println(harryPotter.getName() + " " + " лучший гриффиндорец чем " + ronWeasley.getName());
        }else {System.out.println(ronWeasley.getName() + " " + " лучший гриффиндорец чем " + harryPotter.getName());

        }

    }

    public static void compareSlytherinStudents(Slytherin dracoMalfoy,Slytherin grahamMontagu){
        int firstSumm = dracoMalfoy.getAmbition() + dracoMalfoy.getCunning() + dracoMalfoy.getDetermination() + dracoMalfoy.getLustForPower()+ dracoMalfoy.getResourcefulness() ;
        int secondSumm = dracoMalfoy.getAmbition() + grahamMontagu.getCunning()+ grahamMontagu.getDetermination()+ grahamMontagu.getLustForPower()+ grahamMontagu.getResourcefulness();
        if (firstSumm == secondSumm){
            System.out.println(dracoMalfoy.getName() + " "+ "и " + grahamMontagu.getName() +" одинаковые слизеринцы");
        } else if (firstSumm>secondSumm) {
            System.out.println(dracoMalfoy.getName() + " " + " лучший слизеринец чем " + grahamMontagu.getName());
        }else {System.out.println(grahamMontagu.getName() + " " + " лучший слизеринец чем " + dracoMalfoy.getName());

        }

    }

    public static void compareRavenclawStudents(Ravenclaw zhouChang,Ravenclaw padmaPatil){
        int firstSumm = zhouChang.getFullOfCreativity() + zhouChang.getSmart() + zhouChang.getWise()+ zhouChang.getWitty();
        int secondSumm = padmaPatil.getFullOfCreativity() + padmaPatil.getSmart() + padmaPatil.getWise()+ padmaPatil.getWitty();
        if (firstSumm == secondSumm){
            System.out.println(zhouChang.getName() + " "+ "и " + padmaPatil.getName() +" одинаковые когтевранцы");
        } else if (firstSumm>secondSumm) {
            System.out.println(zhouChang.getName() + " " + " лучший когтевранец чем " + padmaPatil.getName());
        }else {System.out.println(padmaPatil.getName() + " " + " лучший когтевранец чем " + zhouChang.getName());

        }

    }

    public static void compareHufflepuffStudents(Hufflepuff cedricDiggory,Hufflepuff justinFinchFletchley){
        int firstSumm = cedricDiggory.getHardworking() + cedricDiggory.getHonest() + cedricDiggory.getLoyal();
        int secondSumm = justinFinchFletchley.getHardworking() + justinFinchFletchley.getHonest() + justinFinchFletchley.getLoyal();
        if (firstSumm == secondSumm){
            System.out.println(cedricDiggory.getName() + " "+ "и " + justinFinchFletchley.getName() +" одинаковые когтевранцы");
        } else if (firstSumm>secondSumm) {
            System.out.println(cedricDiggory.getName() + " " + " лучший когтевранец чем " + justinFinchFletchley.getName());
        }else {System.out.println(justinFinchFletchley.getName() + " " + " лучший когтевранец чем " + cedricDiggory.getName());

        }

    }

    public static void compareHogwartsffStudents(Hogwarts cedricDiggory,Hogwarts justinFinchFletchley){
        if (cedricDiggory.getMagicPower()== justinFinchFletchley.getMagicPower() && cedricDiggory.getTransgressionDistance() == justinFinchFletchley.getTransgressionDistance()){
            System.out.println(cedricDiggory.getName() + " равен по силе магии и расстоянию трансгрессии с " + justinFinchFletchley.getName());
        } else if (cedricDiggory.getMagicPower()== justinFinchFletchley.getMagicPower() && cedricDiggory.getTransgressionDistance()> justinFinchFletchley.getTransgressionDistance()) {
            System.out.println(cedricDiggory.getName() + " равен по силе магии " + justinFinchFletchley.getName() + " но его расстояние трансгрессии больше ");
            
        } else if (cedricDiggory.getMagicPower()== justinFinchFletchley.getMagicPower() && cedricDiggory.getTransgressionDistance()< justinFinchFletchley.getTransgressionDistance()) {
            System.out.println(cedricDiggory.getName() + " равен по силе магии " + justinFinchFletchley.getName() + " но его расстояние трансгрессии меньше ");
            
        } else if (cedricDiggory.getMagicPower()> justinFinchFletchley.getMagicPower() && cedricDiggory.getTransgressionDistance()== justinFinchFletchley.getTransgressionDistance()) {
            System.out.println(cedricDiggory.getName() + " равен по расстоянию трансгрессии с " + justinFinchFletchley.getName() + " но его сила магии больше ");
        } else if (cedricDiggory.getMagicPower()< justinFinchFletchley.getMagicPower() && cedricDiggory.getTransgressionDistance()== justinFinchFletchley.getTransgressionDistance()) {
            System.out.println(cedricDiggory.getName() + " равен по расстоянию трансгрессии с " + justinFinchFletchley.getName() + " но его сила магии меньше ");

        } else if (cedricDiggory.getMagicPower()> justinFinchFletchley.getMagicPower() && cedricDiggory.getTransgressionDistance()> justinFinchFletchley.getTransgressionDistance()) {
            System.out.println(cedricDiggory.getName() + " cильнее по всем показателям чем " + justinFinchFletchley.getName());
        }else if (cedricDiggory.getMagicPower()< justinFinchFletchley.getMagicPower() && cedricDiggory.getTransgressionDistance()< justinFinchFletchley.getTransgressionDistance()){
            System.out.println(cedricDiggory.getName() + " слабее по всем показателям чем " + justinFinchFletchley.getName());
        } else if (cedricDiggory.getMagicPower()< justinFinchFletchley.getMagicPower() && cedricDiggory.getTransgressionDistance()> justinFinchFletchley.getTransgressionDistance()) {
            System.out.println(cedricDiggory.getName() + " расстояние трансгрессии больше чем у " + justinFinchFletchley.getName() + " но его сила магии меньше ");
        }else {
            System.out.println(cedricDiggory.getName() + " расстояние трансгрессии меньше чем  у " + justinFinchFletchley.getName() + " но его сила магии больше ");
        }


    }

    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Harry", "Potter", 80, 70, 40, 50, 67);
        Griffindor hermioneGrenger = new Griffindor("Hermione", "Granger", 90, 100, 20, 35, 48);
        Hogwarts ronWeasley = new Griffindor("Ron", "Weasley", 40, 27, 44, 87, 90);
        Slytherin dracoMalfoy = new Slytherin("Draco","Malfoy",70,65,44,80,20,36,42);
        Slytherin grahamMontagu = new Slytherin("Graham","Montagu",64,65,87,90,0,22,12);
        Slytherin gregoryGoyle = new Slytherin("Gregory","Goyle",55,70,38,27,40,36,39);
        Ravenclaw zhouChang = new Ravenclaw("Zhou","Chang",89,87,94,77,56,48);
        Ravenclaw padmaPatil = new Ravenclaw("Padma","Patil",67,92,58,55,69,80);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus","Belby",46,54,60,70,55,80);
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias","Smith",65,81,78,80,75);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric","Diggory",98,55,30,80,95);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin","Finch-Fletchley",79,55,80,60,55);

        showStudent(marcusBelby);
        showStudent(cedricDiggory);
        showStudent(grahamMontagu);
        showStudent(hermioneGrenger);
        compareGryffindorStudents(harryPotter, hermioneGrenger);
        compareSlytherinStudents(dracoMalfoy, gregoryGoyle);
        compareRavenclawStudents(zhouChang, marcusBelby);
        compareHufflepuffStudents(cedricDiggory, zachariasSmith);
        compareHogwartsffStudents(cedricDiggory,hermioneGrenger);
    }
}