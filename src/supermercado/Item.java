
package supermercado;

public class Item {
    
    private Produto produto;
    private int qtdComprado;
    

    public Item(Produto produto, int qtdComprado) {
        this.produto = produto;
        this.qtdComprado = qtdComprado;
        
        if(this.qtdComprado > this.produto.getQuantidade()){
            System.out.println("NÃO TEMOS ESTOQUE");
            this.qtdComprado = this.produto.getQuantidade();
        }      
        this.produto.tiraEstoque(this.qtdComprado);     
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQtdComprado() {
        return qtdComprado;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQtdComprado(int qtdComprado) {
        this.qtdComprado = qtdComprado;
    }
    
    
    
}
