package mynote.bit;

public class GetBit {


    public static char getValue(int n, int k){

        if(k < 0 || k > 31 ){
            throw new IllegalArgumentException("must be 0 and 31");
        }

        int result = 1 & (n>>k);

        if(result == 0){
            return '0';
        }

        return '1';
    }

    public static void main(String[] args) {
        // 32비트 정수 n의 주어진 위치 k에 있는 n의 비트값 반환 시키기

        char value = getValue(423, 7);
        System.out.println("value : " + value);

    }

}
