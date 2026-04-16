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

        System.out.println();
        estacao1.imprimirMapa();
    }
}
