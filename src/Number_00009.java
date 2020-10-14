import java.util.Scanner;

/**
 * Created by zhangzehua on 2020/10/3.
 */

/*判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        示例 1:
        输入: 121
        输出: true
        示例2:
        输入: -121
        输出: false
        解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
        示例3:
        输入: 10
        输出: false
        解释: 从右向左读, 为 01 。因此它不是一个回文数。
        进阶:
        你能不将整数转为字符串来解决这个问题吗？
*/

public class Number_00009 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        int num = new Scanner(System.in).nextInt();
        if (new Number_00009().isPalindrome(num)){
            System.out.println(num + "是回文数");
        }else {
            System.out.println(num + "不是回文数");
        }
    }
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }else if (x == 0){
            return true;
        }else {
            String num = String.valueOf(x);
            int lg = num.length();
            if (lg == 1){
                return true;
            }else {
                char[] array = num.toCharArray();
                for (int i = 0 ; i < ( lg / 2 ) ; i ++){
                    if (array[i] != array[lg - i - 1]){
                        return false;
                    }
                }
                return true;
            }
        }
    }
}
