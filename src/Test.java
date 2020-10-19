import java.util.Scanner;

/**
 * Created by zhangzehua on 2020/10/3.
 */
public class Test {
    public static void main(String[] args) {
        double sum = 0;
        double[] array = {
                897563.5,
                11841778.2
        };
        for (int i = 0 ; i < array.length ; i++) {
            sum += array[i];
        }
        System.out.println(array.length);
        System.out.println(sum);
    }
}
