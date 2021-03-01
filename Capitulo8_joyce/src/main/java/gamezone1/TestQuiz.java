/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

import java.util.Scanner;



/**
 *
 * @author ARCHV
 */
public class TestQuiz {
    public static void main(String[] args) {
      Quiz quiz = new Quiz();
      Pregunta pregunta1 = new Pregunta("¿Cual es el rio mas gran del mundo ?");
      pregunta1.addInciso(new Inciso("Nilo",false));
      pregunta1.addInciso(new Inciso("Sena",false));
      pregunta1.addInciso(new Inciso("Amazonas",true));
      pregunta1.addInciso(new Inciso("Atoyac",false));
      
      quiz.addPregunta(pregunta1);
      
      pregunta1.impirmir();
      
        int p = 0;        
        Scanner scan = new Scanner(System.in);
        do {
            Pregunta pregunta = quiz.getPregunta(p);
            pregunta.impirmir();
            
            int respuesta = scan.nextInt();
            
            if (pregunta.respuesta(respuesta)) {
                System.out.println("Correcto");
            }else{
                System.out.println("Incorrecto");
            }
              p++;      
        } while (p<quiz.size());
        
    }
        }
         
    

