package luiscaicedocalc2.classes;

/**
 * @author Luis Carlos Caicedo Giraldo
 */
public class Operation {
    private Double x;
    private String operator;
    private Double y;
    private Double result;
    
    public Operation() {}
    
    public Operation(Double x, String operator, Double y) {
        this.x = x;
        this.operator = operator;
        this.y = y;
    }

    public Operation(Double x, String operator, Double y, Double result) {
        this.x = x;
        this.operator = operator;
        this.y = y;
        this.result = result;
    }

    public Double getX() { return this.x;}
    public void setX(Double x) {this.x = x; }
    
    public Double getY() { return this.y; }
    public void setY(Double y) { this.y = y; }
    
    public String getOperator() { return this.operator; }
    public void setOperator(String operator) { this.operator = operator; }
    
    public Double resolve() {
        try {
            switch (operator) {
                case "+":
                    this.result = x + y; break;
                case "-":
                    this.result = x - y; break;
                case "x":
                    this.result = x * y; break;
                case "÷":
                    if (y.equals(0))
                        this.result = null; 
                    else
                        this.result  += (x / y);
                    break;
                case "^": 
                    this.result  = Math.pow(x, 2);
                    break;
                case "s":
                    this.result  = Math.sqrt(x);
                    break;
                case "/":
                    if (x.equals(0)) 
                        this.result = null; 
                    else 
                        this.result  = 1 / x;
                    break;
                default :
                    this.result = null; 
            }
        } catch (Exception e) {
            this.result = null;
        }
        
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
