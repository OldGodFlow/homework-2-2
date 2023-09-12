public abstract class Hogwarts {
    private String name;

    private int magicPower;

    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    private void compareTotalScore(Hogwarts hogwarts) {
        int thisScore = this.getMagicPower() + this.getTransgressionDistance();
        int otherScore = hogwarts.getMagicPower() + hogwarts.getTransgressionDistance();

        if (thisScore > otherScore) {
            System.out.println(this.getName() + " сильнее, чем " + hogwarts.getName());
        } else if (thisScore < otherScore) {
            System.out.println(hogwarts.getName() + " сильнее, чем " + this.getName());
        } else {
            System.out.println("Ученики " + this.getName() + " и " + hogwarts.getName() + " одинаково сильны");
        }
    }

    abstract public int calculateSpecificScore();

    private void compareSpecificScore(Hogwarts hogwarts) {
        int thisScore = this.calculateSpecificScore();
        int otherScore = hogwarts.calculateSpecificScore();

        if (thisScore > otherScore) {
            System.out.println(this.getName() + " сильнее, чем " + hogwarts.getName());
        } else if (thisScore < otherScore) {
            System.out.println(hogwarts.getName() + " сильнее, чем " + this.getName());
        } else {
            System.out.println("Ученики " + this.getName() + " и " + hogwarts.getName() + " одинаково сильны");
        }

    }

    public void compare(Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            compareSpecificScore(hogwarts);
        } else {
            compareTotalScore(hogwarts);
        }
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}