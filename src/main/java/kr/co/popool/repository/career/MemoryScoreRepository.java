package kr.co.popool.repository.career;

import kr.co.popool.domain.Career;
import kr.co.popool.domain.Score;

import java.util.HashMap;
import java.util.Map;

public class MemoryScoreRepository implements ScoreRepository {

    private static Map<Long, Score> scoreStorage = new HashMap<>();
    @Override
    public void saveScore(Score score) {
        scoreStorage.put(score.getCareerId(),score);
        }

    @Override
    public Score findById(Long careerId) {
        return scoreStorage.get(careerId);
    }



}

