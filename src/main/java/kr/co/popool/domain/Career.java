package kr.co.popool.domain;

public class Career {

    private Long id;
    private String name;

    private String period;
    private Long score;

    private Long historyID;




    public Career(Long id, String name, String period, Long score, Long historyID) {
        this.id = id;
        this.name = name;
        this.period = period;
        this.score = score;
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

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getHistoryID() {
        return historyID;
    }

    public void setHistoryID(Long historyID) {
        this.historyID = historyID;
    }


}

