import java.util.HashMap;
import java.util.Map;
import Skwargs.Skwargs;

public class Test {
    public static void main (String[] args) {
        System.out.println(stringTest("output = hello"));
        System.out.println(intTest("output = 15"));
    }

    public static String stringTest (String ... kwargs) {
        Map<String, String> Dict = new HashMap<>() {{
            put("output", "hi there");
        }};
        Dict = Skwargs.generate(Dict,kwargs);
        return Dict.get("output");
    }

    public static int intTest (String ... kwargs) {
        Map<String, Integer> Dict = new HashMap<>() {{
            put("output", 0);
        }};
        Dict = Skwargs.generate(Dict,kwargs);
        return Dict.get("output");
    }
}
