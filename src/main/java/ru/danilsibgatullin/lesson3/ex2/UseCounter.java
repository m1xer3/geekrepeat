package ru.danilsibgatullin.lesson3.ex2;

public class UseCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(150,0);

        Thread thread1 = new Thread(()->{
            try {
                while(true){
                        counter.countUp();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(()->{
            try {
                while(true){
                        counter.countUp();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();


        while(true) {
//            counter.countUp();
        }


    }
}
