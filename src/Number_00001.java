/**
 * Created by zhangzehua on 2020/10/3.
 */

/*����һ����������nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ�����������������������ǵ������±ꡣ
        ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ�������ͬһ��Ԫ�ز���ʹ�����顣
        ʾ��:
        ���� nums = [2, 7, 11, 15], target = 9
        ��Ϊ nums[0] + nums[1] = 2 + 7 = 9
        ���Է��� [0, 1]
*/

public class Number_00001 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = new Number_00001().twoSum(nums,target);
        for (int num : result) {
            System.out.println(num);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for (int i = 0 ; i < nums.length - 1 ; i ++){
            for (int j = i + 1 ; j < nums.length ; j ++){
                if (nums[i] + nums[j] == target){
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }
        return array;
    }
}
