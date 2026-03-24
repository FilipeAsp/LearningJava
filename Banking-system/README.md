# 🏦 Sistema de Contas: Herança e Polimorfismo

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-green)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação de console desenvolvida em **Java** para praticar os pilares avançados da Programação Orientada a Objetos (POO), focando em **Herança**, **Upcasting**, **Downcasting** e o uso do operador **instanceof**.

---

## 🎯 Objetivo do Projeto
Simular uma hierarquia bancária complexa, onde uma conta comum (`Account`) pode assumir formas mais específicas como Conta Empresarial (`BusinessAccount`) ou Poupança (`SavingsAccount`), demonstrando como o Java gerencia diferentes tipos de objetos em uma mesma coleção.

## ✨ Funcionalidades
- [x] **Extensão de Tipos:** Criação de classes especializadas que herdam atributos da classe base.
- [x] **Flexibilidade de Tipos (Upcasting):** Capacidade de tratar subclasses como se fossem a superclasse.
- [x] **Especialização de Tipos (Downcasting):** Conversão segura para acessar métodos exclusivos de subclasses (como empréstimos ou atualização de saldo).
- [x] **Verificação de Segurança:** Uso de `instanceof` para validar tipos antes de operações de casting.

---

## 🛠️ Regras de Negócio Implementadas

| Classe | Especialidade | Regra Aplicada |
| :--- | :--- | :--- |
| **BusinessAccount** | Empréstimo (Loan) | Possui um limite de empréstimo e taxa associada. |
| **SavingsAccount** | Rendimento | Possui método para atualização de saldo baseado em taxa de juros. |
| **Casting Seguro** | Proteção de Memória | Implementação de condicionais para evitar `ClassCastException`. |

---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │   └── App.java            # Testes de casting e lógica de execução
 └── entities/
     ├── Account.java        # Superclasse base
     ├── BusinessAccount.java # Subclasse com lógica de empréstimo
     └── SavingsAccount.java  # Subclasse com lógica de juros
```

## 📝 Exemplo de Lógica no Código
```text
Java
// Exemplo de Downcasting Seguro
if (acc3 instanceof BusinessAccount) {
    BusinessAccount acc5 = (BusinessAccount) acc3;
    acc5.loan(200.0);
    System.out.println("Loan approved!");
}

if (acc3 instanceof SavingsAccount) {
    SavingsAccount acc5 = (SavingsAccount) acc3;
    acc5.updateBalance();
    System.out.println("Balance Updated!");
}
```