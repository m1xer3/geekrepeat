package ru.danilsibgatullin.lesson3.ex1;

public class PingPongGame {

    private Player player1;
    private Player player2;
    private Player whoNext;

    public PingPongGame(Player player1,Player player2) {
        this.player1=player1;
        this.player2=player2;
        this.whoNext = player1;
    }


    public void playerTurn(Player player){
        player.turn();
        if(whoNext==player1){
            whoNext=player2;
        }
        else whoNext=player1;
    }


    public void gameStart(int turnCount) throws InterruptedException {
        int count=0;
        while(count<=turnCount){

            synchronized (this){
                while (this.whoNext!=player1){
                    wait();
                }
                this.playerTurn(player1);
                Thread.sleep(1000);
                notify();
            }

            new Thread(() -> {
                synchronized (this){
                    try {
                        while(this.whoNext!=player2){
                            wait();
                        }
                        this.playerTurn(player2);
                        Thread.sleep(1000);
                        notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            count++;
        }
    }


}
