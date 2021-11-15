package q1;

public class Q1 {
    public static void main(String[] args) {
        double num1 = 3;
        double num2 = 5;
        AvgInterface avgInterface = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(avgInterface.avg(num1, num2));
    }
}
