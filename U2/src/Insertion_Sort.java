import java.util.ArrayList;
import java.util.List;

/**
 * 正序插入排序
 * @author LaZY（李志一）
 * @data 2018/9/4 - 15:01
 */
public class Insertion_Sort {
    //插入元素和其后面的元素依次比较，当插入元素小于后面元素，让后面的元素（较大的元素）覆盖插入位置
    //当迭代到数组的开头，退出迭代
    //让最终迭代被覆盖位置的前一个位置，它的值为新插入元素的值。
    //      或者让新插入的元素的前一个索引的下一个位置（也就是新插入元素的索引），它的值为新插入元素的值。
    public static void main(String[] args) {
        int a [] = new int[]{3,6,5,9,8,1};
        for (int i = 1; i < a.length; i++) {
           int key = a[i];//新（插入的）元素
           int j = i -1;//新元素的前一个元素的索引
            while (j>=0&&key<a[j]){
                a[j+1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
        //check result：
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}