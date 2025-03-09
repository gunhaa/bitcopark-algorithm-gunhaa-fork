package mynote.string;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringExecutor {

    public static void main(String[] args) {

        String s = "abc123";
        String ss = "안녕안녕한글";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] bytes1 = ss.getBytes();
        System.out.println(Arrays.toString(bytes1));
        byte[] bytes2 = ss.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes2));


        byte[] b1 = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            byte by = bytes[i];
            b1[i] = by;
        }

        String s1 = new String(b1, StandardCharsets.US_ASCII);
        System.out.println(s1);

        String s2 = new String(b1, StandardCharsets.UTF_8);
        System.out.println(s2);

        byte[] b2 = new byte[bytes.length];
        int count = 0;
        for (int i = bytes.length-1; i >= 0; i--) {
            byte by = bytes[i];
            b2[count] = by;
            count++;
        }

        String s3 = new String(b2, StandardCharsets.UTF_8);
        System.out.println("s3 : " + s3);

    }

}
