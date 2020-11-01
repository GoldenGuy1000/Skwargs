package Skwargs;
import java.util.Map;

public class Skwargs {
     public static Map<String, String> generate(Map<String, String> dict, String[] kwargs, String ... nothing) {
        for(String kwarg : kwargs) {
            String key = kwarg.split("=")[0].trim();
            String newValue = kwarg.split("=")[1].trim();
            dict.put(key, newValue);
        }
        return dict;
    }
    public static Map<String, Integer> generate(Map<String, Integer> dict, String[] kwargs, int ... nothing) {
        for(String kwarg : kwargs) {
            String key = kwarg.split("=")[0].trim();
            int newValue = Integer.parseInt(kwarg.split("=")[1].trim());
            dict.put(key, newValue);
        }
        return dict;
    }
}
