package java2017.javase.basic1;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
public class Ass {
    public static void main(String[] args) {
        int grade = 90;
        if (grade >= 85) {
            System.out.println("优秀");

        } else if (grade >= 75) {
            System.out.println("良好");
        } else if (grade >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
