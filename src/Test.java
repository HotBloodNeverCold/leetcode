/**
 * Created by zhangzehua on 2020/10/3.
 */
public class Test {
    public static void main(String[] args) {
        String name = "jackrose";
        System.out.println(name);
        char array[] = name.toCharArray();
        for (int i = 0 ; i < array.length; i++) {
            array[i] = '1';
        }
        for (int i = 0 ; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
