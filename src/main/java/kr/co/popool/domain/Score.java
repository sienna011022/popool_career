package kr.co.popool.domain;

import kr.co.popool.entity.ScoreGrade;

public class Score {

    private Long careerId;



    private Long evaluatorId;

    private ScoreGrade grade;
    private int attendance;

    private  int sincerity;
    private int positiveness;

    private int techincal;
    private int cooperative;

    private int average;

    public Score(ScoreGrade grade, Long careerId, Long evaluatorId, int attendance, int sincerity, int positiveness, int techincal, int cooperative, int average) {
        this.careerId = careerId;
        this.evaluatorId = evaluatorId;
        this.grade = grade;
        this.attendance = attendance;
        this.sincerity = sincerity;
        this.positiveness = positiveness;
        this.techincal = techincal;
        this.cooperative = cooperative;
        this.average = average;
    }


    public Long getCareerId() {
        return careerId;
    }

    public void setCareerId(Long careerId) {
        this.careerId = careerId;
    }

    public Long getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(Long evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public ScoreGrade getGrade() {
        return grade;
    }

    public void setGrade(ScoreGrade grade) {
        this.grade = grade;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public int getSincerity() {
        return sincerity;
    }

    public void setSincerity(int sincerity) {
        this.sincerity = sincerity;
    }

    public int getPositiveness() {
        return positiveness;
    }

    public void setPositiveness(int positiveness) {
        this.positiveness = positiveness;
    }

    public int getTechincal() {
        return techincal;
    }

    public void setTechincal(int techincal) {
        this.techincal = techincal;
    }

    public int getCooperative() {
        return cooperative;
    }

    public void setCooperative(int cooperative) {
        this.cooperative = cooperative;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }


}
