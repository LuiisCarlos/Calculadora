package luiscaicedocalc2.classes;

/**
 * @author Luis Carlos Caicedo Giraldo
 */
public class Operation {
    public String x;
    public String operator;
    public String y;
    public String result;
    
    public Operation() {}
    
    public Operation(String x, String operator, String y) {
        this.x = x;
        this.operator = operator;
        this.y = y;
    }

    public Operation(String x, String operator, String y, String result) {
        this.x = x;
        this.operator = operator;
        this.y = y;
        this.result = result;
    }
    
    public String getResult() {
        String result = "";
        switch (operator) {
            case "+":
                result += (Double.parseDouble(x) + Double.parseDouble(y));
                break;
            case "-":
                result += (Double.parseDouble(x) - Double.parseDouble(y));
                break;
            case "x":
                result += (Double.parseDouble(x) * Double.parseDouble(y));
                break;
            case "÷":
                if (y.equals("0")) {
                    return null; 
                } else {
                    result += (Double.parseDouble(x) / Double.parseDouble(y));
                    this.y = "÷";
                }
                break;
            case "^":
                result = String.valueOf( Math.pow(Double.parseDouble(x), 2) );
                this.y = "";
                break;
            case "s":
                result = String.valueOf( Math.sqrt(Double.parseDouble(x)) );
                this.y = "";
                break;
            case "/":
                if (x.equals("0")) {
                    return null; 
                } else {
                    result = String.valueOf(1 / Double.parseDouble(x));
                    this.operator = "√";
                }
                break;
            default:
                return "ERROR";
        }
        
        if (result.charAt(result.length() - 1) == '0') {
            if (result.charAt(result.length() - 2) == '.') {
                double aux1 = Double.parseDouble(result);
                result = String.valueOf((int) aux1);
            }
        }
         this.result = result;
        return this.result;
    }

    @Override
    public String toString() {
        return this.x + ","  + this.operator + "," + this.y +  "," + this.result;
    }
    
    public String[] toArray() {
        return new String[]{"" + this.x, "" + this.operator, "" + this.y,  "" + this.result};
    }
}
