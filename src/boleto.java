import java.time.LocalDate;

public class boleto extends formaspagamento {

    private LocalDate DatadeVencimento;

    public LocalDate getDatadeVencimento() {
        return DatadeVencimento = getDataCriacao().plusDays(10);
    }

    @Override
    public void processarpagamento() {
        IO.println("Seu Boleto foi realizado com sucesso"
                + "\n o codigo da operação é: "
                + getCodigo() + "\nData de criação  "
                + getDataCriacao()
                + " Data de Vencimento é: "
                + getDatadeVencimento()
        );
    }
}
