package kr.co.popool.service.score;

import kr.co.popool.domain.Score;
import kr.co.popool.entity.ScoreGrade;
import kr.co.popool.repository.score.ScoreRepository;

public class ScorePolicyImpl implements ScorePolicy {

    private final ScoreRepository scoreRepository;

    public ScorePolicyImpl(ScoreRepository scoreRepository){
        this.scoreRepository = scoreRepository;
    }

    //평가 등록
    @Override
    public void joinScore(Score score) {
        scoreRepository.saveScore(score);
    }

    @Override
    public Score findScore(Long careerId) {
        return scoreRepository.findById(careerId);
    }

    //평균을 계산 -> Grade 반환
    @Override
    public ScoreGrade evaluateGrade(Score score) {
        int average = (score.getAttendance()+ score.getCooperative() + score.getPositiveness() + score.getSincerity() + score.getTechincal()) / 5;
        score.setAverage(average);
        ScoreGrade Grade = null;
        switch (average) {

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
