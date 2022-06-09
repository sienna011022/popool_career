package kr.co.popool.repository.career;

import kr.co.popool.domain.Career;


import java.util.HashMap;
import java.util.Map;

public class MemoryCareerRepository implements CareerRepository {
    private static Map<Long, Career> store = new HashMap<>();


    @Override
    public void save(Career career) {
        store.put(career.getId(),career);
    }

    @Override
    public Career findById(Long careerId) {
        return store.get(careerId);
    }
}
