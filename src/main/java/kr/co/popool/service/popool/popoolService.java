package kr.co.popool.service.popool;

public interface popoolService {

    //인사 정보 + 성적 올라가기

    Popool createPopool(Long careerId,String score);
}
