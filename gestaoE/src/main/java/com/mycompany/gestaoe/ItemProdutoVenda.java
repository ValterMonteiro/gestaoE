package com.mycompany.gestaoe;
public class ItemProdutoVenda {
    	private Produto produto;
	private int quantidade;
    public ItemProdutoVenda(){
        
    }
        public ItemProdutoVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
	public void validaItemProduto() {

	}
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}