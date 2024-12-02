# 📟 Calculadora Simples - Projeto Acadêmico

Este repositório contém um projeto simples de uma calculadora, desenvolvido como parte da disciplina **Laboratório de Programação**. O objetivo foi aplicar conceitos básicos de desenvolvimento web utilizando **Spring** no backend e **Bootstrap** no frontend.

---

## 🛠 Tecnologias Utilizadas

- **Backend**: Desenvolvido em **Java**, utilizando o framework **Spring**. A lógica da calculadora foi implementada utilizando o padrão **Controller**, proporcionando organização e separação de responsabilidades no código.
- **Frontend**: Construído com **HTML**, **CSS** e **Bootstrap** para facilitar a criação de um design simples e funcional.
- **Responsividade**: A interface é razoavelmente responsiva, garantindo boa usabilidade em diferentes dispositivos.

---

## 🌟 Funcionalidades

- Operações básicas:
  - Adição
  - Subtração
  - Multiplicação
  - Divisão
- Interface limpa e fácil de usar.
- Resultado exibido diretamente na tela após cada cálculo.

---

## ⚠️ Limitações

Este projeto foi desenvolvido com foco no aprendizado e não inclui as seguintes funcionalidades:

- **Validação de entrada**: Assume que o usuário sempre insere números válidos.
- **Tratamento de erros**:
  - Não impede divisões por zero, o que pode gerar erros na execução.
  - Não lida com entradas inválidas, como texto ou campos vazios.

---

## 📖 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/calculadora-simples.git

2. Compile o projeto:
    ``` bash
    mvn clean install

3. Execute o aplicativo
    ``` bash
    java -jar target/calculator-0.0.1-SNAPSHOT.jar