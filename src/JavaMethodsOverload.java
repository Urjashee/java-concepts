public class JavaMethodsOverload {

    public static void main(String[] args) {
        // overloaded methods = methods that share the same name but have different parameters
        // 						method name + parameters = method signature
//
//        int x = 3;
//        int y = 4;
//        int z = 5;
//        int a = 9;

        double x = 3;
        double y = 4;
        double z = 5;
        double a = 9;

        double result1 = add(x,y);
        System.out.println("The sum of two nos are : " + result1);

        double result2 = add(x,y,z);
        System.out.println("The sum of three nos are : " + result2);

        double result3 = add(x,y,z,a);
        System.out.println("The sum of three nos are : " + result3);
    }

    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static double add(double a, double b) {
        return a + b;
    }
    static double add(double a, double b, double c) {
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}