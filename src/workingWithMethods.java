public class workingWithMethods {
    public static void main(String[] args) {
/*
        num1 = 3;
        num2 = 4;
        float num4= 2.4f;
        float num5 = 4.5f;*/

        Calculator cal = new Calculator();
        cal.num1 = 5;
        cal.num2 = 6;
        int total = cal.sumNumbers(cal.num1, cal.num2);
        cal.displayResult(total);
        System.out.println(cal.num1);
       /*int num3 = Calculator.sumNumbers(num1, num2);
        Calculator.displayResult(num3);

        float num6 = Calculator.sumNumbers(num4,num5);
        Calculator.displayResult(num6);*/
    }

}
