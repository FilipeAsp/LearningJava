# 📝 Social Post System (Composition & StringBuilder)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação de console desenvolvida em **Java** para aprofundar os conceitos de **Composição de Objetos**, demonstrando como um objeto principal (`Post`) pode conter uma lista de objetos secundários (`Comment`).

---

## 🎯 Objetivo do Projeto
Simular o funcionamento básico de postagens em uma rede social. O sistema foca na relação entre o post, seu conteúdo, data, curtidas e a lista dinâmica de comentários associados, utilizando boas práticas de manipulação de Strings para performance.

---

## ✨ Funcionalidades
- [x] **Composição Dinâmica:** Um post que "tem" vários comentários armazenados em uma `List`.
- [x] **Uso do StringBuilder:** Otimização na montagem de grandes blocos de texto no método `toString()`.
- [x] **Manipulação de Data/Hora:** Uso de `LocalDateTime` e `DateTimeFormatter` para registrar o momento exato da postagem.
- [x] **Encapsulamento:** Proteção dos dados e métodos para adicionar comentários de forma controlada.

---

## 🛠️ Regras de Negócio Implementadas

| Operação | Descrição | Lógica Aplicada |
| :--- | :--- | :--- |
| **Adicionar Comentário** | Vincula um novo texto ao post | `comments.add(comment)` |
| **Formatação de Texto** | Montagem eficiente da saída | `StringBuilder sb = new StringBuilder()` |
| **Data e Hora** | Registro de postagem com precisão | `LocalDateTime.parse(data, fmt)` |
| **Exibição Hierárquica** | Mostra o post seguido de seus comentários | Loop `for` dentro do `toString` |

---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │    └── App.java          # Instanciação dos posts e comentários
 └── entities/
      ├── Post.java         # Entidade principal (Título, Conteúdo, Likes)
      └── Comment.java      # Entidade de apoio (Texto do comentário)
```

## 📝 Exemplo de Saída no Terminal

```Text
Traveling to New Zealand
12 Likes - 21/06/2018 13:05:44
I'm going to visit this wonderful country!
Comments:
Have a nice trip
Wow that's awesome!

Good night guys
5 Likes - 28/07/2018 23:14:19
See you tomorrow
Comments:
Good night
May the Force be with you
```