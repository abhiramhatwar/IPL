public class Bowler extends Player {
    private int wicketsTaken;
    private double bowlingAverage;

    public Bowler(String name, int age, int wicketsTaken, double bowlingAverage) {
        super(name, age, "Bowler");
        this.wicketsTaken = wicketsTaken;
        this.bowlingAverage = bowlingAverage;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public double getBowlingAverage() {
        return bowlingAverage;
    }

    @Override
    public void displayPlayerInfo() {
        super.displayPlayerInfo();
        System.out.println("Wickets Taken: " + wicketsTaken);
        System.out.println("Bowling Average: " + bowlingAverage);
    }
}
