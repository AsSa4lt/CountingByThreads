package com.st1tchqwerty;

public class MyThread implements Runnable{
    private int start;
    private int sum;
    public MyThread(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();

    }
    public int count(int numb[]){
        sum=0;
        for(int i=numb.length/2*start;i<numb.length/2*start+numb.length/2; i++){
            sum=sum+numb[i];
        }
        return sum;
    }
}
