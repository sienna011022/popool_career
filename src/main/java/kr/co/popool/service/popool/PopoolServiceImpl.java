package kr.co.popool.service.popool;

import kr.co.popool.domain.Career;
import kr.co.popool.entity.ScoreGrade;
import kr.co.popool.service.career.CareerService;
import kr.co.popool.service.score.ScorePolicy;

public class PopoolServiceImpl implements PopoolService{
    private final ScorePolicy socrePolicyImpl;
    private final CareerService careerServiceImpl;

    public PopoolServiceImpl(ScorePolicy socrePolicyImpl, CareerService careerServiceImpl) {
        this.socrePolicyImpl = socrePolicyImpl;
        this.careerServiceImpl = careerServiceImpl;
    }


    @Override
    public Career createPopool(ScoreGrade grade, Career career) {
        career.setGrade(grade);
        return career;
    }
}
