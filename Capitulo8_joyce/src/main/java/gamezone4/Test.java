/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone4;

import java.util.Scanner;

/**
 *
 * @author ARCHV
 */
public class Test {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Adivina la palabra");
       SecretPhrase2 frase = new SecretPhrase2("Go team");
       frase.setFrase();
       frase.verificar();
       frase.revelarFrase();
    }
    }

