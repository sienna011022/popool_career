package kr.co.score;

import kr.co.popool.AppConfig;
import kr.co.popool.domain.Career;
import kr.co.popool.domain.Score;
import kr.co.popool.entity.ScoreGrade;
import kr.co.popool.service.career.CareerService;
import kr.co.popool.service.score.ScorePolicy;
import kr.co.popool.service.score.ScorePolicyImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static kr.co.popool.entity.ScoreGrade.GOLD;
import static org.assertj.core.api.Assertions.assertThat;

class ScorePolicyTest {

    ScorePolicy scorePolicy;


    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        scorePolicy = appConfig.scorePolicy();
    }



    @Test
    @DisplayName("평가 등록")

    void join(){
        //given
        Score score = new Score(null,1L,2L,5,5,5,5,5,0);

        //when
        scorePolicy.joinScore(score);

        //then
        Score findScore = scorePolicy.findScore(1L);
        System.out.println("아이디 = "+ score.getCareerId());
        Assertions.assertThat(score).isEqualTo(findScore);
    }
    //성공 테스트
    @Test
    @DisplayName("평가에 따른 등급")
    public void grade() {
        //given
        Score score = new Score(null,1L,2L,5,5,5,5,5,0);


        //when
        ScoreGrade grade = scorePolicy.evaluateGrade(score);
        //then

        System.out.println("평균 = "+ score.getAverage());
        System.out.println("반환 등급 = "+ grade);
        assertThat(grade).isEqualTo(GOLD);

    }
}
