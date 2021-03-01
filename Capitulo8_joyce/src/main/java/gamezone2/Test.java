/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

/**
 *
 * @author ARCHV
 */
public class Test {
    public static void main(String[] args) {
        Die dado1 = new Die();
        dado1.lanzar();
        FiveDie2 juego1 = new FiveDie2();
        juego1.devolver();
        FiveDie3 juego2 = new FiveDie3 ();
        juego2.numRepetidos();
    }
   
}

