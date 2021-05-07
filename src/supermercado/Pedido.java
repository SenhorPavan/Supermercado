package supermercado;

public class Pedido {

    private Cliente cliente;
    private Item itens[] = new Item[2];
    private double valorTotal;
    private int vc = 0;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
    

    public void adicionarItem(Item item) {
        this.itens[this.vc] = item;
        this.valorTotal += (item.getProduto().getPreco() * item.getQtdComprado());
        this.vc++;

    }

    public Cliente getCliente() {
        return cliente;
    }

    public Item[] getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
