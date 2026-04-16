package br.edu.ifnmg.aluno.jpss1;

import java.time.LocalTime;

public class Reserva {
    private String usuario;
    private int horas;
    private LocalTime inicioTurno;

    public Reserva(String usuario, LocalTime inicioTurno, int horas) {
        this.usuario = usuario;
        this.inicioTurno = inicioTurno;
        this.horas = horas;
    }

    //<editor-fold defaultstate="collapsed" desc="geters and setters">

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public LocalTime getInicioTurno() {
        return inicioTurno;
    }

    public void setInicioTurno(LocalTime inicioTurno) {
        this.inicioTurno = inicioTurno;
    }

    //</editor-fold>

    public LocalTime getHoraTermino() {
        return inicioTurno.plusHours(horas);
    }

}
