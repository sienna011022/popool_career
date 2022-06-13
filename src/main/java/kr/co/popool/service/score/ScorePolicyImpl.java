package kr.co.popool.service.score;

import kr.co.popool.domain.Career;
import kr.co.popool.domain.ScoreGrade;

public class ScorePolicyImpl implements ScorePolicy {


    //score을 계산해서 Grade에 객체의 등급을 매겨줌
    @Override
    public ScoreGrade evaluate(Career career) {
        int score = (career.getAttendance()+ career.getCooperative() + career.getPositiveness() + career.getSincerity() + career.getTechincal()) / 5;
        career.setAverage(score);
        ScoreGrade Grade = null;
        switch (score) {

            case 5:
                Grade = ScoreGrade.GOLD;
                break;
            case 4:
                Grade = ScoreGrade.SILVER;
                break;
            case 3:
                Grade = ScoreGrade.BRONZE;
                break;
            default:
                Grade = ScoreGrade.BLACK;
        }


        return Grade;

    }
}
