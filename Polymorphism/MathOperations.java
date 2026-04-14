class MathOperation {
    
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MathOperations{
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        
        System.out.println(obj.add(2, 3));        // int version
        System.out.println(obj.add(2.5, 3.5));    // double version
        System.out.println(obj.add(1, 2, 3));     // 3 params
    }
}