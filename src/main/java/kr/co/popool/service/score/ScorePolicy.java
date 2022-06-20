package kr.co.popool.service.score;

import kr.co.popool.domain.Score;
import kr.co.popool.entity.ScoreGrade;

public interface ScorePolicy {

    //평가 등록

    void joinScore(Score score);



    //평가 조회
    Score findScore(Long careerId);

    //score을 계산해서 Grade에 객체의 등급을 매겨줌
    ScoreGrade evaluateGrade(Score score);
}
