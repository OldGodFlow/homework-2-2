public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public int calculateSpecificScore() {
        return cunning + determination + resourcefulness + thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}' + super.toString();
    }
}
