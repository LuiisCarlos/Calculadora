package luiscaicedocalc2.classes;

/**
 * @author Luis Carlos Caicedo Giraldo
 */
public class Operation {
    private String x;
    private String operator;
    private String y;
    private String result;
    
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

    public String getX() { return this.x;}
    public void setX(String x) {this.x = x; }
    
    public String getY() { return this.y; }
    public void setY(String y) { this.y = y; }
    
    public String getOperator() { return this.operator; }
    public void setOperator(String operator) { this.operator = operator; }

    public String getResult() {
        String number = "";
        switch (operator) {
            case "+" -> number += (Double.parseDouble(x) + Double.parseDouble(y));
            case "-" -> number += (Double.parseDouble(x) - Double.parseDouble(y));
            case "x" -> number += (Double.parseDouble(x) * Double.parseDouble(y));
            case "÷" -> {
                if (y.equals("0")) {
                    return null; 
                } else {
                    number += (Double.parseDouble(x) / Double.parseDouble(y));
                    this.y = "÷";
                }
            }
            case "^" -> {
                number = String.valueOf( Math.pow(Double.parseDouble(x), 2) );
                this.y = "";
            }
            case "s" -> {
                number = String.valueOf( Math.sqrt(Double.parseDouble(x)) );
                this.y = "";
            }
            case "/" -> {
                if (x.equals("0")) {
                    return null; 
                } else {
                    number = String.valueOf(1 / Double.parseDouble(x));
                }
            }
            default -> {
                return "ERROR";
            }
        }
        
        if (number.charAt(number.length() - 1) == '0') {
            if (number.charAt(number.length() - 2) == '.') {
                double aux1 = Double.parseDouble(number);
                number = String.valueOf((int) aux1);
            }
        }
        this.result = number;
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
