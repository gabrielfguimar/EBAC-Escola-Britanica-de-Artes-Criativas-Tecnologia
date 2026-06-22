[![Voltar ao Perfil](https://img.shields.io/badge/-🔙_Ver_Perfil_Principal-blue?style=for-the-badge)](https://github.com/gabrielfguimar)

# 🚀 EBAC - Especialista Back-End Java

[![codecov](https://codecov.io/github/gabrielfguimar/EBAC-Escola-Britanica-de-Artes-Criativas-Tecnologia/graph/badge.svg?token=33QPDM7I1H)](https://codecov.io/github/gabrielfguimar/EBAC-Escola-Britanica-de-Artes-Criativas-Tecnologia)
[![Java Backend CI/CD](https://github.com/gabrielfguimar/EBAC-Escola-Britanica-de-Artes-Criativas-Tecnologia/actions/workflows/main.yml/badge.svg)](https://github.com/gabrielfguimar/EBAC-Escola-Britanica-de-Artes-Criativas-Tecnologia/actions/workflows/main.yml)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/spring-%236DB33F.svg?style=flat&logo=spring&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=flat&logo=docker&logoColor=white)

Este repositório contém os códigos, exercícios e projetos práticos desenvolvidos durante a formação de **Especialista Back-End Java** da EBAC (Escola Britânica de Artes Criativas & Tecnologia), além de implementações de cultura DevOps.

## 🎯 Objetivo
O foco principal destas implementações é o desenvolvimento robusto de aplicações back-end, cobrindo desde os fundamentos da linguagem Java e lógica de programação até a arquitetura avançada de microsserviços, persistência de dados e boas práticas de engenharia de software e segurança.

**Base Técnica Consolidada:**
- **Backend:** Java (JDK 17), Spring Boot, APIs RESTful.
- **Dados:** SQL, JPA/ORM, Modelagem de entidades.
- **Arquitetura:** Microsserviços, Design de Sistemas, Clean Code.
- **DevOps:** Conteinerização (Docker), Versionamento (Git) e CI/CD (GitHub Actions).

## ⚙️ Arquitetura e Pipeline CI/CD (Destaque)
Para demonstrar maturidade no ciclo de desenvolvimento, este repositório conta com um pipeline automatizado. Sempre que um novo código é integrado à branch `main`:
1. **Build & Test:** Validação automatizada do código utilizando Maven e JUnit.
2. **Containerização (Multi-stage):** Geração de uma imagem Docker otimizada, isolando o ambiente de build do ambiente de execução.
3. **Deploy:** Envio automático da imagem para o Docker Hub, pronta para provisionamento em ambientes isolados e remotos.

### 🧠 Decisões Arquiteturais e Engenharia de DevOps

A construção da esteira de CI/CD e a conteinerização desta aplicação foram projetadas com foco em **qualidade, segurança e escalabilidade**. Abaixo, detalho os fundamentos técnicos das ferramentas e padrões escolhidos:

#### 1. Docker com Multi-Stage Build

Em vez de utilizar um processo tradicional de criação de imagem, a aplicação foi empacotada utilizando a técnica de *Multi-Stage Build* no `Dockerfile`. Essa decisão traz dois benefícios essenciais para aplicações Java:

* **Tamanho e Performance:** O primeiro estágio (Build) utiliza uma imagem robusta com o Maven e a JDK completa para baixar dependências e compilar o código. O segundo estágio (Run) copia apenas o artefato gerado (`.jar`) para uma imagem JRE extremamente enxuta (como Alpine). O resultado é um contêiner final muito menor, que inicia mais rápido e otimiza custos de armazenamento em nuvem.
* **Segurança Aprimorada:** Ao separar a compilação da execução, a imagem final enviada para o Docker Hub não contém o código-fonte original, nem ferramentas de compilação. Isso reduz drasticamente a superfície de vulnerabilidades.

#### 2. Isolamento por Contêiner e Imutabilidade

A utilização de contêineres Docker elimina definitivamente a clássica falha de consistência conhecida como *"na minha máquina funciona"*.

* O empacotamento une a aplicação Spring Boot, suas dependências e a versão exata do sistema operacional necessário para rodá-la.
* Isso garante **imutabilidade**: o exato mesmo artefato que é validado pela esteira do GitHub Actions é o que será executado em Produção, garantindo um comportamento previsível e facilitando o deploy em ecossistemas modernos (como Kubernetes ou AWS ECS).

#### 3. Continuous Integration e Quality Gates

O pipeline configurado no GitHub Actions atua como um "Portão de Qualidade" (*Quality Gate*) rígido e automatizado:

* **Feedback Rápido e Prevenção de Regressão:** A cada novo *push*, a aplicação é construída e todos os testes são executados em um ambiente isolado. Se uma nova funcionalidade quebrar uma regra de negócio existente, o pipeline falha e bloqueia a integração do erro.
* **Métricas de Confiabilidade (JaCoCo + Codecov):** A análise de cobertura de código assegura que a evolução da arquitetura não sacrifique a sua estabilidade. Manter esses dados visíveis exige disciplina e a aplicação constante de princípios de *Clean Code* e design testável.

## 🛠️ Conteúdo da Formação
O aprendizado foi estruturado para garantir uma transição sólida da lógica estrutural para sistemas distribuídos:
* **Fundamentos:** Configuração de ambiente, Estruturas de Controle, Collections, Orientação a Objetos (Herança, Interfaces).
* **Conceitos Avançados:** Generics, Annotations, Reflections, Lambdas e Streams.
* **Qualidade:** Testes unitários, automação e aplicação rigorosa de Clean Code.
* **Persistência de Dados:** Bancos Relacionais, SQL, JPA e ORM.
* **Microsserviços:** Spring Boot, 12-Factor App, refatoração de monólitos para sistemas distribuídos.

## 🚀 Projetos Práticos (Mãos na Massa)
* **Projeto 1:** Cadastro de cliente.
* **Projeto 2:** Aplicação focada em manipulação de estruturas de dados.
* **Projeto 3:** Integração e manipulação de banco de dados SQL.
* **Projeto 4:** Aplicação com persistência complexa (JPA/ORM).
* **Microsserviços:** Construção e desmembramento de serviços independentes.

## 📁 Estrutura do Repositório

- 📂 `Algoritmos e Estrutura de Dados/`: Implementações de algoritmos de ordenação e busca.
- 📂 `Algoritmos_Avancados_Parte1/`: Programação Dinâmica e Recursão.
- 📂 `Algoritmos_Avancados_Parte2/`: Backtracking e Greedy.
- 📂 `Clean-Code/`: Princípios e aplicação prática de Código Limpo.
- 📂 `Testes_Unitarios_Parte1/`: Testes desenvolvidos utilizando o framework JUnit.
- 📂 `Testes_Unitarios_Parte2/`: Tratamento de exceções e automação de testes em Java.

---
💡 *Este repositório serve como evidência do meu aprimoramento técnico contínuo para atuar no desenvolvimento de soluções backend escaláveis.*

**📝Desenvolvido por Gabriel Flores Guimarães** 🔗 [LinkedIn: https://www.linkedin.com/in/gabrielfloresguimaraes/ | 🧠 EBAC - Escola Britânica de Artes Criativas & Tecnologia

---
### 🔙 Voltar ao perfil principal
Clique [aqui](https://github.com/gabrielfguimar) para ver meu portfólio completo, projetos e jornada técnica.
