import java.time.LocalDate;

public abstract class formaspagamento {

    private int Codigo;
    private LocalDate DataCriacao;


    public formaspagamento() {
        this.DataCriacao = LocalDate.now();
    }

    public  abstract void processarpagamento();

    public int getCodigo() {
        Codigo += 1;
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public LocalDate getDataCriacao() {
        return DataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        DataCriacao = dataCriacao;
    }
}
