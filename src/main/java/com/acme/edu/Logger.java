package com.acme.edu;

public class Logger {
    private LoggerFilter loggerFilter;
    private LoggerSaver loggerSaver;

    public Logger(LoggerFilter loggerFilter, LoggerSaver loggerSaver) {
        if (loggerFilter == null) throw new IllegalStateException("filter can't");
        if (loggerSaver == null) throw new IllegalStateException("saver can't");

        this.loggerFilter = loggerFilter;
        this.loggerSaver = loggerSaver;
    }

    /**
     * Design by Contract:
     * 1. Pre-conditions:
     *  - message != null -> IllArgException
     *  - filter != null && saver != null -> IllStateException
     * 2. Post-conditions:
     *  - Implementation-specific, private
     *  - Public Side effect
     *  - Interaction based on Mocks
     * 3. Invariants
     */
    public void log(String message) {
        if (loggerFilter.filter(message)) {
            loggerSaver.save(message);
        }
    }
}
