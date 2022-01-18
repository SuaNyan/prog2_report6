package jp.ac.uryukyu.ie.e215724;
import java.util.Scanner;
public class Turn1 {
    /**Turn1メソッド
     * Calcクラスのcalcメソッドを用いて、ゲーム内で最初の計算を行う。
     * 引数は、GamaMasterクラスでプレイヤーが入力した、最初に使う手札の数字２つと、入力された演算子番号の３つ。（全てint型）
     * 
     */
    public static int turn1(int num1,int num2,int calc){
        Scanner scanner = new Scanner(System.in);
        

        while(true){
            if (calc == 1){
                return Calc.add(num1,num2);
            }else if(calc == 2){
                return Calc.subtraction(num1,num2);
            }else if(calc == 3){
                return Calc.multi(num1,num2);
            }else if(calc == 4){
                return Calc.division(num1,num2);
            }else{
                System.out.println("※1~4から選択してください");} 
                
        }
    }
}
