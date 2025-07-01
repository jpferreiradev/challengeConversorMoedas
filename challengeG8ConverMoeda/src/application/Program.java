package application;

import entities.ConsultaMoeda;
import entities.GerarMoeda;
import entities.Moeda;

import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ConsultaMoeda consultaMoeda = new ConsultaMoeda();
        System.out.println("Informe o valor da moeda: ");
        String mo = scan.nextLine();

        try {
            Moeda novaMoeda = consultaMoeda.buscaMoeda(mo);
            System.out.println(novaMoeda);
            GerarMoeda gerarMoeda = new GerarMoeda();
            gerarMoeda.salvaJson(novaMoeda);


        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Informe o valor da moeda: ");
        }
    }


}

