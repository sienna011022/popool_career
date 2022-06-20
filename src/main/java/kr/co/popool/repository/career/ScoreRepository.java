package kr.co.popool.repository.career;

import kr.co.popool.domain.Score;

public interface ScoreRepository {

    void saveScore(Score score);
    Score findById(Long careerId);

}
