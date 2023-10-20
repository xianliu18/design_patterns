package com.noodles.oop.abstraction.mylog.impl;

import com.noodles.oop.abstraction.mylog.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;

/**
 * @Description
 * @Author liuxian
 * @Date 2023/10/20 13:53
 **/
public class FileLogger extends Logger {

    private Writer fileWriter;

    public FileLogger(String name, boolean enabled, Level minPermittedLevel, String filePath) throws IOException {
        super(name, enabled, minPermittedLevel);
        this.fileWriter = new FileWriter(filePath);
    }

    @Override
    protected void doLog(Level level, String message) {
        try {
            fileWriter.write("abc");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
