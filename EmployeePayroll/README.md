# 📊 Sistema de Folha de Pagamento (POO)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação de console desenvolvida em **Java** para exercitar os conceitos de **Programação Orientada a Objetos (POO)**, focando na criação de classes, manipulação de atributos e métodos de instância para processamento de dados financeiros.

---

## 🎯 Objetivo do Projeto
O sistema permite ler os dados de um funcionário (nome, salário bruto e imposto), calcular o salário líquido e aplicar um aumento percentual baseado apenas no salário bruto inicial, demonstrando como objetos mantêm estado e comportamento.



## ✨ Funcionalidades
- [x] **Cálculo de Salário Líquido:** Deduz o imposto do salário bruto automaticamente via método.
- [x] **Aumento Salarial:** Aplica uma porcentagem de incremento sobre o valor bruto.
- [x] **Sobrescrita de ToString:** Formatação personalizada para exibição dos dados do funcionário.
- [x] **Encapsulamento de Lógica:** A lógica de cálculo reside na entidade, não na classe principal.
- [x] **Configuração Regional:** Uso de `Locale.US` para garantir o ponto flutuante no padrão americano.

---

## 🛠️ Regras de Negócio Implementadas

| Operação | Descrição | Lógica Aplicada |
| :--- | :--- | :--- |
| **Salário Líquido** | Bruto menos Imposto | `grossSalary - tax` |
| **Aumento de Salário** | Incremento percentual | `grossSalary += (grossSalary * percentage / 100.0)` |
| **Exibição** | Formatação de Saída | Uso de `String.format("%.2f")` no método `toString` |

---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │   └── App.java          # Ponto de entrada (Main) e interação com usuário
 └── entities/
     └── Employee.java     # Classe representando a entidade Funcionário
```

## 📝 Exemplo de Execução no Terminal
```text
Name: Joao Silva
Gross Salary: 6000.00
Tax: 1000.00

Employee: Joao Silva, $ 5000.00

Which percent to increase salary: 10.0

Updated data: Joao Silva, $ 5600.00
```