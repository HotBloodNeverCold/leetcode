/**
 * Created by zhangzehua on 2020/10/13.
 */

/*
��дһ�������������ַ��������е������ǰ׺��
��������ڹ���ǰ׺�����ؿ��ַ���?""��
ʾ��?1:
����: ["flower","flow","flight"]
���: "fl"
ʾ��?2:
����: ["dog","racecar","car"]
���: ""
����: ���벻���ڹ���ǰ׺��
˵��:
��������ֻ����Сд��ĸ?a-z?��
*/

public class Number_00014 {
    public static void main(String[] args) {
        String[] array = {"flower","flow","flight"};
        new Number_00014().longestCommonPrefix(array);
    }
    public String longestCommonPrefix(String[] strs) {
        int min_length = strs[0].length();
        int min_length_word_index = 0;
        for (int i = 1 ; i < strs.length ; i++) {
            if (strs[i].length() < min_length){
                min_length = strs[i].length();
                min_length_word_index = i;
            }
        }
        System.out.println("��̵ĵ����ǣ�" + strs[min_length_word_index]);
        return "hello wold";
    }
}