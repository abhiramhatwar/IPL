public class Batsman extends Player {
    private int runsScored;
    private double battingAverage;

    public Batsman(String name, int age, int runsScored, double battingAverage) {
        super(name, age, "Batsman");
        this.runsScored = runsScored;
        this.battingAverage = battingAverage;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    @Override
    public void displayPlayerInfo() {
        super.displayPlayerInfo();
        System.out.println("Runs Scored: " + runsScored);
        System.out.println("Batting Average: " + battingAverage);
    }
}
