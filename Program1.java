class Problem1 {
    double a, b;
    String operation;

    Problem1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    double calculate() {
        if (operation.equalsIgnoreCase("add")) {
            return a + b;
        } else if (operation.equalsIgnoreCase("subtract")) {
            return a - b;
        } else if (operation.equalsIgnoreCase("multiply")) {
            return a * b;
        } else if (operation.equalsIgnoreCase("divide")) {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Division by zero not allowed!");
                return 0;
            }
        } else {
            System.out.println("Invalid operation!");
            return 0;
        }
    }

    public static void main(String[] args) {
        Problem1 c1 = new Problem1(10, 5, "add");
        System.out.println("Result: " + c1.calculate());

        Problem1 c2 = new Problem1(10, 5, "multiply");
        System.out.println("Result: " + c2.calculate());
    }
}
