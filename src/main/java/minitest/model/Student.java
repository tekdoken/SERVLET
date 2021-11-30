package minitest.model;

public class Student {
    private String name;
    private int id;
    private double scoreMath;
    private double scorePhysics;
    private double scoreChemistry;

    public Student() {
    }

    public Student(String name, int id, double scoreMath, double scorePhysics, double scoreChemistry) {
        this.name = name;
        this.id = id;
        this.scoreMath = scoreMath;
        this.scorePhysics = scorePhysics;
        this.scoreChemistry = scoreChemistry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhysics() {
        return scorePhysics;
    }

    public void setScorePhysics(double scorePhysics) {
        this.scorePhysics = scorePhysics;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(double scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }
}
