package kr.co.popool;

import kr.co.popool.domain.Career;
import kr.co.popool.domain.Score;
import kr.co.popool.entity.ScoreGrade;
import kr.co.popool.service.career.CareerService;
import kr.co.popool.service.popool.PopoolService;
import kr.co.popool.service.score.ScorePolicy;
import kr.co.popool.service.score.ScorePolicyImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PopoolServiceTest {
    PopoolService popoolService;
    ScorePolicy scorePolicy;
    CareerService careerService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        popoolService = appConfig.popoolService();
        scorePolicy = appConfig.scorePolicy();
        careerService = appConfig.careerService();
    }
    @Test
    @DisplayName("등급을 career과 합쳐서 반환")
    void joinGrade(){
        //given
        Career career = new Career(1L,"career1", null, "1year",null);
        Score score = new Score(null,1L,2L,5,5,5,5,5,0);
        //career와 score을 등록
        careerService.join(career);
        scorePolicy.joinScore(score);

        //등록한 평가 대상자의 careerId를 찾음
        Score scoreFind = scorePolicy.findScore(1L);


        //그 careerId로 career객체 조회

        Long sameIdInCareer = scoreFind.getCareerId();
        Career findCareer = careerService.findCareer(sameIdInCareer);


        // 객체와 구한 grade를 popoolservice에 넣음
        ScoreGrade grade = scorePolicy.evaluateGrade(score);
        Career Popool = popoolService.createPopool(grade,findCareer);

        //then

        System.out.println("찾은 아이디"+ sameIdInCareer);
        System.out.println("score등급 = "+ grade);
        System.out.println("저장한 등급 = "+ Popool.getGrade());
        Assertions.assertThat(Popool.getGrade()).isEqualTo(grade);

    }
}
