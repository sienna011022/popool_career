package kr.co.popool.domain;

public class Career {


    private Long id;
    private String name;

    private String period;
    private final ScoreGrade score;
    private final int attendance;

    private final int sincerity;
    private final int positiveness;

    private final int techincal;
    private final int cooperative;

    private int average;

    private Long historyID;



    public Career(Long id, String name, String period, ScoreGrade score, int attendance, int sincerity, int positiveness, int techincal, int cooperative, int average, Long historyID) {
        this.id = id;
        this.name = name;
        this.period = period;
        this.score = score;
        this.attendance = attendance;
        this.sincerity = sincerity;
        this.positiveness = positiveness;
        this.techincal = techincal;
        this.cooperative = cooperative;
        this.average = average;
        this.historyID = historyID;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public ScoreGrade getScore() {
        return score;
    }

    public ScoreGrade setScore(ScoreGrade score) {
        return score;

    }

    public Long getHistoryID() {
        return historyID;
    }

    public void setHistoryID(Long historyID) {
        this.historyID = historyID;
    }


    public int getAttendance() {
        return attendance;
    }

    public int getSincerity() {
        return sincerity;
    }

    public int getPositiveness() {
        return positiveness;
    }

    public int getTechincal() {
        return techincal;
    }

    public int getCooperative() {
        return cooperative;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

}

