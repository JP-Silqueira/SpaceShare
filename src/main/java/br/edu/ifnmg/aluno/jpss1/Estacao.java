package br.edu.ifnmg.aluno.jpss1;

import java.util.ArrayList;

public class Estacao {
    private final int numero;
    private final ArrayList<Reserva> listaReservas;

    public Estacao(int numero) {
        this.numero = numero;
        this.listaReservas = new ArrayList<>();
    }

    //uso de for-each
    public boolean adicionarReserva(Reserva r) {
        int totalHoras = 0;

        for (Reserva reserva : listaReservas) {
            if (r.getInicioTurno().isBefore(reserva.getHoraTermino()) &&
                    reserva.getInicioTurno().isBefore(r.getHoraTermino())) {
                System.out.println();
                System.out.println("Reserva de " + r.getUsuario()
                        + " negada! Conflito de horário com "
                        + reserva.getUsuario() + ".");
                return false;
            }
        }

        //<editor-fold defaultstate="collapsed" desc="for comum">

        /*for (int i = 0; i < listaReservas.size(); i++) {
            if (r.getInicioTurno().isBefore(reserva.getHoraTermino()) &&
                    reserva.getInicioTurno().isBefore(r.getHoraTermino())) {
                System.out.println();
                System.out.println("Reserva de " + r.getUsuario()
                        + "negada! Conflito de horário com"
                        + reserva.getUsuario() + ".");
                return false;
            }
        }*/

        //</editor-fold>

        System.out.println();
        System.out.println("Reserva de " + r.getUsuario() + " adicionada com sucesso !");
        listaReservas.add(r);
        return true;
    }

    public void imprimirMapa() {
        System.out.println("Estação " + numero + ":");

        if (listaReservas.isEmpty()) {
            System.out.println("  Nenhuma reserva agendada no momento.");
        } else {
            for (Reserva reserva : listaReservas) {
                System.out.println("  Usuario: " + reserva.getUsuario()
                        + " de: " + reserva.getInicioTurno()
                        + " às " + reserva.getHoraTermino()
                        + " total: " + reserva.getHoras() + "h");
            }
        }
    }
}


