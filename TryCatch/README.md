# ⚠️ Exception Handling: Try-Catch and Stack Trace

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-green)
![Educational](https://img.shields.io/badge/Estudos-Sistemas%20de%20Informa%C3%A7%C3%A3o-blue)

Este projeto demonstra como o Java gerencia exceções utilizando o bloco `try-catch`. O foco é entender como capturar erros específicos e como o programa se comporta ao percorrer a pilha de chamadas de métodos (*Call Stack*).

---

## 🎯 Objetivo do Projeto
Praticar a resiliência de software, garantindo que o programa não "quebre" (crash) quando o usuário insere dados inválidos, como uma posição de array inexistente ou um tipo de dado incorreto.

## ✨ Funcionalidades
- [x] **Captura Seletiva:** Tratamento de `ArrayIndexOutOfBoundsException` e `InputMismatchException`.
- [x] **Rastreamento de Pilha:** Uso do `e.printStackTrace()` para depuração técnica sem interromper o fluxo do usuário.
- [x] **Fluxo de Métodos:** Demonstração de chamadas encadeadas (`main` -> `method1` -> `method2`).

---

## 🛠️ Exceções Tratadas

| Exceção | Causa | Mensagem de Retorno |
| :--- | :--- | :--- |
| **ArrayIndexOutOfBoundsException** | Acessar uma posição do vetor que não existe. | `Invalid position!` |
| **InputMismatchException** | Digitar um caractere quando o sistema espera um número (`int`). | `Input error!` |

---

## 📂 Estrutura do Código

O programa utiliza três níveis de execução para demonstrar a propagação de exceções:

1.  **main**: Ponto de entrada que inicia a cadeia.
2.  **method1**: Método intermediário de passagem.
3.  **method2**: Onde a lógica de leitura e o bloco `try-catch` residem.

```text
src/
 └── application/
     └── App.java            # Lógica de tratamento e execução
```

##  📝 Exemplo de Uso (Cenário de Erro)

```text
*** METHOD2 START ***
Filipe Lanna Alice
5
Invalid position!
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at application.App.method2(App.java:24)
        at application.App.main(App.java:8)
*** METHOD2 END ***
End Program
```