/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone3;

import java.util.ArrayList;

/**
 *
 * @author ARCHV
 */
public class FullDeck {
    private ArrayList<Card> cards;
    private  ArrayList<Integer> nRepetidos; 

    public FullDeck() {
        cards = new ArrayList<>();

    }
  

  public void obetenerFullDeck(){
      for (int i = 0; i < cards.size(); i++) {
          System.out.println(cards.get(i).getNumero());          
      }
  }
    
}
