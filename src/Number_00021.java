/**
 * Created by zhangzehua on 2020/10/19.
 */

/*
将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
        示例：
        输入：1->2->4, 1->3->4
        输出：1->1->2->3->4->4
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Number_00021 {
    public static void main(String[] args) {
        /*ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4)));*/

        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(1,new ListNode(1)));

        ListNode listNode = new Number_00021().mergeTwoLists(l1,l2);
        while (listNode.next != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> list = new ArrayList();
        while (l1 != null){
            list.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            list.add(l2.val);
            l2 = l2.next;
        }
        int array[] = new int[list.size()];
        for (int i = 0 ; i < array.length ; i++) {
            array[i] = list.get(i);
        }
        Arrays.sort(array);
        ListNode listNode = new ListNode();
        for (int i = array.length - 1 ; i >= 0 ; i --) {
            listNode = ( i == array.length - 1 ) ? new ListNode(array[i]) : new ListNode(array[i],listNode);
        }
        return listNode;
    }
}
