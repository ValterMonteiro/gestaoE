INSERT INTO tb_funcionario (nome, cpf, rua, numero, bairro, cidade, cep, uf, telefone, email) VALUES ('FuncionarioA', '000.000.000-01', 'Rua A', 123, 'Centro', 'Navirai', 79950000, 'MS', 67999999901, 'funcionario.a@email.com');
INSERT INTO tb_funcionario (nome, cpf, rua, numero, bairro, cidade, cep, uf, telefone, email) VALUES ('FuncionarioB', '000.000.000-02', 'Rua B', 123, 'Centro', 'Navirai', 79950000, 'MS', 67999999902, 'funcionario.b@email.com');

INSERT INTO TB_USERS(id, email, senha) VALUES (1, 'email@email.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO TB_ROLE (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO TB_ROLE (authority) VALUES ('ROLE_ADMIN');

INSERT INTO TB_FUNCIONARIO_ROLE (user_id, role_id) VALUES (1, 2);

INSERT INTO tb_fornecedor (razao_social, cnpj, rua, numero, bairro, cidade, cep, uf, telefone, email) VALUES ('FornecedorA', '00.000.000/0001-01', 'Rua A', 123, 'Centro', 'Navirai', 79950000, 'MS', 67999999901, 'fornecedor.a@email.com');
INSERT INTO tb_fornecedor (razao_social, cnpj, rua, numero, bairro, cidade, cep, uf, telefone, email) VALUES ('FornecedorB', '00.000.000/0001-02', 'Rua B', 123, 'Centro', 'Navirai', 79950000, 'MS', 67999999902, 'fornecedor.b@email.com');

INSERT INTO tb_cliente (razao_social, cnpj, rua, numero, bairro, cidade, cep, uf, telefone, email) VALUES ('ClienteA', '00.000.000/0001-01', 'Rua A', 123, 'Centro', 'Navirai', 79950000, 'MS', 67999999901, 'cliente.a@email.com');
INSERT INTO tb_cliente (razao_social, cnpj, rua, numero, bairro, cidade, cep, uf, telefone, email) VALUES ('ClienteB', '00.000.000/0001-02', 'Rua B', 123, 'Centro', 'Navirai', 79950000, 'MS', 67999999902, 'cliente.b@email.com');

INSERT INTO tb_produto (descricao, data) VALUES ('Camiseta Azul', '2023-01-01');
INSERT INTO tb_produto (descricao, data) VALUES ('Camiseta Amarela', '2023-01-01');
INSERT INTO tb_produto (descricao, data) VALUES ('Camiseta Verde', '2023-01-01');
INSERT INTO tb_produto (descricao, data) VALUES ('Camiseta Marrom', '2023-01-01');
INSERT INTO tb_produto (descricao, data) VALUES ('Camiseta Roxa', '2023-01-01');

INSERT INTO tb_compra (id_funcionario_fk, id_fornecedor_fk, nfe_compra, data) VALUES (1, 1, 123, '2023-01-01');
INSERT INTO tb_compra (id_funcionario_fk, id_fornecedor_fk, nfe_compra, data) VALUES (1, 1, 123, '2023-01-01');
INSERT INTO tb_compra (id_funcionario_fk, id_fornecedor_fk, nfe_compra, data) VALUES (1, 1, 123, '2023-01-01');
INSERT INTO tb_compra (id_funcionario_fk, id_fornecedor_fk, nfe_compra, data) VALUES (1, 1, 123, '2023-01-01');
INSERT INTO tb_compra (id_funcionario_fk, id_fornecedor_fk, nfe_compra, data) VALUES (1, 1, 123, '2023-01-01');

INSERT INTO tb_item_produto_compra (id_produto_fk, entrada_quantidade, preco_custo, id_compra_fk) VALUES (1, 10, 5.00, 1);
INSERT INTO tb_item_produto_compra (id_produto_fk, entrada_quantidade, preco_custo, id_compra_fk) VALUES (2, 10, 5.00, 1);
INSERT INTO tb_item_produto_compra (id_produto_fk, entrada_quantidade, preco_custo, id_compra_fk) VALUES (3, 10, 5.00, 1);
INSERT INTO tb_item_produto_compra (id_produto_fk, entrada_quantidade, preco_custo, id_compra_fk) VALUES (4, 10, 5.00, 1);
INSERT INTO tb_item_produto_compra (id_produto_fk, entrada_quantidade, preco_custo, id_compra_fk) VALUES (5, 10, 5.00, 1);

INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 1, '2023-01-01');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 2, '2023-01-01');

INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda) VALUES (1, 1, 5.00);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda) VALUES (2, 1, 5.00);

//instrução para a tabela de contro de estoque
SELECT
    tb_produto.data AS data,
    tb_produto.id AS id_produto,
    tb_produto.descricao AS descricao,
    tb_item_produto_compra.entrada_quantidade AS entrada_quantidade,
    tb_item_produto_compra.preco_custo AS entrada_valor_unit,
    (cast(tb_item_produto_compra.entrada_quantidade as float) * tb_item_produto_compra.preco_custo) AS entrada_valor_total,
    tb_item_produto_venda.saida_quantidade AS saida_quantidade,
    tb_item_produto_compra.preco_custo AS saida_valor_unit,
    (cast(tb_item_produto_venda.saida_quantidade as float) * tb_item_produto_compra.preco_custo) AS saida_valor_total,
    (tb_item_produto_compra.entrada_quantidade - tb_item_produto_venda.saida_quantidade) AS saldo_quantidade,
    (tb_item_produto_compra.entrada_quantidade * tb_item_produto_compra.preco_custo) AS saldo_valor_medio,
    (((cast(tb_item_produto_compra.entrada_quantidade as float) * tb_item_produto_compra.preco_custo)) * ((cast(tb_item_produto_venda.saida_quantidade as float) * tb_item_produto_compra.preco_custo))) AS saldo_valor_total
FROM
    tb_produto
LEFT JOIN
    tb_item_produto_compra ON tb_produto.id = tb_item_produto_compra.id_produto_fk
LEFT JOIN
    tb_item_produto_venda ON tb_produto.id = tb_item_produto_venda.id_produto_fk
    WHERE
	tb_produto.id = 2;
    


//
