package agregacao;

public class ClasseTeste {
    public static void main(String args[]) {
        Produto produtotv = criarProduto(1L, 10d, "TV");
        Produto produtocel = criarProduto(2L, 20d, "Celular");

        Vendedor vendedor = criarVendedor("Zé", 10d);
        Comprador comprador = criarComprador("João", 30d);
        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtotv);
        venda.add(produtocel);
        venda.concretizarVenda();
    }

    private static Vendedor criarVendedor(String nome, Double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, Double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;

    }

    private static Comprador criarComprador(String nome, Double verba) {
        Comprador comprador = new Comprador();
        comprador.setNome(" Bia ");
        comprador.setVerba(verba);
        return comprador;
    }
}
