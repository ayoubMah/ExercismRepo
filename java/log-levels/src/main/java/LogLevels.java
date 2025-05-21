public class LogLevels {
    
    public static String message(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
        String theMessage = logLine.replaceAll("\\[[^\\]]*\\]:","").trim();
        return theMessage;
    }

    public static String logLevel(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
        int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        String logLevel = logLine.substring(start+1, end).trim().toLowerCase();
        return logLevel;
    }


    public static String reformat(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
        String first = message(logLine);
        String second = logLevel(logLine);
        String last = first + " ("+second+")";

        return last;

    }
}
