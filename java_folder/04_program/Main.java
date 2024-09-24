class Calculator {
    public int add (int a, int b){
        return a + b;
    }

    public double add (double a, double b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public String Operator() {
        return "Basic Calculation";
    }
}

class AdvanceCalculator extends Calculator{
    @Override
    public String Operator(){
        return "Advance Calculation";
    }

    public double add (double a, double b, double c){
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add two integer: " + calc.add(4, 5));
        System.out.println("Add two Double: " + calc.add(5.5 , 44.5));
        System.out.println("Add three Integer:  " + calc.add( 4, 9, 2));


        AdvanceCalculator advnc = new AdvanceCalculator();
        System.out.println("AdvncCalculator: " + advnc.Operator());
        System.out.println("Add three double: " + advnc.add(2.2, 5.5, 9.9));
    }
}