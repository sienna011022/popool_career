package kr.co.popool.service.career;

import kr.co.popool.domain.Career;
import kr.co.popool.repository.career.CareerRepository;

public class CareerServiceImpl implements CareerService{

    private final CareerRepository careerRepository;

    public CareerServiceImpl(CareerRepository careerRepository){
        this.careerRepository = careerRepository;
    }
    @Override
    public void join(Career career) {
        careerRepository.save(career);

    }

    @Override
    public Career findCareer(Long careerId) {
        return careerRepository.findById(careerId);
    }
}
