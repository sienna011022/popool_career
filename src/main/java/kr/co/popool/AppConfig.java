package kr.co.popool;

import kr.co.popool.repository.career.CareerRepository;
import kr.co.popool.repository.career.MemoryCareerRepository;
import kr.co.popool.service.career.CareerService;
import kr.co.popool.service.career.CareerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CareerService careerService(){
        return new CareerServiceImpl(careerRepository());
    }


    @Bean
    public CareerRepository careerRepository(){
        return new MemoryCareerRepository();
    }


}
