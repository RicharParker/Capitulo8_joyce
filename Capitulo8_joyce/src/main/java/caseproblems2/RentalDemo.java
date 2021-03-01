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
public class RentalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Rental> rentas = new ArrayList<>();
        Rental renta1 = new Rental("Contrato 1",230);
        renta1.registrar();
    }
}
