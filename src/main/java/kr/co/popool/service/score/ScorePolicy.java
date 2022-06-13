package kr.co.popool.service.score;

import kr.co.popool.domain.Career;
import kr.co.popool.domain.ScoreGrade;

public interface ScorePolicy {

    ScoreGrade evaluate(Career career);


}
