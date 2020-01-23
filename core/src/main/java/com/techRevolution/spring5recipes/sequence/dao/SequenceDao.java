package com.techRevolution.spring5recipes.sequence.dao;

import com.techRevolution.spring5recipes.sequence.Sequence;

public interface SequenceDao {
    Sequence getSequenceByName(String name);
}
