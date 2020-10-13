/**
 * Created by zhangzehua on 2020/10/13.
 */

/*
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串?""。
示例?1:
输入: ["flower","flow","flight"]
输出: "fl"
示例?2:
输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
说明:
所有输入只包含小写字母?a-z?。
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
        System.out.println("最短的单词是：" + strs[min_length_word_index]);
        return "hello wold";
    }
}