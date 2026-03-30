# 👷 Sistema de Pagamentos: Herança e Polimorfismo

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-green)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação de console desenvolvida em **Java** para consolidar o entendimento sobre **Polimorfismo** e **Herança**, demonstrando como tratar diferentes subtipos de funcionários em uma mesma coleção de forma dinâmica.

---

## 🎯 Objetivo do Projeto
O objetivo é processar uma lista de funcionários, onde cada objeto pode ser um funcionário padrão (`Employee`) ou um terceirizado (`OutsourcedEmployee`). O sistema utiliza o polimorfismo para chamar o método de cálculo de pagamento correto para cada tipo, sem a necessidade de condicionais complexas no loop principal.

## ✨ Funcionalidades
- [x] **Gestão Dinâmica:** Armazenamento de diferentes tipos de funcionários em uma única `List<Employee>`.
- [x] **Polimorfismo de Método:** Sobrescrita do método `payment()` para aplicar regras de cálculo distintas.
- [x] **Tratamento de Dados:** Entrada de dados via console com formatação regional (`Locale.US`).
- [x] **Cálculo de Bônus:** Lógica específica para funcionários terceirizados com despesas adicionais.

---

## 🛠️ Regras de Negócio Implementadas

| Classe | Especialidade | Regra de Pagamento |
| :--- | :--- | :--- |
| **Employee** | Funcionário | `horas * valor por hora` |
| **OutsourcedEmployee** | Terceirizado | `(horas * valor por hora) + (adicional * 1.1)` |
| **Polimorfismo** | Execução | O método `payment()` é resolvido em tempo de execução conforme o objeto real. |

---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │   └── App.java            # Lógica de entrada, loop e exibição de resultados
 └── entities/
     ├── Employee.java       # Superclasse (Base)
     └── OutsourcedEmployee.java # Subclasse (Especializada)
```

## 📝 Exemplo de Interação no Terminal
```text
Enter the number of employees: 3
Employee #1 data:
Outsourced (y/n)? n
Name: Alex
Hours: 50
Value per hour: 20
Employee #2 data:
Outsourced (y/n)? y
Name: Bob
Hours: 100
Value per hour: 15
Additional charge: 200
Employee #3 data:
Outsourced (y/n)? n
Name: Maria
Hours: 60
Value per hour: 20

PAYMENTS:
Alex - $ 1000.00
Bob - $ 1720.00
Maria - $ 1200.00
```