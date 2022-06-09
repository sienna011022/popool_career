package kr.co.popool.repository.career;

import kr.co.popool.domain.Career;

public interface CareerRepository {

    void save(Career career);

    Career findById(Long Id);

}
