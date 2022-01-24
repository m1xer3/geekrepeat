package ru.danilsibgatullin.lesson3.ex1;

public class GameStartApp {
    public static void main(String[] args) throws InterruptedException {

        Player player1 =new Ping();
        Player player2 =new Pong();
        PingPongGame game = new PingPongGame(player1,player2);
        game.gameStart(20);
    }
}
