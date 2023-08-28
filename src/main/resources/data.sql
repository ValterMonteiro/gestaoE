INSERT INTO tb_produto (descricao, data, saida_quantidade, entrada_quantidade, preco_custo, preco_venda) VALUES ('ProdutoA', '2023-01-01', 0, 5, 5.00, 10.00);
INSERT INTO tb_produto (descricao, data, saida_quantidade, entrada_quantidade, preco_custo, preco_venda) VALUES ('ProdutoB', '2023-01-01', 0, 5, 5.00, 10.00);


INSERT INTO tb_item_produto_compra (id_produto_fk, quantidade) VALUES (1, 5);
INSERT INTO tb_item_produto_compra (id_produto_fk, quantidade) VALUES (2, 5);

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