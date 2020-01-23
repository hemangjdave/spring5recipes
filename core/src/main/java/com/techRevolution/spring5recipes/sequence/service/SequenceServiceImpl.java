package com.techRevolution.spring5recipes.sequence.service;

import com.techRevolution.spring5recipes.sequence.Sequence;
import com.techRevolution.spring5recipes.sequence.dao.SequenceDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SequenceServiceImpl implements SequenceService {

    private final SequenceDao sequenceDao;

    @Autowired
    public SequenceServiceImpl(SequenceDao sequenceDao) {
        log.info("########## Creating SequenceServiceImpl bean ##########");
        this.sequenceDao = sequenceDao;
    }

    @Override
    public Sequence getSequenceByName(String name) {
        return sequenceDao.getSequenceByName(name);
    }
}
