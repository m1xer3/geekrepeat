package ru.danilsibgatullin.lesson3.ex2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    private int count=0;
    private int maxCount;
    private int minCount;
    private Lock lock = new ReentrantLock();

    public Counter(int maxCount,int minCount) {
        this.maxCount = maxCount;
        this.minCount=minCount;
    }

    public void countUp() throws InterruptedException {
            this.lock.lockInterruptibly();
            if(this.count<this.maxCount) this.count++;
            System.out.println(this.count+" - "+Thread.currentThread().getName());
            this.lock.unlock();
            Thread.sleep(1000);
    }

    public void countDown() throws InterruptedException {
            this.lock.lock();
            if (this.count > this.minCount) this.count++;
            System.out.println(this.count+" - "+Thread.currentThread().getName());
            this.lock.unlock();
            Thread.sleep(1000);

    }

    public boolean isUnLock(){
        return lock.tryLock();
    }

}
