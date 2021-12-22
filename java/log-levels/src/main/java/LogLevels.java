import java.util.Locale;

public class LogLevels {
    
    public static String message(String logLine) {
        String[] split = logLine.split(": ", 2);
        String message = split[1];
        return message.trim();
    }

    public static String logLevel(String logLine) {
        // get log level only i.e. split at ]
        // remove [ ]
        // turn to lower case
        String[] split = logLine.split("]", 2);
        String level = split[0];
//        level = level.substring(0, level.indexOf("[") -1);
//        level = level.substring(0, level.length() -1);
       level = level.replaceAll("\\[", "").replaceAll("//]", "").toLowerCase();
        return level;
    }

    public static String reformat(String logLine) {
      // put the message first, and the log level after it in parenthesis
        String[] split = logLine.split(": ", 2);
        String level = split[0];
        level  = level.replaceAll("\\[", "").replaceAll("\\]", "").toLowerCase();
        String message = split[1];
        String reformatted = message.trim() + " (" + level + ")";
        return reformatted;
    }
}
