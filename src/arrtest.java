import java.util.Scanner;

public class arrtest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Person person = new Person();

        Scanner myScanner = new Scanner(System.in);
        int[] arr = {5, 2, 8, 1, 9, 3};
        BubbleSort.bubbleSort(arr);  //用类名调用另一个类的方法
        System.out.println("排序后的数组：");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

//冒泡排序工具类：不能加public，同文件只能有一个public类
class BubbleSort {

    //冒泡排序方法：从小到大排序
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {         //外层循环控制比较的轮数
            for (int j = 0; j < arr.length - 1 - i; j++) { //内层循环控制每轮比较的次数
                if (arr[j] > arr[j + 1]) {                 //前一个比后一个大，就交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}