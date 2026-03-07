# 💳 Sistema de Gestão de Funcionários (Listas e Lambdas)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)
![Educational](https://img.shields.io/badge/CEFET--RJ-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação de console em **Java** desenvolvida para gerenciar folhas de pagamento simplificadas. Diferente do modelo anterior com vetores, este utiliza **Listas Dinâmicas** e recursos modernos do Java para manipulação de coleções.

---

## 🎯 Objetivo do Projeto
O programa permite o registro de funcionários com IDs únicos, garantindo a integridade dos dados, e oferece uma funcionalidade de **reajuste salarial percentual** baseado na busca por identificador.

### 🧠 Conceitos de Programação Aplicados
* **Collections (`List` e `ArrayList`):** Armazenamento dinâmico que dispensa o tamanho fixo no início da execução.
* **Expressões Lambda:** Uso de predicados para filtragem eficiente de dados.
* **Java Streams:** Utilização de `.stream().filter().findFirst().orElse(null)` para buscas rápidas dentro da lista.
* **Validação de ID:** Lógica para impedir o cadastro de IDs duplicados através de um método auxiliar.

---

## ✨ Funcionalidades
- [x] **Cadastro Dinâmico:** Registro de N funcionários com campos de ID, Nome e Salário.
- [x] **Busca por Predicado:** Localização de um funcionário específico através do seu ID usando Stream API.
- [x] **Atualização de Salário:** Incremento baseado em porcentagem (regra de negócio na classe `Employee`).
- [x] **Prevenção de Erros:** Verificação de existência do ID antes de aplicar o aumento, evitando `NullPointerException`.
- [x] **Listagem Formatada:** Exibição final de todos os registros atualizados após o processamento.

---

## 🛠️ Regras de Negócio Implementadas

| Operação | Descrição | Lógica / Método |
| :--- | :--- | :--- |
| **Unique ID Check** | Impede IDs repetidos no cadastro | `list.stream().filter(...)` |
| **Increase Salary** | Cálculo de reajuste | `salary += salary * (percentage / 100)` |
| **Search** | Busca objeto na lista | `findFirst().orElse(null)` |

---

## 📂 Estrutura de Pastas
```text
src/
 ├── application/
 │   └── App.java          # Entrada de dados e orquestração do sistema
 └── entities/
     └── Employee.java     # Entidade com atributos e método de aumento
```

## 📝 Exemplo de Execução no Terminal
```text
How many employees will be registered? 2

Employee #1:
Id: 101
Name: Filipe
Salary: 4000.00

Employee #2:
Id: 102
Name: Lanna
Salary: 5000.00

Enter the employee id to update salary: 101
Enter the percentage: 10.0

list of employees:
101, Filipe, 4400.00
102, Maria, 5000.00
```