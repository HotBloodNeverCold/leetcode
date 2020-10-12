import java.util.Scanner;

/**
 * Created by zhangzehua on 2020/10/3.
 */

/*给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
        示例1:
        输入: 123
        输出: 321
        示例 2:
        输入: -123
        输出: -321
        示例 3:
        输入: 120
        输出: 21
        注意:
        假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为[-2 31,2 31-1]。请根据这个假设，如果反转后整数溢出那么就返回0
*/

public class Number_00007 {
    public static void main(String[] args) {
        System.out.println("input a number，no more than 2 31-1 , no less than -2 31");
        Integer num;
        while (true){
            try {
                num = new Scanner(System.in).nextInt();
                Integer after_reverse = new Number_00007().reverse(num);
                System.out.println("before：" + num);
                System.out.println("after change：" + after_reverse);
                System.out.println("continue or not : Y / N (case-insensitive)");
                String continueOrNot = new Scanner(System.in).next();
                if ("Y".equals(continueOrNot) || "y".equals(continueOrNot)){
                    continue;
                }else if ("N".equals(continueOrNot) || "n".equals(continueOrNot)){
                    return;
                }
            }catch (Exception e){
                System.out.println("error , try again");
            }
        }
    }
    public int reverse(int x) {
        if (x == 0){
            return 0;
        }
        String num = String.valueOf(x);
        long sum = 0;
        if (num.contains("-")){
            num =  num.replace("-" , "");
            return -solution(num,sum) < (-1 * (long)Math.pow(2,31)) ? 0 : -(int)solution(num,sum);
        }else {
            return solution(num,sum) > ((long)Math.pow(2,31) - 1) ? 0 : (int)solution(num,sum);
        }
    }
    static long solution(String str , long s){
        Integer lg = str.length();
        while (str.endsWith("0")){
            char[] numberArray = str.toCharArray();
            str = String.copyValueOf(numberArray,0,lg - 1);
            lg --;
        }
        long number = Long.parseLong(str);
        for (int i = 0 ; i < lg ; i ++){
            long bt = number % 10;
            s += bt * Math.pow(10 , lg - 1 - i);
            number /= 10;
        }
        return s;
    }
}
