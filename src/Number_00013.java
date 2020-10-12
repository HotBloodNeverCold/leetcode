import java.util.Scanner;

/**
 * Created by zhangzehua on 2020/10/3.
 */

/*�������ְ������������ַ�:I��V��X��L��C��D��M��

�ַ�          ��ֵ
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
���磬 �������� 2 д��II����Ϊ�������е� 1��12 д��XII����ΪX+II�� 27 д��XXVII, ��ΪXX+V+II��
ͨ������£�����������С�������ڴ�����ֵ��ұߡ���Ҳ�������������� 4 ��д��IIII������IV������ 1 ������ 5 ����ߣ�
����ʾ�������ڴ��� 5 ��С�� 1 �õ�����ֵ 4 ��ͬ���أ����� 9 ��ʾΪIX���������Ĺ���ֻ�������������������
I���Է���V(5) ��X(10) ����ߣ�����ʾ 4 �� 9��
X���Է���L(50) ��C(100) ����ߣ�����ʾ 40 ��90��
C���Է���D(500) ��M(1000) ����ߣ�����ʾ400 ��900��
����һ���������֣�����ת��������������ȷ���� 1�� 3999 �ķ�Χ�ڡ�
ʾ��1:
����:"III"
���: 3
ʾ��2:
����:"IV"
���: 4
ʾ��3:
����:"IX"
���: 9
ʾ��4:
����:"LVIII"
���: 58
����: L = 50, V= 5, III = 3.
ʾ��5:
����:"MCMXCIV"
���: 1994
����: M = 1000, CM = 900, XC = 90, IV = 4.
��ʾ��
��Ŀ�������������Է�������������д���򣬲�����ֿ�λ�������
IC �� IM ���������Ӳ���������ĿҪ��49 Ӧ��д�� XLIX��999 Ӧ��д�� CMXCIX ��
�����������ֵ��꾡��д���򣬿��Բο� �������� - Mathematics

MCMXCIV

*/

public class Number_00013 {
    public static void main(String[] args) {
        System.out.println("������һ��1~3999֮�����������");
        String str = new Scanner(System.in).next();
        System.out.println("ת���������Ϊ��" + new Number_00013().romanToInt(str));
    }
    public int romanToInt(String s) {
        char[] array = s.toCharArray();
        Integer sum = 0;
        for (int i = 0 ; i < array.length ; i++) {
            array = s.toCharArray();
            if (s.contains("CM")){
                sum += 900;
                s = s.replace("CM","");
                continue;
            }
            if (s.contains("CD")){
                sum += 400;
                s = s.replace("CD","");
                continue;
            }
            if (s.contains("XC")){
                sum += 90;
                s = s.replace("XC","");
                continue;
            }
            if (s.contains("XL")){
                sum += 40;
                s = s.replace("XL","");
                continue;
            }
            if (s.contains("IX")){
                sum += 9;
                s = s.replace("IX","");
                continue;
            }
            if (s.contains("IV")){
                sum += 4;
                s = s.replace("IV","");
                continue;
            }
        }
        array = s.toCharArray();
        for (int i = 0 ; i < array.length ; i++) {
            switch (array[i]){
                case 'M' :
                    sum += 1000;
                    s = s.replaceFirst("M","");
                    break;
                case 'D' :
                    sum += 500;
                    s = s.replaceFirst("D","");
                    break;
                case 'C' :
                    sum += 100;
                    s = s.replaceFirst("C","");
                    break;
                case 'L' :
                    sum += 50;
                    s = s.replaceFirst("L","");
                    break;
                case 'X' :
                    sum += 10;
                    s = s.replaceFirst("X","");
                    break;
                case 'V' :
                    sum += 5;
                    s = s.replaceFirst("V","");
                    break;
                case 'I' :
                    sum += 1;
                    s = s.replaceFirst("I","");
                    break;
            }
        }
        return sum;
    }
}
