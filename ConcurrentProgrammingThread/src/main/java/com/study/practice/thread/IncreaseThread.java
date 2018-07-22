package com.study.practice.thread;

import com.study.practice.beans.NumberHolder;

public class IncreaseThread extends Thread {
    private NumberHolder numberHolder;

    public IncreaseThread(NumberHolder numberHolder){
        this.numberHolder = numberHolder;
    }

    @Override
    public void run() {
        try {
            for (int i=0 ;i<20 ; i++) {
                Thread.sleep((long)Math.random()*1000);
                numberHolder.increase();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
