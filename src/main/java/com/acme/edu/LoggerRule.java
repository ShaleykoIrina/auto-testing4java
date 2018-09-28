package com.acme.edu;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class LoggerRule implements org.junit.rules.TestRule {
    @Override
    public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() {
                System.out.println(">>>> my rule do something before");
                try {
                    base.evaluate();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                System.out.println("<<<< my rule do something after");
            }
        };
    }
}
