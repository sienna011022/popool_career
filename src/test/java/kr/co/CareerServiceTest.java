package kr.co;

import kr.co.popool.AppConfig;
import kr.co.popool.domain.Career;
import kr.co.popool.service.career.CareerService;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CareerServiceTest {

    CareerService careerService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        careerService = appConfig.careerService();
    }

    @Test
    void join(){
        //given

        Career career = new Career(1L,"sienna","3 years",80L,1022L);
        //when

        careerService.join(career);
        Career findCareer = careerService.findCareer(1L);

        //then
        Assertions.assertThat(career).isEqualTo(findCareer);
        System.out.println("find member " +findCareer.getName());



    }
}
