package com.techRevolution.spring5recipes.sequence.dao;

import com.techRevolution.spring5recipes.sequence.Sequence;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
@Slf4j
public class SequenceDaoImpl implements SequenceDao {

    private final Map<String, Sequence> daoMap = new HashMap<>();

    public SequenceDaoImpl() {
        log.info("########## Creating SequenceDaoImpl instance ##########");
    }

    @PostConstruct
    public void init(){
        Sequence sequence = new Sequence();
        sequence.setInitial("H");
        sequence.setPrefix("J");
        sequence.setSuffix("Dave");
        daoMap.put("firstSequence", sequence);
    }

    @Override
    public Sequence getSequenceByName(String name) {
        return daoMap.get(name);
    }
}
