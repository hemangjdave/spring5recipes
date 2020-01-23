package com.techRevolution.spring5recipes.sequence.service;

import com.techRevolution.spring5recipes.sequence.Sequence;

public interface SequenceService {
    Sequence getSequenceByName(String name);
}
