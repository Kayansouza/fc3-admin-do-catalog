# 🎬 FC3 Admin Catalog

> Sistema de gerenciamento de catálogo desenvolvido em **Java**, com foco em boas práticas de desenvolvimento, organização de domínio, testes automatizados e separação de responsabilidades.

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge\&logo=openjdk\&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-Build-02303A?style=for-the-badge\&logo=gradle\&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-Testing-25A162?style=for-the-badge\&logo=junit5\&logoColor=white)
![GitHub Actions](https://img.shields.io/badge/CI-GitHub%20Actions-2088FF?style=for-the-badge\&logo=githubactions\&logoColor=white)

---

## 📌 Sobre o projeto

O **FC3 Admin Catalog** é um projeto desenvolvido durante minha formação em **Full Cycle**, com o objetivo de aplicar na prática conceitos fundamentais do desenvolvimento Back-End com Java.

O projeto está sendo construído com uma abordagem orientada ao domínio, buscando manter as responsabilidades bem definidas entre as diferentes camadas da aplicação.

Além da implementação das regras de negócio, o projeto também possui uma suíte de **testes automatizados**, permitindo validar o comportamento das principais regras do domínio e aumentar a confiabilidade do código.

> 🚧 **Status:** Em desenvolvimento

---

## 🎯 Objetivos

Este projeto tem como principais objetivos:

* Aplicar conceitos de **Programação Orientada a Objetos**
* Desenvolver um domínio organizado e independente de detalhes externos
* Trabalhar com **boas práticas de arquitetura**
* Criar código com responsabilidades bem definidas
* Desenvolver e manter **testes unitários**
* Praticar desenvolvimento orientado a regras de negócio
* Utilizar **Gradle** para gerenciamento e automação do projeto
* Utilizar **GitHub Actions** para integração contínua

---

## 🧠 Conceitos aplicados

Durante o desenvolvimento, alguns dos principais conceitos estudados e aplicados foram:

### Domain-Driven Design

Organização do código priorizando o domínio e suas regras de negócio, mantendo os conceitos importantes do sistema dentro da camada de domínio.

### Separação de responsabilidades

O projeto é dividido em módulos com responsabilidades específicas, evitando que regras de negócio fiquem diretamente acopladas a detalhes de infraestrutura.

### Orientação a objetos

Utilização de conceitos como:

* Encapsulamento
* Abstração
* Herança
* Polimorfismo
* Composição
* Objetos de domínio

### Validação de domínio

As regras de negócio são centralizadas no domínio, permitindo que entidades e objetos responsáveis pela validação mantenham o estado da aplicação consistente.

### Testes unitários

O projeto possui testes automatizados para validar comportamentos e regras de negócio, utilizando **JUnit**.

---

## 🏗️ Arquitetura

A aplicação está organizada em módulos, buscando separar responsabilidades e reduzir o acoplamento entre as diferentes partes do sistema.

```text
fc3-admin-do-catalog
│
├── domain
│   ├── src/main
│   │   └── java
│   │       └── com.fullcycle.admin.catalogo.domain
│   │
│   └── src/test
│
├── application
│   ├── src/main
│   │   └── java
│   │       └── com.fullcycle.admin.catalogo.application
│   │
│   └── src/test
│
├── infrastructure
│   ├── src/main
│   │   └── java
│   │       └── com.fullcycle.admin.catalogo.infrasctructure
│   │
│   └── src/test
│
├── .github
│   └── workflows
│       └── gradle.yml
│
├── build.gradle
├── settings.gradle
└── gradlew
```

### Domain

Responsável pelas principais regras e conceitos do negócio.

```text
domain
 ├── entities
 ├── validators
 ├── gateways
 ├── exceptions
 └── value objects
```

### Application

Camada responsável pelos casos de uso e pela orquestração das operações do sistema.

```text
application
 ├── usecases
 └── ...
```

### Infrastructure

Camada destinada às implementações relacionadas a recursos externos e detalhes de infraestrutura.

```text
infrastructure
 ├── persistence
 ├── repositories
 └── ...
```

---

## 🧪 Testes

Os testes são uma parte importante do projeto.

A suíte utiliza **JUnit** para validar principalmente as regras do domínio e os comportamentos esperados das classes.

Exemplo de organização:

```text
src
├── main
│   └── java
│
└── test
    └── java
```

### O que estou praticando com os testes

* Testes de comportamento
* Cenários de sucesso
* Cenários de erro
* Validação de regras de negócio
* Exceções esperadas
* Isolamento de responsabilidades
* Manutenção de uma suíte de testes confiável

---

## ⚙️ Tecnologias

| Tecnologia        | Utilização                         |
| ----------------- | ---------------------------------- |
| ☕ Java            | Linguagem principal                |
| 🐘 Gradle         | Build e gerenciamento do projeto   |
| 🧪 JUnit          | Testes automatizados               |
| 🔄 Git            | Controle de versão                 |
| ⚙️ GitHub Actions | Integração contínua                |
| 🏗️ DDD           | Modelagem e organização do domínio |

---

## 🚀 Como executar

### Pré-requisitos

Antes de começar, certifique-se de possuir:

* Java 17 ou superior
* Git

### Clone o projeto

```bash
git clone https://github.com/Kayansouza/fc3-admin-do-catalog.git
```

Entre no diretório:

```bash
cd fc3-admin-do-catalog
```

### Execute os testes

Linux/macOS:

```bash
./gradlew test
```

Windows:

```bash
gradlew.bat test
```

### Execute o build

Linux/macOS:

```bash
./gradlew build
```

Windows:

```bash
gradlew.bat build
```

---

## 🔄 Integração Contínua

O projeto possui um workflow de **GitHub Actions** responsável por executar o processo de build automaticamente.

O pipeline é executado em eventos de:

* Push na branch `main`
* Pull Request para `main`

Durante o processo, o projeto é configurado com **JDK 17** e executado utilizando o **Gradle Wrapper**.

```text
Push / Pull Request
        ↓
GitHub Actions
        ↓
Setup JDK 17
        ↓
Gradle
        ↓
Build + Tests
        ↓
Resultado
```

---

## 📚 O que estou aprendendo com este projeto

Mais do que simplesmente implementar funcionalidades, este projeto está sendo utilizado para aprofundar conhecimentos em:

* Java
* Orientação a objetos
* Arquitetura de software
* Domain-Driven Design
* Clean Code
* SOLID
* Testes unitários
* JUnit
* Gradle
* Git
* GitHub Actions
* Separação de responsabilidades
* Modelagem de domínio

---

## 🛣️ Próximos passos

O projeto continuará evoluindo conforme novos conceitos forem estudados.

### Backend

* [ ] Evoluir os casos de uso
* [ ] Expandir as regras de negócio
* [ ] Melhorar cobertura de testes
* [ ] Adicionar testes de integração
* [ ] Implementar camada HTTP/API
* [ ] Integrar persistência de dados

### Qualidade

* [ ] Melhorar documentação
* [ ] Revisar arquitetura
* [ ] Adicionar análise de qualidade de código
* [ ] Evoluir pipeline de CI

### Infraestrutura

* [ ] Containerização com Docker
* [ ] Configuração de ambiente para desenvolvimento
* [ ] Automatização do processo de execução

---

## 👨‍💻 Sobre mim

Sou estudante de **Ciência da Computação** e desenvolvedor Back-End em formação, com foco em **Java e Spring Boot**.

Tenho utilizado projetos práticos para transformar o conhecimento adquirido em experiência de desenvolvimento, atualmente aprofundando meus estudos em:

**Java • Spring Boot • REST APIs • Testes • Docker • Arquitetura de Software**

Este repositório faz parte dessa jornada e continuará evoluindo conforme novos conhecimentos forem aplicados.

---

## ⭐ Feedback

Este projeto está em desenvolvimento e faz parte do meu processo de aprendizado.

Sugestões, melhorias e feedbacks são sempre bem-vindos.

**Obrigado por visitar o projeto! 🚀**
