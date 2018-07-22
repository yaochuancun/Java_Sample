package com.study.practice.beans;

public class NumberHolder {
    int number;

    /**
     * 注意：必须有synchronized关键字
     * @throws InterruptedException
     */
    public synchronized void increase() throws InterruptedException {
        if (number == 1)
             wait();

        number++;
        System.out.println(number);
        notify();
    }

    /**
     * 注意：必须有synchronized关键字
     * @throws InterruptedException
     */
    public synchronized void decrease() throws InterruptedException {
        if (number == 0)
            wait();

        number--;
        System.out.println(number);
        notify();
    }
}
