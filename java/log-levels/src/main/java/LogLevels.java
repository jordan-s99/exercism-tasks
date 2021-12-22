public class LogLevels {
    
    public static String message(String logLine) {
        String[] split = logLine.split(": ", 2);
        String message = split[1];
        return message;
    }

    public static String logLevel(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
    }

    public static String reformat(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }
}
