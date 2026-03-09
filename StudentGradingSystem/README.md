# 🎓 Sistema de Avaliação de Alunos (POO)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação de console desenvolvida em **Java** para consolidar conhecimentos em **Programação Orientada a Objetos (POO)**. O foco está na gestão de dados acadêmicos, realizando o cálculo de notas trimestrais e determinando o status de aprovação do aluno.

---

## 🎯 Objetivo do Projeto
O programa lê o nome de um aluno e suas três notas obtidas nos três trimestres do ano. Ao final, ele apresenta a nota final e informa se o aluno foi aprovado ou reprovado (considerando a média mínima de 60%). Caso reprovado, o sistema calcula quantos pontos faltaram.



## ✨ Funcionalidades
- [x] **Cálculo de Nota Final:** Soma ponderada ou simples das notas trimestrais.
- [x] **Verificação de Status:** Lógica booleana para determinar `PASS` (Aprovado) ou `FAILED` (Reprovado).
- [x] **Cálculo de Pendência:** Em caso de reprovação, informa a pontuação necessária para atingir o mínimo.
- [x] **Responsabilidade Única:** Toda a lógica de cálculo e validação está encapsulada na classe `Student`.
- [x] **Configuração Regional:** Uso de `Locale.US` para leitura de decimais via teclado.

---

## 🛠️ Regras de Negócio Implementadas

| Operação | Descrição | Lógica Aplicada |
| :--- | :--- | :--- |
| **Nota Final** | Soma das 3 notas | `grade1 + grade2 + grade3` |
| **Aprovação** | Verifica média mínima | `finalGrade >= 60.0` |
| **Pontos Faltantes** | Cálculo de déficit | `60.0 - finalGrade` (se reprovado) |

---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │   └── App.java          # Entrada de dados e interação (Main)
 └── entities/
     └── Student.java      # Atributos e métodos de cálculo de notas
```

## 📝 Exemplo de Execução no Terminal

```text
Cenário de Aprovação:

Plaintext
Name Student: Filipe
Provide notes: 
27.00
31.00
32.00

FINAL GRADE = 90.00
PASS
Cenário de Reprovação:

Plaintext
Name Student: Alex
Provide notes: 
17.00
20.00
15.00

FINAL GRADE = 52.00
FAILED
MISSING 8.00 POINTS
```
