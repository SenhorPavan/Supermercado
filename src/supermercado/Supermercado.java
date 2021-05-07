package supermercado;

public class Supermercado {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("SEU AGENOR", "158.454.794-36");
        Cliente c2 = new Cliente("ANTONHO", "487.365.123-45");

        Produto p1 = new Produto("Luz RGB que toca musica", 10, 15);
        Produto p3 = new Produto("Geladeria Eletrolux de duas Portas", 500, 60);
        Produto p2 = new Produto("Bala que gruda no céu da boca", 2, 50);

        Item i1 = new Item(p1, 16);
        Item i2 = new Item(p3, 70);

        Pedido pd1 = new Pedido(c1);
        pd1.adicionarItem(i1);
        pd1.adicionarItem(i2);

        System.out.println("--------------CLIENTE----------------");

        System.out.println("NOME CLIENTE: " + pd1.getCliente().getNome());
        System.out.println("TOTAL: " + pd1.getValorTotal());

        System.out.println("--------------PEDIDO-----------------");

        Item itens[] = pd1.getItens();
        for (int i = 0; i < itens.length; i++) {
            System.out.print("PRODUTO: " + itens[i].getProduto().getNome());
            System.out.print(" | QUANTIDADE COMPRADA: " + itens[i].getQtdComprado());
            System.out.println(" | PREÇO DO PRODUTO: " + itens[i].getProduto().getPreco());
        }

        System.out.println("QUANTIDADE PRODUTO 1 = " + p1.getQuantidade());
        System.out.println("QUANTIDADE PRODUTO 2 = " + p2.getQuantidade());
        System.out.println("QUANTIDADE PRODUTO 3 = " + p3.getQuantidade());

    }
}
