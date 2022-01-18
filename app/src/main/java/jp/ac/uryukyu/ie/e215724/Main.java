package jp.ac.uryukyu.ie.e215724;
import java.util.Scanner;

public class Main {
    /**
     * GameMasterクラスを呼び出しゲームを実行するメソッド
     * ３ゲーム分の得点を出し、最後に合計得点を出力する
     * @param args
     */
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("名前を入力してください");
        String playerName = scanner.next();
        System.out.println("ようこそ"+playerName+"さん。");
        
        int point = GameMaster.gamemaster(1) + GameMaster.gamemaster(2) + GameMaster.gamemaster(3);
        System.out.println("ゲームが終了しました!");
        System.out.println("得点は"+point+"点です!お疲れ様です。");
    }
    
}
    
    

    
