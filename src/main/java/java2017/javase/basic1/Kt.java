package java2017.javase.basic1;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
public class Kt {
    public static void main(String[] args){
        for(int i=101; i<200; i++){
            int j=2;
//            for (int j = 0; j < ; j++) {
            for(;j<i; j++){
                if(i % j == 0)
                    break;  //判断j是否能整除i，能则中断对j的循环
            } //for j
            if(j==i) {
                System.out.println(i);
            }//如果j=i/2+1说明比i/2+1小的数都不能整除i，也就是质数
        }//for i

    }//main
}