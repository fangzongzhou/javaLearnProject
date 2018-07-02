package com.fzz.pattern.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteComponent implements Component {
    Logger logger = LoggerFactory.getLogger(ConcreteComponent.class);
    @Override
    public void opetator() {
        logger.info("ConcreteComponent do");
    }
}
