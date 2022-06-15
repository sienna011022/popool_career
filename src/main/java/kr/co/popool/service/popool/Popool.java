package kr.co.popool.service.popool;

import kr.co.popool.domain.ScoreGrade;

public class Popool {

    //정의
    private Long careerId;

    private ScoreGrade grade;

    public Popool(Long careerId, ScoreGrade score) {
        this.careerId = careerId;
        this.grade = ScoreGrade.valueOf(score);
    }

    public Long getCareerId() {
        return careerId;
    }

    public void setCareerId(Long careerId) {
        this.careerId = careerId;
    }

    public ScoreGrade getScore() {
        return grade;
    }

    public void setScore(String score) {
        this.grade = ScoreGrade.valueOf(score);
    }

    @Override
    public String toString() {
        return "Popool{" +
                "careerId=" + careerId +
                ", score='" + grade + '\'' +
                '}';
    }


}
