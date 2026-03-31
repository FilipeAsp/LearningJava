# 📐 Cálculo de Áreas: Métodos Abstratos e Polimorfismo

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-green)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto consiste em uma aplicação Java para calcular a área de diferentes formas geométricas. O foco principal é a utilização de **Classes e Métodos Abstratos**, permitindo que a superclasse defina um contrato que deve ser obrigatoriamente implementado pelas subclasses.

---

## 🎯 Objetivo do Projeto
Demonstrar a aplicação prática de abstração. A classe `Shape` define o método `area()`, mas como uma "forma" genérica não possui cálculo de área definido, o método é abstrato, forçando as classes `Circle` e `Rectangle` a fornecerem suas próprias implementações matemáticas.

## ✨ Funcionalidades
- [x] **Abstração Pura:** Uso de classe abstrata para evitar instanciação de formas genéricas.
- [x] **Enumerações:** Gerenciamento de cores fixas através do enum `Color`.
- [x] **Polimorfismo:** Processamento de uma lista única de formas (`List<Shape>`) com diferentes comportamentos de cálculo.
- [x] **Formatação:** Saída de dados numéricos limitada a duas casas decimais.

---

## 🛠️ Regras de Negócio Implementadas

| Classe | Tipo | Regra de Cálculo (Área) |
| :--- | :--- | :--- |
| **Rectangle** | Subclasse | `width * height` |
| **Circle** | Subclasse | `π * radius²` |
| **Shape** | Abstrata | Apenas define a assinatura do método e a cor. |

---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │   └── App.java            # Entrada de dados e iteração da lista
 ├── entities/
 │   ├── Shape.java          # Classe abstrata (Base)
 │   ├── Rectangle.java      # Especialização para retângulos
 │   └── Circle.java         # Especialização para círculos
 └── enums/
     └── Color.java          # Enumeração (BLACK, BLUE, RED)
```

## 📝 Exemplo de Interação no Terminal
```text
Enter the number of shapes: 2
Shape #1 data: 
Rectangle or Circle (r/c): r
Color (BLACK/BLUE/RED): BLACK
Width: 4.0
Height: 5.0
Shape #2 data: 
Rectangle or Circle (r/c): c
Color (BLACK/BLUE/RED): RED
Radius: 3.0

SHAPE AREAS: 
20.00
28.27
```