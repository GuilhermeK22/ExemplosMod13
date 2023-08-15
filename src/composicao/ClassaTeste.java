package composicao;

public class ClassaTeste {
    public static void main(String arg[]){
        Banco banco = new Banco();
        banco.setNome("B10");
        banco.setCodigo(0561211L);

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(50d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(200d);
    }
}
