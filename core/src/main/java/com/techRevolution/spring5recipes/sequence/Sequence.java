package com.techRevolution.spring5recipes.sequence;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Sequence {

    private String prefix;
    private String suffix;
    private String initial;
}
