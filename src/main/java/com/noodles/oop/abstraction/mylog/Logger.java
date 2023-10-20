package com.noodles.oop.abstraction.mylog;

import java.util.logging.Level;

/**
 * @Description 抽象类
 * @Author liuxian
 * @Date 2023/10/20 13:51
 **/
public abstract class Logger {
    private String name;
    private boolean enabled;
    private Level minPermittedLevel;

    public Logger(String name, boolean enabled, Level minPermittedLevel) {
        this.name = name;
        this.enabled = enabled;
        this.minPermittedLevel = minPermittedLevel;
    }

    public void log(Level level, String message) {
        boolean loggable = enabled && (minPermittedLevel.intValue() <= level.intValue());
        if (!loggable) {
            return;
        }
        doLog(level, message);
    }

    protected abstract void doLog(Level level, String message);
}
