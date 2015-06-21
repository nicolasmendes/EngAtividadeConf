/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engatividadeconf;

/**
 *
 * @author NICOLAS
 */
public class A {

    
    private float A2;
    
    private String A3;

    private String Aprinc4;

    public String getAprinc4() {
        return Aprinc4;
    }

    public void setAprinc4(String Aprinc4) {
        this.Aprinc4 = Aprinc4;
    }

    private String Aramo4;

    public String getAramo4() {
        return Aramo4;
    }

    public void setAramo4(String Aramo4) {
        this.Aramo4 = Aramo4;
    }

    public String getA3() {
        return A3;
    }

    public void setA3(String A3) {
        this.A3 = A3;
    }

    public float getA2() {
        return A2;
    }

    public void setA2(float A2) {
        this.A2 = A2;
    }

    private int A1;

    public int getA1() {
        return A1;
    }

    public void setA1(int A1) {
        this.A1 = A1;
    }
    public static float soma(int a, float b) {
        return a + b;
    }
    public  void main(String[] args) {
        A1 = 2;
        A2 = 3;
        float result = soma(A1, A2);
    }
    
}
