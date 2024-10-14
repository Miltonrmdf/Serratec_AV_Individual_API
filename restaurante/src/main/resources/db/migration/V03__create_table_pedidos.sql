-- Criação da tabela 'pedidos'
CREATE TABLE pedidos (
    id INTEGER PRIMARY KEY, -- ID único para cada pedido, primary key
    cliente_id INTEGER, -- ID do cliente que fez o pedido, deve referenciar um cliente na tabela 'clientes'
    prato_id INTEGER, -- ID do prato pedido, deve referenciar um prato na tabela 'pratos'
    quantidade INTEGER, -- Quantidade do prato no pedido
    data TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Data e hora do pedido, padrão é o momento da inserção do registro
    FOREIGN KEY (cliente_id) REFERENCES clientes(id), -- Define uma chave estrangeira que referencia a tabela 'clientes'
    FOREIGN KEY (prato_id) REFERENCES pratos(id) -- Define uma chave estrangeira que referencia a tabela 'pratos'
);