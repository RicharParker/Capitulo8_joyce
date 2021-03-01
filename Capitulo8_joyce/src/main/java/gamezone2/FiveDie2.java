/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

import java.util.ArrayList;

/**
 *
 * @author ARCHV
 */
public class FiveDie2 {
 private ArrayList<Die>dado;
 private Integer resultado;

    public FiveDie2() {
    this.dado = new ArrayList<>();
    this.resultado = 0;
    }
    
    public void lanzarDado(){
        for (int i = 0; i < 4; i++) {
            dado.add(new Die());
        }
    }
    
    public void devolver(){
        for (int i = 0; i < dado.size(); i++) {
            System.out.println(dado.get(i).getCara());
        }
    }
    
    
 
    
 
}
