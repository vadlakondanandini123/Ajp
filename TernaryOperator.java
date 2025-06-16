 public  class TernaryOperator{
    public static void main(String[] args) {
        int num1=100;
        int num2=50;
        int num3=120;
        int max=num1>num2? (num1>num3? num1:num3):(num2>num3?num2:num3);
        System.out.println("max value="+max);
    }
}