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
public class Die {
    private Integer cara;

    public Die() {
        lanzar();
    }
    
    public void lanzar(){
        this.cara = (int)(Math.random()*6+1);
    }
    public Integer getCara() {
        return cara;
    }

    public void setCara(Integer cara) {
        this.cara = cara;
    }
    
}
