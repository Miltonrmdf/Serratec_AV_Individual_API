-- Criação da tabela 'clientes'
CREATE TABLE clientes (
	id INTEGER PRIMARY KEY, -- ID único para cada cliente, chave primária
    nome VARCHAR(100) , -- Nome do cliente, com até 100 caracteres
    email VARCHAR(100), -- E-mail do cliente
    telefone VARCHAR(15) -- Telefone do cliente, opcional (pode ser nulo), com até 15 caracteres
);
