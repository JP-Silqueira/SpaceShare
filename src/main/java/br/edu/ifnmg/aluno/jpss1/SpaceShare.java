package br.edu.ifnmg.aluno.jpss1;

import java.time.LocalTime;

public class SpaceShare {

    public static void main(String[] args) {

        Estacao estacao1 = new Estacao(1);

        Reserva r1 = new Reserva("Joao", LocalTime.of(8,0), 2);
        Reserva r2 = new Reserva("Maria", LocalTime.of(9,0),2);
        Reserva r3 = new Reserva("Carlos", LocalTime.of(10,0),1);
        Reserva r4 = new Reserva("Ana", LocalTime.of(7,0),4);

        estacao1.adicionarReserva(r1);
        estacao1.adicionarReserva(r2);
        estacao1.adicionarReserva(r3);
        estacao1.adicionarReserva(r4);

        //<editor-fold defaultstate="collapsed" desc="outros jeitos de fazer a adição e print">

        // opcao 1:
        /*String[] nomes = {"Ana", "Bruno", "Carlos"};
        int[] horas = {4, 3, 4};

        System.out.println();
        for (int i = 0; i < nomes.length; i++) {
            Reserva r = new Reserva(nomes[i], horas[i]);
            System.out.println("Adicionando " + nomes[i]
                    + " (" + horas[i]
                    + "h): " + estacao1.adicionarReserva(r));
        }*/


        //opcao 2:
        /*Reserva[] reservas = {
                new Reserva("Ana", 4),
                new Reserva("Bruno", 3),
                new Reserva("Carlos", 4)
        };

        System.out.println();
        for (Reserva r : reservas) {
            System.out.println("Adicionando "
            + r.getUsuario()
            + " (" + r.getHoras() + "h): "
            + estacao1.adicionarReserva(r));
        }*/

        //</editor-fold>

        System.out.println();
        estacao1.imprimirMapa();
    }
}