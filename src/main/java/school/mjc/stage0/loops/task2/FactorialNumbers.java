package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        for (int i = 0; i<=printToInclusive;i++){
            System.out.println(factorial(i));
        }
    }
    private int factorial (int n){
        if (n>0) return n*factorial(n-1);
        else return 1;
    }
}
