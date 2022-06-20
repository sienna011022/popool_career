package kr.co.popool.service.popool;

import kr.co.popool.domain.Career;
import kr.co.popool.entity.ScoreGrade;

public interface PopoolService {


    Career createPopool(ScoreGrade grade, Career career);
}
