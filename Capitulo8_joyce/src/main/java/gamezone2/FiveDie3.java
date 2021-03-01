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
public class FiveDie3 {
 private ArrayList<Die>dado;
 private Integer resultado;

    public FiveDie3() {
        this.dado = new ArrayList<>();
        this.resultado =0;
    }
    
    public void lanzarDado(){
        for (int i = 0; i < 4; i++) {
            dado.add(new Die());
        }
    }
    
    public Integer numRepetidos(){
        int contador = 0;
        int a = 0;
        for (int i = 0; i < dado.size(); i++) {
            for (int j = 0; j < 10; j++) {
               if (this.dado.get(i).getCara()==this.dado.get(j).getCara()) {
                contador++;
            }if (contador<a) {
                    a= contador;
                    this.resultado = a;
                }
            }
         contador =0;
        }
        return a ;
}
}
        