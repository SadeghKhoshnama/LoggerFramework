package com.logger.core;

//if we only have functions like this i would rather make this as an interface.
public interface LogWriter {
   void write(Level level,String message,String packageName);
}
