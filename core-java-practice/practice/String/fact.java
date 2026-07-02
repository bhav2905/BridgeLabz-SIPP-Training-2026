package String;

public class fact {
    public static long factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        int N = 5;
        long result = factorial(N);
        System.out.println(result);
    }
}