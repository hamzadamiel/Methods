public class Calculator { //static is linked to the class, non static is linked to the instance of the class(object)
    public int num1 = 3;
    public int num2 = 4;
    public float num4= 2.4f;
    public float num5 = 4.5f;

    public String name = "Hamza Damiel";
    public int sumNumbers(int a, int b){
        return a+b;
    }
    public float sumNumbers(float a, float b){
        return a+b;
    }
    public void displayResult(float result){//cant have same method with s
        System.out.println("The answer is " + result);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.num1 = 5;
        c.num2 = 4;
        int total = c.sumNumbers(c.num1,c.num2);//because the variables are non static they need a new object even when in the same class. Outside its not a problem
        c.displayResult(total);
        System.out.println(c.name);
    }
}
