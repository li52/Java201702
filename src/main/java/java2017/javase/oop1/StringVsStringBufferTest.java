package java2017.javase.oop1;

/**
 * Created by 李朋 on
 * 2017/3/29 0029 上午 10:55.
 */

    //"" "a-z" "a-za-z"
     //       "a-za-z"
     //       */
public class StringVsStringBufferTest {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz"; // alphabet 字母

    public static void main(String[] args) {
        String s = "";
        StringBuffer stringBuffer = new StringBuffer("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s += ALPHABET;
            stringBuffer.append(ALPHABET);
        }
        System.out.println("time: " + (System.currentTimeMillis() - start));
        System.out.println(s.length());
        System.out.println(stringBuffer.length());
    }
}