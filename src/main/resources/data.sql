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

//venda produto 1
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 1, '2023-01-05');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 2, '2023-01-06');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 3, '2023-01-08');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 4, '2023-01-10');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 5, '2023-01-20');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 6, '2023-01-21');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 7, '2023-01-22');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 8, '2023-01-23');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 9, '2023-01-24');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 10, '2023-01-27');

//venda produto 2
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 11, '2023-01-15');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 12, '2023-01-15');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 13, '2023-01-15');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 14, '2023-01-16');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 15, '2023-01-17');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 16, '2023-01-18');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 17, '2023-01-19');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 18, '2023-01-29');

//venda produto 3
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 19, '2023-01-13');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 20, '2023-01-13');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 21, '2023-01-13');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 22, '2023-01-13');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 23, '2023-01-13');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 24, '2023-01-13');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 25, '2023-01-28');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 26, '2023-01-30');

//venda produto 4
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 27, '2023-01-13');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 28, '2023-01-13');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 29, '2023-01-25');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 30, '2023-01-26');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 31, '2023-01-30');

//venda produto 5
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 32, '2023-01-04');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 33, '2023-01-06');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 34, '2023-01-07');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 35, '2023-01-09');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 36, '2023-01-11');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 37, '2023-01-13');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 38, '2023-01-15');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 39, '2023-01-24');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 40, '2023-01-26');
INSERT INTO tb_venda (id_funcionario_fk, id_cliente_fk, nfe_venda, data) VALUES (1, 1, 41, '2023-01-28');

//item venda produto 1
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (1, 1, 25.00, 1);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (1, 1, 25.00, 2);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (1, 1, 25.00, 3);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (1, 1, 25.00, 4);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (1, 1, 25.00, 5);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (1, 1, 25.00, 6);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (1, 1, 25.00, 7);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (1, 1, 25.00, 8);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (1, 1, 25.00, 9);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (1, 1, 25.00, 10);

//item venda produto 2
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (2, 1, 25.00, 11);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (2, 1, 25.00, 12);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (2, 1, 25.00, 13);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (2, 1, 25.00, 14);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (2, 1, 25.00, 15);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (2, 1, 25.00, 16);
//INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (2, 1, 25.00, 17);
//INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (2, 1, 25.00, 18);

//item venda produto 3
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (3, 1, 25.00, 19);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (3, 1, 5.00, 20);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (3, 1, 5.00, 21);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (3, 1, 5.00, 22);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (3, 1, 5.00, 23);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (3, 1, 5.00, 24);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (3, 1, 5.00, 25);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (3, 1, 5.00, 26);

//item venda produto 4
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (4, 1, 5.00, 27);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (4, 1, 5.00, 28);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (4, 1, 5.00, 29);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (4, 1, 5.00, 30);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (4, 1, 5.00, 31);

//item venda produto 5
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (5, 1, 5.00, 32);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (5, 1, 5.00, 33);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (5, 1, 5.00, 34);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (5, 1, 5.00, 35);
INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (5, 1, 5.00, 36);
//INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (5, 1, 5.00, 37);
//INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (5, 1, 5.00, 38);
//INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (5, 1, 5.00, 39);
//INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (5, 1, 5.00, 40);
//INSERT INTO tb_item_produto_venda (id_produto_fk, saida_quantidade, preco_venda, id_venda_fk) VALUES (5, 1, 5.00, 41);

//instrução para a tabela de contro de estoque
SELECT
					tb_compra.data AS data,
					tb_produto.id AS idProduto,
					tb_produto.descricao AS descricao,
					tb_item_produto_compra.entrada_quantidade AS entradaQuantidade,
					tb_item_produto_compra.preco_custo AS entradaValorUnit,
					(tb_item_produto_compra.entrada_quantidade * tb_item_produto_compra.preco_custo) AS entradaValorTotal,
				NULL AS saidaQuantidade,
				NULL AS saidaValorUnit,
				NULL AS saidaValorTotal,
					(tb_item_produto_compra.entrada_quantidade - COALESCE(tb_item_produto_venda.saida_quantidade, 0)) AS saldoQuantidade,
					(tb_item_produto_compra.entrada_quantidade * tb_item_produto_compra.preco_custo) AS saldoValorMedio,
					((tb_item_produto_compra.entrada_quantidade * tb_item_produto_compra.preco_custo) - COALESCE((tb_item_produto_venda.saida_quantidade * tb_item_produto_compra.preco_custo), 0)) AS saldoValorTotal
				FROM
					tb_produto
				INNER JOIN
					tb_item_produto_compra ON tb_produto.id = tb_item_produto_compra.id_produto_fk
				INNER JOIN
					tb_compra ON tb_item_produto_compra.id_compra_fk = tb_compra.id
				LEFT JOIN
					tb_item_produto_venda ON tb_produto.id = tb_item_produto_venda.id_produto_fk
				WHERE
					tb_produto.id = ?1

				UNION

				SELECT
					tb_venda.data AS data,
					tb_produto.id AS idProduto,
					tb_produto.descricao AS descricao,
				NULL AS entradaQuantidade,
				NULL AS entradaValorUnit,
				NULL AS entradaValorTotal,
					tb_item_produto_venda.saida_quantidade AS saidaQuantidade,
					tb_item_produto_compra.preco_custo AS saidaValorUnit,
					(tb_item_produto_venda.saida_quantidade * tb_item_produto_compra.preco_custo) AS saidaValorTotal,
				COALESCE(tb_item_produto_compra.entrada_quantidade, 0) - tb_item_produto_venda.saida_quantidade AS saldoQuantidade,
					tb_item_produto_compra.preco_custo AS saldoValorMedio,
				(COALESCE(tb_item_produto_compra.entrada_quantidade, 0) - tb_item_produto_venda.saida_quantidade) * tb_item_produto_compra.preco_custo AS saldoValorTotal
				FROM
					tb_produto
				INNER JOIN
					tb_item_produto_venda ON tb_produto.id = tb_item_produto_venda.id_produto_fk
				INNER JOIN
					tb_venda ON tb_item_produto_venda.id_venda_fk = tb_venda.id
				LEFT JOIN
					tb_item_produto_compra ON tb_produto.id = tb_item_produto_compra.id_produto_fk
				WHERE
					tb_produto.id = ?1

				ORDER BY
			 		data;
//
