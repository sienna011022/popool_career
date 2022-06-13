package kr.co;

import kr.co.popool.domain.Career;
import kr.co.popool.domain.ScoreGrade;
import kr.co.popool.service.score.ScorePolicy;
import kr.co.popool.service.score.ScorePolicyImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static kr.co.popool.domain.ScoreGrade.GOLD;
import static org.assertj.core.api.Assertions.assertThat;

class ScorePolicyTest {

    ScorePolicy gradePolicy = new ScorePolicyImpl() {
    };

    //성공 테스트
    @Test
    @DisplayName("평가에 따른 등급")
    void grade() {
        //given
        Career career = new Career(1L, "sienna", "3years", null, 5, 5, 5, 5, 5, 0, 1022L);


        //when
        ScoreGrade grade = gradePolicy.evaluate(career);
        //then

        System.out.println("order = "+ career.getAverage());
        assertThat(grade).isEqualTo(GOLD);

    }
}
