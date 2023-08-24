INSERT INTO tb_produto (descricao, data, saida_quantidade, entrada_quantidade, preco_custo, preco_venda) VALUES ('ProdutoA', '2023-01-01', 0, 5, 5.00, 10.00);
INSERT INTO tb_produto (descricao, data, saida_quantidade, entrada_quantidade, preco_custo, preco_venda) VALUES ('ProdutoB', '2023-01-01', 0, 5, 5.00, 10.00);


INSERT INTO tb_item_produto_compra (id_produto_fk, quantidade) VALUES (1, 5);
INSERT INTO tb_item_produto_compra (id_produto_fk, quantidade) VALUES (2, 5);

INSERT INTO tb_item_produto_venda (id_produto_fk, quantidade) VALUES (1, 1);
INSERT INTO tb_item_produto_venda (id_produto_fk, quantidade) VALUES (2, 1);