# 📦 Order System (Enumerações)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação de console desenvolvida em **Java** para exemplificar o uso de **Enumerações (Enums)** e a composição de objetos, focando na organização de estados de um pedido e manipulação de tipos enumerados.

---

## 🎯 Objetivo do Projeto
O sistema demonstra como representar o ciclo de vida de um pedido através de constantes tipadas. Ele permite instanciar objetos `Order` com IDs únicos, data de criação e um status específico, além de mostrar a conversão de `Strings` para tipos `Enum` e vice-versa.

---

## ✨ Funcionalidades
- [x] **Tipagem Forte com Enum:** Uso de `OrderStatus` para evitar erros de estados inválidos.
- [x] **Conversão Dinâmica:** Demonstração do método `valueOf` para converter textos em constantes do Enum.
- [x] **Modelagem de Entidades:** Classe `Order` com encapsulamento e construtores sobrecarregados.
- [x] **Tratamento de Datas:** Uso da classe `Date` para registrar o momento da criação do pedido.
- [x] **Sobrescrita de Métodos:** Implementação de `toString()` para exibição formatada dos dados do objeto.

---

## 🛠️ Regras de Negócio Implementadas

| Operação | Descrição | Lógica Aplicada |
| :--- | :--- | :--- |
| **Instanciação** | Criação de pedido com status inicial | `new Order(id, date, status)` |
| **Conversão de String** | Transforma texto em constante Enum | `OrderStatus.valueOf("DELIVERED")` |
| **Status do Pedido** | Estados possíveis do ciclo de venda | `PENDING_PAYMENT, PROCESSING...` |
| **Exibição de Dados** | Formatação dos dados da entidade | `@Override public String toString()` |

---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │    └── App.java          # Classe principal (Entry Point)
 ├── entities/
 │    └── Order.java        # Representação do objeto Pedido
 └── enums/
      └── OrderStatus.java  # Definição dos estados (Enums)
```     

## 📝 Exemplo de Execução no Terminal

```text
Order [id=1080, moment=Thu Mar 12 01:55:18 BRT 2026, status=PENDING_PAYMENT]
DELIVERED
DELIVERED
```