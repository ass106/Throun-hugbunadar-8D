package bookingModule;

public class Operator {
    String name;
    String ssn;
    String address;
    String email;
    ArrayList<String> cc;

    public static getOperator() {
        
        return Operator;
    }

    public static setOperator(String opName) {
        Operator operator = fetchOperator(opName);
        
    }
}