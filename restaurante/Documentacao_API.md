# Documentação da restaurante do Restaurante Oriental

## Endpoints

### Pratos

- **POST /restaurante/pratos**
  - Adiciona um novo prato.
  - **Body:**
    ```json
    {
        "nome": "Sushi",
        "descricao": "Arroz com peixe cru",
        "preco": 30.0
    }
    ```

- **GET /restaurante/pratos**
  - Retorna todos os pratos.

- **PUT /restaurante/pratos/{id}**
  - Atualiza um prato existente.
  - **Body:**
    ```json
    {
        "nome": "Sushi de Salmão",
        "descricao": "Arroz com salmão cru",
        "preco": 35.0
    }
    ```

- **DELETE /restaurante/pratos/{id}**
  - Remove um prato existente.

### Clientes

- **POST /restaurante/clientes**
  - Adiciona um novo cliente.
  - **Body:**
    ```json
    {
        "nome": "João",
        "email": "joao@email.com",
        "telefone": "123456789"
    }
    ```

- **GET /restaurante/clientes**
  - Retorna todos os clientes.

- **PUT /restaurante/clientes/{id}**
  - Atualiza um cliente existente.
  - **Body:**
    ```json
    {
        "nome": "João Silva",
        "email": "joao.silva@email.com",
        "telefone": "987654321"
    }
    ```

- **DELETE /restaurante/clientes/{id}**
  - Remove um cliente existente.

### Pedidos

- **POST /restaurante/pedidos**
  - Faz um novo pedido.
  - **Body:**
    ```json
    {
        "cliente": {"id": 1},
        "prato": {"id": 1},
        "quantidade": 2,
        "data": "2023-10-13T12:00:00Z"
    }
    ```

- **GET /restaurante/pedidos**
  - Retorna todos os pedidos.

- **PUT /restaurante/pedidos/{id}**
  - Atualiza um pedido existente.
  - **Body:**
    ```json
    {
        "cliente": {"id": 1},
        "prato": {"id": 1},
        "quantidade": 3,
        "data": "2023-10-13T12:00:00Z"
    }
    ```

- **DELETE /restaurante/pedidos/{id}**
  - Remove um pedido existente.