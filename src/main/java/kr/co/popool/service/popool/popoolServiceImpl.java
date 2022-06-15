package kr.co.popool.service.popool;


import kr.co.popool.domain.Career;
import kr.co.popool.repository.career.CareerRepository;
import kr.co.popool.service.score.ScorePolicy;
import kr.co.popool.domain.ScoreGrade;
public class popoolServiceImpl implements popoolService {


    private final CareerRepository careerRepository;
    private final ScorePolicy scorePolicy;

    public popoolServiceImpl(CareerRepository careerRepository, ScorePolicy scoreGrade, ScorePolicy scorePolicy) {
        this.careerRepository = careerRepository;
        this.scorePolicy = scorePolicy;
    }


    @Override
    public Popool createPopool(Long careerId, String score) {
        Career career = careerRepository.findById(careerId);

        ScoreGrade scoreGrade = scorePolicy.evaluate(career);
        return new Popool(careerId,scoreGrade);

    }
}

