# 📦 Sistema de Gerenciamento de Estoque

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-green)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação de console desenvolvida em **Java** para praticar conceitos fundamentais de Programação Orientada a Objetos (POO), com foco especial em **Encapsulamento**, **Construtores** e a manipulação dinâmica de atributos.

---

## 🎯 Objetivo do Projeto
O sistema simula o controle de um inventário, permitindo a entrada inicial de dados de um produto, a alteração segura de informações (como nome e preço) através de métodos de acesso, e a gestão de entradas e saídas de unidades do estoque.

## ✨ Funcionalidades
- [x] **Cadastro de Produto:** Registro de nome e preço inicial.
- [x] **Encapsulamento:** Demonstração do uso de `getters` e `setters` para alterar dados após a criação do objeto.
- [x] **Gestão de Estoque:** Funções para adicionar e remover quantidades específicas.
- [x] **Atualização em Tempo Real:** Exibição dos dados atualizados e do valor total em estoque após cada operação.
- [x] **Internacionalização:** Uso da classe `Locale` para garantir compatibilidade com o padrão decimal (US).

---

## 🛠️ Regras de Negócio Implementadas

| Operação | Descrição | Lógica Aplicada |
| :--- | :--- | :--- |
| **Atualização** | Altera nome ou preço | Uso de `setName` e `setPrice` |
| **Entrada** | Adiciona unidades ao estoque | Soma o valor informado à quantidade atual |
| **Saída** | Remove unidades do estoque | Subtrai o valor informado da quantidade atual |
| **Cálculo Total** | Valor total em estoque | Preço unitário $\times$ Quantidade disponível |

---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │    └── Program.java      # Classe principal com o fluxo de execução
 └── entities/
      └── Product.java      # Classe da entidade com a lógica de negócio
```
---
## 📝 Exemplo de Execução no Terminal
```text
Enter product data: 
Name: Computer
Price: 1100.00
Updated name: Computer
Updated price: 1200.0

Product data: Computer, $1200.00, 0 units, Total:$ 0.00

Enter the number of products to be added in stock: 10
Updated data: Computer, $1200.00, 10 units, Total:$ 12000.00

Enter the number of products to be removed from stock: 2
Updated data: Computer, $1200.00, 8 units, Total:$ 9600.00
```