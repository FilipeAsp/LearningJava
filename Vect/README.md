# 📊 Sistema de Média de Preços (Vetores)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação de console desenvolvida em **Java** para exercitar a manipulação de **Vetores de Objetos** e o uso de memória (Heap vs Stack), focando na leitura de múltiplos dados e processamento de médias aritméticas.

---

## 🎯 Objetivo do Projeto
O sistema permite que o usuário defina uma quantidade `N` de produtos, armazene cada um (com nome e preço) dentro de um array do tipo referência e, ao final, calcule e exiba a média de preço desses produtos.

## ✨ Funcionalidades
- [x] **Alocação Dinâmica:** O tamanho do vetor é definido pelo usuário em tempo de execução.
- [x] **Vetor de Objetos:** Demonstração de como instanciar classes dentro de posições de um array.
- [x] **Percorrimento de Array:** Uso de laços `for` para entrada de dados e para processamento de soma.
- [x] **Cálculo Estatístico:** Soma total dos preços dividida pela quantidade de elementos.
- [x] **Configuração Regional:** Uso de `Locale.US` para garantir o ponto flutuante no padrão americano.

---

## 🛠️ Regras de Negócio Implementadas

| Operação | Descrição | Lógica Aplicada |
| :--- | :--- | :--- |
| **Entrada de Dados** | Lê N elementos | Loop `for` até `vect.length` |
| **Armazenamento** | Criação do Objeto | `vect[i] = new Product(name, price)` |
| **Somatória** | Acumula os preços | Acesso ao método `getPrice()` de cada posição |
| **Média** | Resultado final | Soma total / número de elementos |

---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │   └── Program.java      # Classe principal com manipulação de vetores
 └── entities/
     └── Product.java      # Classe da entidade com atributos e métodos
```
## 📝 Exemplo de Execução no Terminal
```Text
Enter the number of elements: 3
TV
900.00
Cooker
400.00
Computer
800.00

AVERAGE PRICE = 700.00
```
