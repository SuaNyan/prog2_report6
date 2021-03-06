package jp.ac.uryukyu.ie.e215724;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class GameMaster {
    /**gamemasterメソッド
     * ゲームを進行するメソッド
     */
    public static int gamemaster(int turn){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--------------------"+turn+"ゲームを始めます--------------------");
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,9));
        Collections.shuffle(list);
        List<Integer> card = list.subList(0,4);
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(15,16,17,19,21,22,23,25));
        Collections.shuffle(list2);
        Integer target = list2.get(0);
        System.out.println("→→手札 "+card+"　　　目標値は "+target+"です");
        System.out.println("はじめに演算する数字を,手札から選んで入力してください"+card+":");


        while(true){
        int num1 = scanner.nextInt();

            if (card.contains(num1)){
                System.out.println("1回目の演算子を選択して数字を入力してください。 1,+  2,-  3,×  4,÷:");
                int calc = scanner.nextInt();
                
                while(true){
                    System.out.print("二つ目の数字を入力してください"+card+":");
                    int num2 = scanner.nextInt();
                    if (card.contains(num2)){
                        System.out.println("1回目の計算結果は"+Turn1.turn1(num1,num2,calc)+"です");
                        if(Turn1.turn1(num1,num2,calc)==target){
                            System.out.println("★★★★クリアです!3ポイント獲得しました!★★★★");
                            return 3;
                        }else{
                            System.out.print("演算子を選択して数字を入力してください。 1,+  2,-  3,×  4,÷:");
                            int calc2 = scanner.nextInt();
                            System.out.print("演算する数字を一つ,手札から入力してください。"+card+":");
                            int num4 = scanner.nextInt();
                            int num3 = Turn1.turn1(num1,num2,calc);
                            System.out.println("2回目の計算結果は"+Turn2.turn2(num3,num4,calc2)+"です");
                            if(Turn2.turn2(num3,num4,calc2)==target){
                                System.out.println("★★★★クリアです!2ポイント獲得しました!★★★★");
                                return 2;
                            }else{
                                System.out.print("演算子を選択して数字を入力してください。 1,+  2,-  3,×  4,÷:");
                                int calc3 = scanner.nextInt();
                                while(true){
                                    System.out.println("最後に演算する数字を一つ,手札から入力してください"+card+":");
                                    int num6 = scanner.nextInt();
                                    if(card.contains(num6)){
                                    int num5 = Turn2.turn2(num3,num4,calc2);
                                    System.out.println("3回目の計算結果は"+Turn3.turn3(num5,num6,calc3)+"です");
                                        if(Turn3.turn3(num5,num6,calc3)==target){
                                            System.out.println("★★★★クリアです!1ポイント獲得しました!★★★★");
                                            return 1;
                                        }else{
                                            System.out.println(turn+"ゲームは失敗です");
                                            return 0;
                                        }
                                    }else{
                                        System.out.println("※手札から入力してください"+card+":");
                                    }
                                }
                            }
                        }
                    }else{//2つ目if
                        System.out.println("※手札から入力してください"+card+":");

                    }//2つ目else
                    
                }//2つ目while
            //以下完結
               }else{//1つ目if
                System.out.println("※手札から入力してください"+card+":");
            }//1つ目else
        }//1つ目while
    }//method
}//class
