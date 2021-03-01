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
public class SecretPhrase2 {
    Scanner sc = new Scanner (System.in);
    private String frase;
    private char letra;
    private String palabra;
    private Integer nIntentos;

    public SecretPhrase2(String frase) {
        this.frase = frase;
    }

    public SecretPhrase2(Integer nIntentos) {
        this.sc = new Scanner(System.in);
    }
    
    public Boolean verificar(){
        Boolean ganar =true;
        setFrase();
        Scanner sc = new Scanner (System.in);
        System.out.println("Adinvina la frase" );
        do {
            System.out.println("Pedir una letra");  
        } while (ganar!=true);
        System.out.println("Adivinaste la palabra");
        return ganar;
    }
    
   public void revelarFrase(){
        char a = 0;
        for (int i = 0; i < this.frase.length() ; i++) {
            if (this.frase.charAt(i) == a){
                this.palabra.charAt(i);
            }
        }
    }


    public String getFrase() {
        return frase;
    }

    public void setFrase() {
        this.frase = frase;
    }

    public char getLetra() {
        return letra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Integer getnIntentos() {
        return nIntentos;
    }

    public void setnIntentos(Integer nIntentos) {
        this.nIntentos = nIntentos;
}
}
