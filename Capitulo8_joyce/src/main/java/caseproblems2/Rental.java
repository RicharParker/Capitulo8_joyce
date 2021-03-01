/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblems2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ARCHV
 */
public class Rental {
    public final static String equipos[] = {"moto acuática", "pontón", "bote de remos", "canoa", "kayak", "silla de playa", "paraguas","otros"};
    private String contract;
    private Integer minutes;
    private Integer hours;
    private Integer extraMinutes;
    private Integer price;
    private Integer coupon;
    private String nTelefono;
    Scanner sc = new Scanner(System.in);

    public Rental(String contract, Integer minutes) {
        this.contract = contract;
        this.minutes = minutes;
        this.hours= minutes/60;
        this.extraMinutes=minutes %60;
        this.price= (this.hours * 40) + (this.extraMinutes / 40) + (this.extraMinutes % 40);
    }
    
    public void registrar(){        
        for (int i = 0; i < 5; i++) {
            System.out.println("numero de contrato :" );
            String noContrato = sc.nextLine();

            System.out.println("total de minutos :");
            int minutos = sc.nextInt();

            System.out.println("numero de telefono :");
            String telefoo = sc.nextLine();

            System.out.println("Introduce el numero de equipo [1]Moto acuatica [2]Ponton [3]Bote de remos[4]Canoa [5]Kayac [6]Silla de playa [7]Paraguas [8]Otro");
            int equipo = sc.nextInt();
        }
    }

    public String getnTelefono() {
        return nTelefono;
    }

    public void setnTelefono(String numero) {
        numero = numero.replace('(', '\0');
        numero = numero.replace(')', '\0');
        numero = numero.replace('-', '\0');
        numero = numero.replace(' ', '\0');
        numero = numero.replaceAll("\0", "");
        if (numero.length()!=10) {
            numero = "0000000000";
        }
        this.nTelefono = numero;
    }
    
    
    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
        this.hours= minutes/60;
        this.extraMinutes=minutes %60;
        this.price= (this.hours * 40) + (this.extraMinutes / 40) + (this.extraMinutes % 40);
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getExtraMinutes() {
        return extraMinutes;
    }

    public void setExtraMinutes(Integer extraMinutes) {
        this.extraMinutes = extraMinutes;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
