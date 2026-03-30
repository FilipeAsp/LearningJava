# 🏷️ Sistema de Catálogo: Herança e Polimorfismo

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-green)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto é uma aplicação de console desenvolvida em **Java** para consolidar o entendimento sobre **Polimorfismo** e **Herança**, demonstrando como gerenciar diferentes categorias de produtos e suas respectivas regras de etiquetas de preço.

---

## 🎯 Objetivo do Projeto
O objetivo é processar uma lista de produtos, onde cada item pode ser um produto comum (`Product`), usado (`UsedProduct`) ou importado (`ImportedProduct`). O sistema utiliza o polimorfismo para invocar o método `priceTag()` correspondente a cada tipo, garantindo que as informações específicas (taxas ou datas) sejam exibidas corretamente.

## ✨ Funcionalidades
- [x] **Gestão Dinâmica:** Armazenamento de diferentes tipos de produtos em uma única `List<Product>`.
- [x] **Polimorfismo de Método:** Sobrescrita do método `priceTag()` para exibir etiquetas personalizadas.
- [x] **Tratamento de Datas:** Manipulação de datas de fabricação para produtos usados.
- [x] **Cálculo de Taxas:** Inclusão de taxas alfandegárias no preço final de produtos importados.

---

## 🛠️ Regras de Negócio Implementadas

| Classe | Especialidade | Regra da Etiqueta (`priceTag`) |
| :--- | :--- | :--- |
| **Product** | Comum | Exibe: `Nome - $ Preço` |
| **ImportedProduct** | Importado | Exibe: `Nome - $ Preço Total (Customs fee: $ Valor)` |
| **UsedProduct** | Usado | Exibe: `Nome (used) - $ Preço (Manufacture date: DD/MM/YYYY)` |

---

## 📂 Estrutura de Pastas

```text
src/
 ├── application/
 │   └── App.java            # Lógica de entrada, loop e exibição das etiquetas
 └── entities/
     ├── Product.java        # Superclasse (Base)
     ├── ImportedProduct.java # Subclasse (Taxa Alfandegária)
     └── UsedProduct.java     # Subclasse (Data de Fabricação)
```

## 📝 Exemplo de Interação no Terminal
```text
Enter the number of products: 3
Product #1 data: 
Common, used or imported (c/u/i)? i
Name: Tablet
Price: 260.00
Customs fee: 20.00
Product #2 data: 
Common, used or imported (c/u/i)? c
Name: Notebook
Price: 1100.00
Product #3 data: 
Common, used or imported (c/u/i)? u
Name: iPhone
Price: 400.00
Manufacture date (DD/MM/YYYY): 15/03/2022

PRICE TAGS:
Tablet $280.00 (Customs fee:$ 20.00)
Notebook $ 1100.00
iPhone (used) $ 400.00 (Manufacture date: 15/03/2022)
```