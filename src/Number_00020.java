/**
 * Created by zhangzehua on 2020/10/16.
 */

/*
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。
        示例 1:
        输入: "()"
        输出: true
        示例 2:
        输入: "()[]{}"
        输出: true
        示例 3:
        输入: "(]"
        输出: false
        示例 4:
        输入: "([)]"
        输出: false
        示例 5:
        输入: "{[]}"
        输出: true
*/

public class Number_00020 {
    public static void main(String[] args) {
        System.out.println(new Number_00020().isValid("()"));
        System.out.println(new Number_00020().isValid("()[]{}"));
        System.out.println(new Number_00020().isValid("(]"));
        System.out.println(new Number_00020().isValid("([)]"));
        System.out.println(new Number_00020().isValid("{[]}"));
    }
    public boolean isValid(String s) {
        if (s.length() == 0){
            return true;
        }
        if (s.length()%2 == 1){
            return false;
        }
        char[] array = s.toCharArray();
        String change = "";
        for (int i = 0 ; i < s.length() - 1 ; i++) {
            if (s.length() == 0){
                return true;
            }
            if ((array[i] == '(' && array[i + 1] == ')' ) ||
                    (array[i] == '[' && array[i + 1] == ']' ) ||
                    (array[i] == '{' && array[i + 1] == '}' )
                    ){
                array[i] = '1';
                array[i + 1] = '1';
            }
            for (int j = 0 ; j < array.length ; j++) {
                System.out.println(array[j]);
            }
            for (int j = 0 ; j < array.length ; j++) {
                change = change.concat(String.valueOf(array[j]));
            }
            System.out.println(i + change);
        }
        boolean flag = false;
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] == '1'){
                flag = true;
            }else {
                flag = false;
            }
        }
        return flag;
    }
}
