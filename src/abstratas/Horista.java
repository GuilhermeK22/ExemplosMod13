package abstratas;

public class Horista extends Empregado {
    private Double precoHora;
    private Double horasTrabalhada;

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getHorasTrabalhada() {
        return horasTrabalhada;
    }

    public void setHorasTrabalhada(Double horasTrabalhada) {
        this.horasTrabalhada = horasTrabalhada;
    }

    @Override
    public Double vencimento() {
        return precoHora*horasTrabalhada;
    }
}
