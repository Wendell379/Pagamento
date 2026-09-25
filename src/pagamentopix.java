public class pagamentopix extends formaspagamento{

    @Override
    public void processarpagamento() {
        IO.println("Seu PIX foi realizado com sucesso"
                        + "\n o codigo da operação é: "
                        + getCodigo() + "\nData de Pagamento "
                        + getDataCriacao()
        );

    }
}
