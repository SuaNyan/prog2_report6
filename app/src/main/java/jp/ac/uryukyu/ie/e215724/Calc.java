package jp.ac.uryukyu.ie.e215724;



public class Calc {
    /**
     * GameMasterクラスでプレイヤーが入力した手札の数字を引数として足し算をして結果を返す
     */
    public static int add(int num1,int num2){
        return num1 + num2;
    }
    /**
     * GameMasterクラスでプレイヤーが入力した手札の数字を引数として引き算をして結果を返す
     */
    public static int subtraction(int num1,int num2){
        return num1 - num2;
    }
    /**
     * GameMasterクラスでプレイヤーが入力した手札の数字を引数として掛け算をして結果を返す
     */
    public static int multi(int num1,int num2){
        return num1 * num2;
    }
    /**
     * GameMasterクラスでプレイヤーが入力した手札の数字を引数として割り算をして結果を返す
     */
    public static int division(int num1,int num2){
        return num1 / num2;
    }
}
