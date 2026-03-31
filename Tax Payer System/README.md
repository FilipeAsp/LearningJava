# 🏦 Tax Payer System: Abstract Classes and Methods

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-green)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação Java desenvolvida para calcular o imposto de renda de diferentes tipos de contribuintes (**Pessoa Física** e **Pessoa Jurídica**), utilizando os pilares da Programação Orientada a Objetos como herança, polimorfismo e, principalmente, classes abstratas.

---

## 🎯 Objetivo do Projeto
O sistema visa processar uma lista de contribuintes e calcular o imposto devido com base em regras específicas para cada categoria. A classe base `TaxPayer` é abstrata, garantindo que cada tipo de contribuinte implemente sua própria lógica de cálculo no método `tax()`.

## ✨ Funcionalidades
- [x] **Cálculo Especializado:** Diferenciação entre gastos com saúde (PF) e número de funcionários (PJ).
- [x] **Polimorfismo:** Armazenamento de diferentes tipos de entidades em uma lista única `List<TaxPayer>`.
- [x] **Métodos Abstratos:** Implementação obrigatória da regra de imposto nas subclasses.
- [x] **Interface via Console:** Leitura dinâmica de dados e exibição formatada.

---

## 🛠️ Regras de Negócio Implementadas

| Classe | Tipo | Regra de Cálculo (Imposto) |
| :--- | :--- | :--- |
| **Individual** | Pessoa Física | `(Renda * Alíquota) - (Gastos Saúde * 50%)` |
| **Company** | Pessoa Jurídica | `Renda * 14%` (se > 10 func.) ou `16%` (se <= 10 func.) |
| **TaxPayer** | Abstrata | Define os atributos comuns (name, anualIncome) e o contrato `tax()`. |

---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │   └── App.java            # Leitura da lista, loop e exibição de resultados
 └── entities/
     ├── TaxPayer.java       # Superclasse Abstrata
     ├── Individual.java     # Subclasse (Pessoa Física)
     └── Company.java        # Subclasse (Pessoa Jurídica)
```

## 📝 Exemplo de Interação no Terminal

```text
Enter the number of tax payer: 2
Tax payer #1 data:
Individual or Company (i/c): i
Name: Alex
Anual Income: 50000.00
Health expenditures: 2000.00

Tax payer #2 data:
Individual or Company (i/c): c
Name: SoftTech
Anual Income: 400000.00
Number of employees: 25

TAXES PAID:
Alex: $ 11500.00
SoftTech: $ 56000.00
```