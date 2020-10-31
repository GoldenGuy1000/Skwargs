import java.util.*;

public class Skwargs {
    Map<String, String> Variables = new HashMap<>();

    public Skwargs(String[] keys, String[] defaultValues, String[] kwargs) {
        // setting up defaults
        for(int i = 0; i < keys.length; i++ ) {
            this.Variables.put(keys[i].replace(" ", ""),defaultValues[i].replace(" ", ""));
        }
        // updating dictionary with kwargs
        for(String kwarg : kwargs) {
            String variable = kwarg.split("=")[0].trim();
            String newValue = kwarg.split("=")[1].trim();
            this.Variables.put(variable,newValue);
        }
    }


// help
    public void help() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
// specific help
    public void help(String method) {

    }

    private String varToValue (String var) { return this.Variables.get(var); }
// get string
    public String get (String var) { return varToValue(var);}
// get int
    public int getInt (String var) { return Integer.parseInt(varToValue(var)); }
// get long
    public long getLong (String var) { return Long.parseLong(varToValue(var)); }
// get float
    public float getFloat (String var) {return Float.parseFloat(varToValue(var));}
// get double
    public double getDouble (String var) { return Double.parseDouble(varToValue(var)); }
// get boolean
    public boolean getBool (String var) {
        if (varToValue(var).toLowerCase().equals("true")) {
            return true;
        }
        else if (varToValue(var).toLowerCase().equals("false")) {
            return false;
        }
        else {
            return false;
        }
    }

}
// the following code is just an example use of Skwargs and at the top it's showing how to set it up
//
//    private static double math (double num1, double num2, String ... kwargs) {
//        String[] variables = new String[]{"typeOfMath","intMath"};
//        String[] defaults = new String[]{"addition","false"};
//        Skwargs vars = new Skwargs(variables, defaults, kwargs);
//
//        if (vars.get("typeOfMath").equals("addition")) {
//            if (vars.getBool("intMath")) {
//                return (int)num1 + (int)num2;
//            }
//            else {
//                return num1 + num2;
//            }
//        }
//
//        else {
//            return 0;
//        }
//    }

