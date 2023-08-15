package abstratas;

public class ClasseTeste {
    public static void main(String args[]) {
        Assalariado empregado = new Assalariado();
        empregado.setCpf("56579745862");
        empregado.setNome("José");
        empregado.setSobrenome("Pires");
        empregado.setSalario(100d);
        System.out.println(empregado.getNome() + " Tem de salário " + empregado.vencimento());

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("6565232456");
        comissionado.setNome("Pedro");
        comissionado.setSobrenome("Pires");
        comissionado.setTotalVenda(2000d);
        comissionado.setTotalComissao(0.1d);
        System.out.println(comissionado.getNome() + " Tem de salário " + comissionado.vencimento());

        Horista horista = new Horista();
        horista.setCpf("0000000000");
        horista.setNome("Zé");
        horista.setSobrenome("Pires");
        horista.setPrecoHora(60d);
        horista.setHorasTrabalhada(5d);
        System.out.println(horista.getNome() + " Tem de salário " + horista.vencimento());
    }
}
