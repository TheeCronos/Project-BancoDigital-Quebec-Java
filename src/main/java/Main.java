public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        c1.setNome("Vinicius");
        c2.setNome("Matheus");
        c3.setNome("Junior");

        Conta cc1 = new ContaCorrente(c1);
        Conta cc2 = new ContaCorrente(c2);
        Conta cc3 = new ContaPoupanca(c3);

        Conta cp1 = new ContaPoupanca(c1);
        Conta cp2 = new ContaPoupanca(c2);
        Conta cp3 = new ContaPoupanca(c3);

        cc1.depositar(100);
        cc2.depositar(200);
        cc3.depositar(300);

        cc1.imprimirExtrato();
        cc2.imprimirExtrato();
        cc3.imprimirExtrato();

        cp1.imprimirExtrato();
        cp2.imprimirExtrato();
        cp3.imprimirExtrato();

    }
}