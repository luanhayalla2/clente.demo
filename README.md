# Projeto de Gerenciamento de Clientes

Este é um projeto simples de um CRUD (Create, Read, Update, Delete) de clientes, construído com Spring Boot e uma interface web moderna.

## Como Executar a Aplicação

1.  **Pré-requisitos:**
    *   Java 21 ou superior instalado.
    *   Maven instalado e configurado no seu PATH.

2.  **Inicie a Aplicação:**
    Abra um terminal na raiz do projeto e execute o seguinte comando:
    ```bash
    mvn spring-boot:run
    ```

3.  **Acesse a Aplicação:**
    *   **Interface Web:** Abra seu navegador e acesse [http://localhost:8082](http://localhost:8082)
    *   **Console do Banco de Dados:** Para visualizar o banco de dados em memória, acesse [http://localhost:8082/h2-console](http://localhost:8082/h2-console). Use a URL JDBC `jdbc:h2:mem:testdb` para conectar.

## Estrutura do Projeto

```
cliente-demo/
├── .mvn/               # Arquivos do Maven Wrapper
├── src/
│   ├── main/
│   │   ├── java/       # Código-fonte da aplicação
│   │   │   └── com/example/demo/
│   │   │       ├── controller/ (ainda não criado)
│   │   │       ├── model/      (ainda não criado)
│   │   │       ├── repository/ (ainda não criado)
│   │   │       └── DemoApplication.java  # Ponto de entrada do Spring Boot
│   │   └── resources/
│   │       ├── static/
│   │       │   └── index.html          # Interface do usuário
│   │       └── application.properties  # Configurações da aplicação
│   └── test/           # Testes da aplicação
├── target/             # Arquivos gerados pelo build (classes, JARs)
├── HELP.md             # Documento de ajuda gerado pelo Spring
├── mvnw                # Executável do Maven Wrapper (Linux/macOS)
├── mvnw.cmd            # Executável do Maven Wrapper (Windows)
├── pom.xml             # Arquivo de configuração do Maven
├── relatorio.md        # Relatório de melhorias que foram feitas
└── README.md           # Este arquivo
```

## Tecnologias Utilizadas

*   **Backend:**
    *   **Java 21**
    *   **Spring Boot 3.3.0:** Framework principal para a criação da aplicação.
    *   **Spring Data JPA:** Para facilitar o acesso e a persistência de dados.
    *   **H2 Database:** Banco de dados em memória para desenvolvimento e testes.
    *   **Maven:** Gerenciador de dependências e build.

*   **Frontend:**
    *   **HTML5**
    *   **Bootstrap 5:** Framework CSS para um design responsivo e moderno.
    *   **Font Awesome:** Biblioteca de ícones.
    *   **JavaScript (Vanilla):** Para a lógica de interação com o backend (fetch API).
