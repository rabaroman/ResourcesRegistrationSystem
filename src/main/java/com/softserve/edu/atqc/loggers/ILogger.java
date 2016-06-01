package com.softserve.edu.atqc.loggers;

public interface ILogger {

    void error(String message);

    void warning(String message);

    void info(String message);

    //void debug(String message);

    void insertPathToScreenShot(String fileNamePath);

    //void insertPathToHtmlCode(String fileNamePath);

}
