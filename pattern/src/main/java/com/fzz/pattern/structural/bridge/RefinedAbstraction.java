package com.fzz.pattern.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RefinedAbstraction extends Abstraction {

    Logger logger = LoggerFactory.getLogger(RefinedAbstraction.class);
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        super.implementor.operator();
        logger.info("RefinedAbstraction do self");
    }
}
