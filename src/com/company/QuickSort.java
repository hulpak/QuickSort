package com.company;

/**
 * Created by Valeriy on 17.03.2017.
 */
public class QuickSort {
private int arr[];
    public QuickSort(int arr[]){
        this.arr = arr;
        QuickSort(arr,0,arr.length-1);
    }

    public int Partition(int []arr,int p,int q){
        int x = arr[(p+q)/2];
        int pos = (p+q)/2;
        int i=0;
        while(i<=pos) {
            if (arr[i] >= x) {
                int tmp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = tmp;
                pos = i;
                i++;
            }
            else{
                i++;
            }
        }


        i = pos+1;
        while(i<=q){
            if (arr[i] <= x) {
                int pos_n = i;
                int res = arr[i];
                for(int j=i;j>pos;j--){
                    arr[j]=arr[j-1];
                }
                arr[pos] = res;
                pos++;
                i++;
                pos_n=i;
            }else i++;
        }
        return pos;
    }

    public void QuickSort(int arr[],int p,int q){
        if(p>=q) return;
        int i = Partition(arr,p,q);
        QuickSort(arr,p,i-1);
        QuickSort(arr,i+1,q);
    }
}
