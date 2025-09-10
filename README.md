# Calculadora-java

# 📘 Projeto Calc

Este é um projeto simples em Java que permite ao usuário somar dois números inteiros através do terminal. Caso o usuário queira somar novamente ele terá que digitar a letra "s" .

---

## ⚙️ Funcionalidades

- Recebe dois números do usuário.
- Realiza a soma e exibe o resultado.
- Pergunta se o usuário deseja somar novamente.
- Valida se o usuário digitou a letra correta para continuar somando (`s` ou `S`).
- Finaliza o programa com uma mensagem, caso o usuário deseje sair.

---

## 🖥️ Tecnologias utilizadas

- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (ou qualquer outro IDE Java)
- Terminal para entrada e saída de dados

---

## 📁 Estrutura básica

```text
Calc/
├── src/
│   └── Calc.java
├── Numero.java
└── README.md


▶️ Como executar


1. Clone o repositório:

git clone https://github.com/seu-usuario/Calc.git
cd Calc

2.Compile os arquivos Java:

javac Calc.java Numero.java

3.Execute o programa:

java Calc

4.Siga as instruções no terminal. Digite s para continuar somando ou qualquer outra letra para encerrar o programa.



✏️ Exemplo de uso


Digite o valor 1: 10

Digite o valor 2: 25

A soma de 10 com 25 é igual a 35

Se deseja somar outro valor, digite: s


👨‍💻 Classe Numero


A classe Numero deve conter os métodos setValor(int valor) e getValor() para armazenar e recuperar os valores digitados. Exemplo:

public class Numero {
    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}




📄 Licença

Este projeto é de uso livre para fins educacionais.



🙋‍♂️ Autor

Rosa Mendes




