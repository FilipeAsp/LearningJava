# 👔 Worker Contracts System (Composição)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação de console desenvolvida em **Java** para exercitar o conceito de **Composição de Objetos** e **Enumerações**. O sistema gerencia os contratos de um trabalhador e calcula seu rendimento total com base em um mês e ano específicos.

---

## 🎯 Objetivo do Projeto
Demonstrar a relação "Tem-um" entre classes. Um `Worker` (Trabalhador) pertence a um `Department` (Departamento) e possui vários `HourContract` (Contratos por Hora). O desafio principal é percorrer a lista de contratos e filtrar os valores correspondentes ao período solicitado pelo usuário.

---

## ✨ Funcionalidades
- [x] **Composição de Objetos:** Integração entre as classes `Worker`, `Department` e `HourContract`.
- [x] **Manipulação de Listas:** Uso de `ArrayList` para gerenciar múltiplos contratos dinamicamente.
- [x] **Tratamento de Datas Moderno:** Utilização de `LocalDate` e `DateTimeFormatter` (Java 8+).
- [x] **Cálculo de Rendimento:** Lógica para somar o salário base com o valor total dos contratos de um mês específico.
- [x] **Enumerações:** Definição de níveis de senioridade via `WorkerLevel`.

---

## 🛠️ Regras de Negócio Implementadas

| Operação | Descrição | Lógica Aplicada |
| :--- | :--- | :--- |
| **Adicionar Contrato** | Vincula um novo contrato ao trabalhador | `contracts.add(contract)` |
| **Remover Contrato** | Remove um contrato da lista | `contracts.remove(contract)` |
| **Cálculo de Income** | Soma salário + contratos (Mês/Ano) | `if (year == c.getYear() && month == c.getMonth())` |
| **Formatação de Entrada** | Parse de datas no padrão brasileiro | `DateTimeFormatter.ofPattern("dd/MM/yyyy")` |

---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │    └── App.java          # Entrada de dados e lógica principal
 ├── entities/
 │    ├── Department.java   # Representação do departamento
 │    ├── HourContract.java # Dados do contrato (Data, Valor/Hora, Duração)
 │    └── Worker.java       # Entidade principal com a lógica de rendimento
 └── enums/
      └── WorkerLevel.java  # Níveis do trabalhador (JUNIOR, MID, SENIOR)
```

## 📝 Exemplo de Execução no Terminal

```text
Enter department's name: Design
Enter worker data: 
Name: Filipe
Level: MID_LEVEL
Base salary: 3000.00
How many contracts to this worker? 2

Enter contract #1 data:
Date (DD/MM/YYYY): 20/08/2025
Value per hour: 50.0
Duration (hours): 20

Enter contract #2 data:
Date (DD/MM/YYYY): 30/08/2025
Value per hour: 80.0
Duration (hours): 10

Enter month and year to calculate income (MM/YYYY): 08/2025
Name: Filipe
Department: Design
Income for 08/2025: 4800.00
```