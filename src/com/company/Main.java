package com.company;

public class Main {

    public static void main(String[] args) {
        int a[]={-1,2,5,7,6,9,0,3,122,4,-7,12};

        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

        System.out.println();

        QuickSort q = new QuickSort(a);

        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
