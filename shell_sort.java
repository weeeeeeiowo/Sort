package part1;

import java.util.Scanner;

public class shell_sort {
    static void sort(int number[]){
        int gap;
        int i,j,t;
        for(gap=(number.length)/2;gap>0;gap=gap/2)//定义步长
        {
            for(i=gap;i<number.length;i++)//从步长开始向后遍历
            {
                t=number[i];//保存每次遍历的值
                for (j=i-gap;j>=0&&number[j]>t;j-=gap)//通过计算出j值，即与i要交换的值
                    number[j+gap]=number[j];
                number[j+gap]=t;//将临时变量放在对应位置
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int a[] = new int[x];
        for (int i=0;i<x;i++)
            a[i]=in.nextInt();
        sort(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
