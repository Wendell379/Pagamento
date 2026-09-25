//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    formaspagamento pix = new pagamentopix();
    pix.processarpagamento();

    IO.println("------------------------------");

    pix.processarpagamento();

    IO.println("------------------------------");

    formaspagamento boleto = new boleto();
    boleto.processarpagamento();
}