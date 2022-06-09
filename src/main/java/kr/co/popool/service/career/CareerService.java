package kr.co.popool.service.career;

import kr.co.popool.domain.Career;

public interface CareerService {

    void join(Career career);

    Career findCareer(Long careerId);
}
