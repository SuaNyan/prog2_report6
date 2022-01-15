package jp.ac.uryukyu.ie.e215724;
import java.util.Scanner;

public class GameMaster {
    public static void gamemaster(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("名前を入力してください");
        String playerName = scanner.next();
        System.out.println("ようこそ"+playerName+"さん。ゲームを開始します");
        System.out.println("手札は"+Player.card()+"です");
        System.out.println("目標値　"+Player.target()+"　にしてください");
    }
}
