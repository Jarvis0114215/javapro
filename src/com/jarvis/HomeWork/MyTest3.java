package com.jarvis.HomeWork;

/**
 * Create by Jia on 2020/2/5/005 9:35
 */
public class MyTest3 {
    public static void main(String[] args) {
        /*冒泡排序*/
        /*int[] array = {1,3,2,7,4,8,5,9,0};
        bbsout(array);*/

        /*选择排序*/
        /*int[] array = {100,4,24,35,2,69,45,44,78,1};
        for(int i=0;i<array.length-1;i++){
            int min = i;
            for(int j = i+1; j <array.length ;j++){
                if(array[j]<array[min]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        for(int a : array){
            System.out.println(a);
        }*/
        /*二分搜索*/
        /*int a = 100000;
        int[] array = new int[100000];
        for (int i=0;i<array.length;i++){
            array[i]=i+1;//赋值
        }
        int index = search(array,a);
        System.out.println(a+"的索引是:"+index);*/

    }

    /*冒泡排序*/
    public static int bbsout(int[] array){
        for(int i=0;i<array.length-1;i++){
            int flag = 0;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag++;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(int a : array){
            System.out.println(a);
        }
        return 0;
    }

    /*二分搜索查询*/
    public static int search(int[] array, int value){
        int min = 0;
        int max = array.length-1;
        int mid;
        int count = 0;
        while(min<=max){
            count++;
            mid = (min+max)/2;
            if(value==array[mid]){
                System.out.println("查找了"+count+"次");
                return mid;
            }else if(value<array[mid]){
                max = mid-1;
            }else {
                min = mid+1;
            }
        }
        return -1;
    }

}
