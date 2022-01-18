/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.ac.uryukyu.ie.e215724;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalcTest {
    /**
     * Calcクラスのaddメソッドが正常に機能するかをテストする。
     * int型の引数３と５を用意し、計算結果が８になることを確かめる
     */
    @Test
    public void addTest(){
        int num1 = 5;
        int num2 = 3;
        int num = Calc.add(num1,num2);
        assertTrue(num==8);

    }

}