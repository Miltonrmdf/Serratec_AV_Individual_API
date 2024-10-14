-- Criação da tabela 'pratos'
CREATE TABLE pratos (
    id INTEGER PRIMARY KEY, -- ID único para cada prato chave primaria 
    nome VARCHAR(100), -- Nome do prato
    descricao TEXT, -- Descrição do prato
    preco DECIMAL(10, 2)  -- Preço do prato
);
