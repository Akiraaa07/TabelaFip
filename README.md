# Consulta de Preços de Veículos - Projeto Tabela FIPE

Esse projeto foi um desafio proposto no final do curso da Alura para praticar tudo que aprendemos sobre **consumo de APIs com Java e Spring Boot**. A ideia era criar uma aplicação que permite consultar o valor de veículos (carros, motos e caminhões) usando os dados da **Tabela FIPE**, tudo direto no terminal.

---

## O que a aplicação faz?

Ao rodar o programa, o usuário pode:

1. Escolher o tipo de veículo (carro, moto ou caminhão)
2. Ver as marcas disponíveis para aquele tipo
3. Selecionar uma marca e visualizar os modelos
4. Escolher um modelo e, por fim, ver os anos disponíveis e os **valores atualizados** na Tabela FIPE

---

## 🛠️ Tecnologias e ferramentas usadas

- Java 17+
- Spring Boot
- Maven
- Jackson (para transformar JSON em objetos Java)
- API pública da Tabela FIPE (mantida por [@deividfortuna](https://github.com/deividfortuna/fipe))
- IntelliJ IDEA (IDE que usei para desenvolver)

---

## 🎯 Objetivos técnicos

- Consumir APIs REST de forma segura e estruturada
- Praticar a desserialização de JSON com Jackson (`@JsonAlias`)
- Criar uma estrutura limpa com modelos, serviços e execução via `CommandLineRunner`
- Trabalhar com listas, filtros e mapeamentos no estilo Java moderno (Stream, Lambdas)o

---
