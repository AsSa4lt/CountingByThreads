package com.st1tchqwerty;
import java.util.Random;
public class Main {
    public static void main(String args[]){
        MyThread th1=new MyThread(0);
        MyThread th2=new MyThread(1);
        int[] numb=new int[10000];
        for(int i=0; i<10000; i++){
            numb[i]=i;
        }
        System.out.println(th1.count(numb)+th2.count(numb));
        int sum=0;
        for(int i=0; i<numb.length; i++){
            sum=sum+numb[i];
        }
        System.out.println(sum);
    }
}
