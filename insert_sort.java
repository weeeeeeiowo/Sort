package part1;

import java.util.Scanner;

public class insert_sort {
    static void sort(int number[]){
        int n = number.length;
        int i,j,t;
        for(i=0;i<n-1;i++)
        {
            int temp=number[i+1];
            j=i;
            while(j>=0&&number[j]>temp){
                number[j+1]=number[j];
                j--;
            }
            number[j+1]=temp;
        }
        /*for (i=0;i<n;i++)
        {
            t=number[i];
            for (j=i;j>0&&number[j-1]>t;j--)
                number[j]=number[j-1];
            number[j]=t;
        }*/
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
