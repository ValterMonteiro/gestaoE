INSERT INTO tb_produto (descricao, data, saida_quantidade, entrada_quantidade, preco_custo, preco_venda) VALUES ('Camiseta Azul', '2023-01-01', 0, 10, 5.00, 25.00);
INSERT INTO tb_produto (descricao, data, saida_quantidade, entrada_quantidade, preco_custo, preco_venda) VALUES ('Camiseta Amarela', '2023-01-01', 0, 10, 5.00, 25.00);
INSERT INTO tb_produto (descricao, data, saida_quantidade, entrada_quantidade, preco_custo, preco_venda) VALUES ('Camiseta Verde', '2023-01-01', 0, 10, 5.00, 25.00);
INSERT INTO tb_produto (descricao, data, saida_quantidade, entrada_quantidade, preco_custo, preco_venda) VALUES ('Camiseta Marrom', '2023-01-01', 0, 10, 5.00, 25.00);
INSERT INTO tb_produto (descricao, data, saida_quantidade, entrada_quantidade, preco_custo, preco_venda) VALUES ('Camiseta Roxa', '2023-01-01', 0, 10, 5.00, 25.00);


INSERT INTO tb_item_produto_compra (id_produto_fk, quantidade) VALUES (1, 10);
INSERT INTO tb_item_produto_compra (id_produto_fk, quantidade) VALUES (2, 10);
INSERT INTO tb_item_produto_compra (id_produto_fk, quantidade) VALUES (3, 10);
INSERT INTO tb_item_produto_compra (id_produto_fk, quantidade) VALUES (4, 10);
INSERT INTO tb_item_produto_compra (id_produto_fk, quantidade) VALUES (5, 10);


INSERT INTO tb_item_produto_venda (id_produto_fk, quantidade) VALUES (1, 1);
INSERT INTO tb_item_produto_venda (id_produto_fk, quantidade) VALUES (2, 1);

INSERT INTO tb_fornecedor (razao_social, cnpj, rua, numero, bairro, cidade, cep, uf, telefone, email) VALUES ('FornecedorA', '00.000.000/0001-01', 'Rua A', 123, 'Centro', 'Navirai', 79950000, 'MS', 67999999901, 'fornecedor.a@email.com');
INSERT INTO tb_fornecedor (razao_social, cnpj, rua, numero, bairro, cidade, cep, uf, telefone, email) VALUES ('FornecedorB', '00.000.000/0001-02', 'Rua B', 123, 'Centro', 'Navirai', 79950000, 'MS', 67999999902, 'fornecedor.b@email.com');

INSERT INTO tb_cliente (razao_social, cnpj, rua, numero, bairro, cidade, cep, uf, telefone, email) VALUES ('ClienteA', '00.000.000/0001-01', 'Rua A', 123, 'Centro', 'Navirai', 79950000, 'MS', 67999999901, 'cliente.a@email.com');
INSERT INTO tb_cliente (razao_social, cnpj, rua, numero, bairro, cidade, cep, uf, telefone, email) VALUES ('ClienteB', '00.000.000/0001-02', 'Rua B', 123, 'Centro', 'Navirai', 79950000, 'MS', 67999999902, 'cliente.b@email.com');


INSERT INTO tb_funcionario (nome, cpf, rua, numero, bairro, cidade, cep, uf, telefone, email) VALUES ('FuncionarioA', '000.000.000-01', 'Rua A', 123, 'Centro', 'Navirai', 79950000, 'MS', 67999999901, 'funcionario.a@email.com');
INSERT INTO tb_funcionario (nome, cpf, rua, numero, bairro, cidade, cep, uf, telefone, email) VALUES ('FuncionarioB', '000.000.000-02', 'Rua B', 123, 'Centro', 'Navirai', 79950000, 'MS', 67999999902, 'funcionario.b@email.com');

INSERT INTO tb_compra (id_funcionario_fk, id_fornecedor_fk, nfe_compra, data) VALUES (1, 1, 123, '2023-01-01');
INSERT INTO tb_compra (id_funcionario_fk, id_fornecedor_fk, nfe_compra, data) VALUES (1, 1, 124, '2023-01-01');

INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 1, '2023-01-01');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 2, '2023-01-01');

//instrução para a tabela de contro de estoque
SELECT
    tb_produto.data AS data,
    tb_produto.id AS id_produto,
    tb_produto.descricao AS descricao,
    tb_item_produto_compra.quantidade AS entrada_quantidade,
    tb_produto.preco_custo AS entrada_valor_unit,
    (cast(tb_item_produto_compra.quantidade as float) * tb_produto.preco_custo) AS entrada_valor_total,
    tb_item_produto_venda.quantidade AS saida_quantidade,
    tb_produto.preco_custo AS saida_valor_unit,
    (cast(tb_item_produto_venda.quantidade as float) * tb_produto.preco_custo) AS saida_valor_total,
    (tb_item_produto_compra.quantidade - tb_item_produto_venda.quantidade) AS saldo_quantidade,
    (tb_item_produto_compra.quantidade * tb_produto.preco_custo) AS saldo_valor_medio,
    (((cast(tb_item_produto_compra.quantidade as float) * tb_produto.preco_custo)) * ((cast(tb_item_produto_venda.quantidade as float) * tb_produto.preco_custo))) AS saldo_valor_total
FROM
    tb_produto
LEFT JOIN
    tb_item_produto_compra ON tb_produto.id = tb_item_produto_compra.id_produto_fk
LEFT JOIN
    tb_item_produto_venda ON tb_produto.id = tb_item_produto_venda.id_produto_fk;
    
    //
