package kr.co.popool.domain;

import kr.co.popool.entity.ScoreGrade;

public class Career {


    private Long id;
    private String name;
    private ScoreGrade grade;

    private String period;

    private Long historyID;



    public Career(Long id, String name, ScoreGrade grade, String period, Long historyID) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.period = period;
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



    public Long getHistoryID() {
        return historyID;
    }

    public void setHistoryID(Long historyID) {
        this.historyID = historyID;
    }


    public void setGrade(ScoreGrade grade) {
        this.grade = grade;
    }

    public ScoreGrade getGrade() {
        return grade;
    }
}

