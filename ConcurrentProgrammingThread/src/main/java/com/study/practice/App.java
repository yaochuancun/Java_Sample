package com.study.practice;

import com.study.practice.beans.NumberHolder;
import com.study.practice.thread.DecreaseThread;
import com.study.practice.thread.IncreaseThread;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        NumberHolder numberHolder = new NumberHolder();

        IncreaseThread increaseThread = new IncreaseThread(numberHolder);
        DecreaseThread decreaseThread = new DecreaseThread(numberHolder);
//        IncreaseThread increaseThread1 = new IncreaseThread(numberHolder);
//        DecreaseThread decreaseThread1 = new DecreaseThread(numberHolder);

        increaseThread.start();
        decreaseThread.start();
//        increaseThread1.start();
//        decreaseThread1.start();
    }
}
