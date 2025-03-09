package mynote.recursion;

import java.util.Arrays;

public class Fibonacci {

    private static int fibonacci(int k){
        System.out.println("k :" + k);
        if ( k <= 1){
            return k;
        }

        return fibonacci(k-2) + fibonacci(k-1);
    }

    private static int fibonacciMemoization(int k, int[] cache){
        System.out.println("k :" + k);

        if(k <= 1){
            return k;
        } else if (cache[k] != 0){
            return cache[k];
        }

        cache[k] = fibonacciMemoization(k-2, cache) + fibonacciMemoization(k-1, cache);
        System.out.println(Arrays.toString(cache));
        return cache[k];

    }


    public static void main(String[] args) {
//        int res = fibonacci(10);
//        System.out.println(res);

        int result = fibonacciMemoization(10, new int[11]);
        System.out.println(result);
    }

}
