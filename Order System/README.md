# 🛒 E-commerce Order System (Advanced Composition)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação robusta de console desenvolvida em **Java** para consolidar o domínio sobre **Composição de Objetos** em múltiplos níveis, simulando o fluxo de fechamento de pedido em um e-commerce.

---

## 🎯 Objetivo do Projeto
O sistema gerencia o ciclo completo de um pedido: desde o cadastro do cliente, definição do status do pedido, adição de múltiplos produtos (itens) com quantidades específicas, até a geração de um sumário detalhado com o cálculo do valor total.

---

## ✨ Funcionalidades
- [x] **Composição em Multinível:** `Order` contém `Client` e uma lista de `OrderItem`, que por sua vez contém um `Product`.
- [x] **Enumerações Avançadas:** Gerenciamento do ciclo de vida do pedido via `OrderStatus`.
- [x] **Cálculo Automatizado:** Lógica para calcular o subtotal de cada item e o valor total do pedido.
- [x] **Manipulação de Datas:** Uso de `LocalDate` para nascimento do cliente e `LocalDateTime` para o instante do pedido.
- [x] **Saída Formatada:** Implementação de `toString()` eficiente para exibir um resumo profissional do pedido.

---

## 🛠️ Regras de Negócio Implementadas

| Operação | Descrição | Lógica Aplicada |
| :--- | :--- | :--- |
| **Subtotal do Item** | Preço unitário x Quantidade | `price * quantity` |
| **Total do Pedido** | Soma de todos os subtitais | Loop na lista de `OrderItem` |
| **Associação** | Vincula cliente e produtos ao pedido | Composição de objetos no construtor e métodos |
| **Status do Pedido** | Define a etapa atual da compra | `OrderStatus.valueOf(status)` |

---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │    └── App.java          # Orquestração do sistema e entrada de dados
 ├── entities/
 │    ├── Client.java       # Dados do comprador
 │    ├── Product.java      # Definição do produto
 │    ├── OrderItem.java    # Item do pedido (Produto + Qtd + Preço)
 │    └── Order.java        # Entidade principal (Agregador)
 └── enums/
      └── OrderStatus.java  # Estados (PENDING, PROCESSING, SHIPPED, DELIVERED)
```

## 📝 Exemplo de Execução no Terminal

```text
Enter client data:
Name: Filipe
Email: filipe@gmail.com
Birth date (DD/MM/YYYY): 04/10/2002

Enter order data:
Status: PROCESSING
How many items to this order? 2

Enter #1 item data:
Product name: TV
Product price: 1000.00
Quantity: 1

Enter #2 item data:
Product name: Mouse
Product price: 40.00
Quantity: 2

ORDER SUMMARY:
Order moment: 20/03/2026 13:45:22
Order status: PROCESSING
Client: Filipe (03/10/2000) - filipe@gmail.com
Order items:
TV, $1000.00, Quantity: 1, Subtotal: $1000.00
Mouse, $40.00, Quantity: 2, Subtotal: $80.00
Total price: $1080.00
```