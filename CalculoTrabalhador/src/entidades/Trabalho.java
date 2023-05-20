package entidades;

import entidades.enums.NivelCargo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalho {
    private String nome;
    private NivelCargo nivelCargo;
    private Double baseSalario;

    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();

    public Trabalho() {
    }

    public Trabalho(String nome, NivelCargo nivelCargo, Double baseSalario, Departamento departamento) {
        this.nome = nome;
        this.nivelCargo = nivelCargo;
        this.baseSalario = baseSalario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelCargo getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(NivelCargo nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public Double getBaseSalario() {
        return baseSalario;
    }

    public void setBaseSalario(Double baseSalario) {
        this.baseSalario = baseSalario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }

    public void addContrato(ContratoHora contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(ContratoHora contrato) {
        contratos.remove(contrato);
    }

    public double ganhoTotal(int ano, int mes) {
        double soma = baseSalario;
        Calendar cal = Calendar.getInstance();
        for (ContratoHora c : contratos) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes) {
                soma += c.totalValor();
            }
        }
        return soma;
    }
}
