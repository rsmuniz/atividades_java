package entidades;

import java.util.Date;

public class ContratoHora {
    private Date data;
    private Double valorHora;
    private int horas;

    public ContratoHora(){
    }

    public ContratoHora(Date data, Double valorHora, int horas) {
        this.data = data;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    public double totalValor(){
        return valorHora * horas;
    }
}
