import java.util.Scanner;

/**
 * Created by zhangzehua on 2020/10/3.
 */

/*�ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
        ʾ�� 1:
        ����: 121
        ���: true
        ʾ��?2:
        ����: -121
        ���: false
        ����: �������Ҷ�, Ϊ -121 �� ���������, Ϊ 121- �����������һ����������
        ʾ�� 3:
        ����: 10
        ���: false
        ����: ���������, Ϊ 01 �����������һ����������
        ����:
        ���ܲ�������תΪ�ַ�����������������
*/

public class Number_00009 {
    public static void main(String[] args) {
        System.out.println("������һ������");
        int num = new Scanner(System.in).nextInt();
        if (new Number_00009().isPalindrome(num)){
            System.out.println(num + "�ǻ�����");
        }else {
            System.out.println(num + "���ǻ�����");
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
