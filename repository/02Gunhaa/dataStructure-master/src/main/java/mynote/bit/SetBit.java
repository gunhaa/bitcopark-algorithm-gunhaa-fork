package mynote.bit;

public class SetBit {



    public static void main(String[] args) {
        // n 은 423일때 , 7번째 비트를 현재값인 1에서 0으로 바꿔라

        int result = setBit(423, 7);
        System.out.println("result : " + result);
        System.out.println("423 = " + Integer.toBinaryString(423));
        System.out.println("295 = " + Integer.toBinaryString(295));
    }

    private static int setBit(int n, int k) {
        // exception
        return n & ~(1<<k);
    }
}
