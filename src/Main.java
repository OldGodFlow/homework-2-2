public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 100, 100, 88, 99, 100);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 87, 86, 100, 98, 80);
        Gryffindor ronWeasly = new Gryffindor("Ron Weasly", 77, 87, 78, 95, 60);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 98, 89, 100, 96, 100, 100);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 77, 65, 87, 99, 86, 79);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 74, 66, 81, 80, 74, 98);

        Hufflepuff zachariaSmith = new Hufflepuff("Zacharia Smith", 67, 75, 88, 98, 100);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 87, 65, 93, 84, 93);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 86, 73, 88, 89, 93);

        Ravenclaw choChang = new Ravenclaw("Cho Chang", 76, 79, 100, 100, 100, 94);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 99, 78, 80, 100, 75, 80);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 84, 79, 84, 80, 85, 76);

        cedricDiggory.compare(choChang);
        gregoryGoyle.compare(padmaPatil);

    }

}