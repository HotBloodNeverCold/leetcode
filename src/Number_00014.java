/**
 * Created by zhangzehua on 2020/10/14.
 */

/*
编写一个函数来查找字符串数组中的最长公共前缀。
        如果不存在公共前缀，返回空字符串 ""。
        示例 1:
        输入: ["flower","flow","flight"]
        输出: "fl"
        示例 2:
        输入: ["dog","racecar","car"]
        输出: ""
        解释: 输入不存在公共前缀。
        说明:
        所有输入只包含小写字母 a-z 。
*/

public class Number_00014 {
    public static void main(String[] args) {
        String[] array = {"flower","flow","flight"};
        String[] array1 = {"dog","racecar","car"};
        String[] array2 = {"ab", "a"};
        System.out.println(new Number_00014().longestCommonPrefix(array));
        System.out.println(new Number_00014().longestCommonPrefix(array1));
        System.out.println(new Number_00014().longestCommonPrefix(array2));
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        if (strs.length == 1){
            return strs[0];
        }
        int min_length = strs[0].length();
        for (int i = 0 ; i < strs.length ; i++) {
            if (min_length > strs[i].length()){
                min_length = strs[i].length();
            }
        }//找出最短的单词长度
        //第一层循环次数为最短单词的字母数，第二层循环为每个字符串数组的长度，比对每个单词的特定字母是否一致
        String same_or_not = "";
        String compare = "";
        String extend = "";
        for (int i = 0 ; i < min_length ; i++) {
            compare = String.valueOf(strs[0].charAt(i));
            extend = compare;
            for (int j = 1 ; j < strs.length ; j++) {
                if (compare.equals(String.valueOf(strs[j].charAt(i)))){
                    compare = String.valueOf(strs[j].charAt(i));
                    continue;
                }else {
                    return same_or_not;
                }
            }
            if (compare.equals(extend)){
                same_or_not = same_or_not.concat(compare);
            }
        }
        return same_or_not;
    }
}


