package util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Log {
    
    public static void save(String where, String error) {
        File fileLog = new File("fileLog.txt");  
        try {
            FileWriter saveLog = new FileWriter(fileLog, true);
            String data = java.time.LocalDateTime.now().toString();
            saveLog.write("\n[" + data + "] "+ where +": "+ error);
            saveLog.close();
        } catch (IOException e) {
            throw new RuntimeException("Error creating log file. "+e.getMessage());
        }
    }
    
}
