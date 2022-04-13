public class Overloading {
    private static int num1 = 30;
    private static int num2 = 50;

    private static double Num1 = 15.1;
    private static double Num2 = 3.3;
    private static double Num3 = 64.4;

    private static int computesum1(int num1, int num2) {
        return num1 + num2;
    }

    private static double computesum2(double Num1, double Num2, double Num3) {
        return Num1 + Num2 + Num3;

    }

    private static int getvalue_integers() {
        return Math.max(num1, num2);
    }

    private static double getvalue_double() {
        return Math.max(Num1, Math.max(Num2, Num3));
    }

    public static void main(String[] args) {

        System.out.println("============================================================================");
        System.out.println("The sum of the two number integer is: " + Overloading.computesum1(30, 50));
        System.out.println("The greater value of integers is : " + Overloading.getvalue_integers() + "\n");
        System.out.println("==============================================================================");
        System.out.println("The sum of the three number double is: " + Overloading.computesum2(15.1, 3.3, 64.4));
        System.out.println("The greater value of doubles is: " + Overloading.getvalue_double());
    }
}
