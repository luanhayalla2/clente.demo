# Relatório de Análise e Melhorias

Este relatório detalha as ações realizadas no projeto `cliente-demo`.

## 1. Análise e Correção do `index.html`

- **Problema Encontrado:** O arquivo `index.html` continha código JavaScript dentro de uma tag `<style>`, o que é incorreto e impedia o funcionamento adequado da página. O erro específico era: `Element style is not closed`.
- **Correção Aplicada:** O bloco de código JavaScript foi movido para dentro de uma tag `<script>`, corrigindo a estrutura do HTML.

## 2. Melhorias no `index.html`

O arquivo `index.html` foi reestruturado para ter uma aparência mais moderna e amigável, utilizando os recursos do **Bootstrap 5** que já estava incluído no projeto.

- **Layout:** O formulário e a lista de clientes foram organizados em cartões (`cards`) para uma melhor separação visual.
- **Ícones:** Foram adicionados ícones do **Font Awesome** para melhorar a usabilidade dos botões e títulos.
- **Estilo:** Foi adicionado CSS customizado para refinar a aparência, como cores no cabeçalho dos cartões e um espaçamento melhor entre os elementos.
- **Feedback ao Usuário:** As mensagens de sucesso e erro foram integradas ao sistema de alertas do Bootstrap, tornando-as mais claras.

## 3. Como Iniciar a Aplicação

O projeto é baseado em **Spring Boot** e utiliza o **Maven** como gerenciador de dependências.

Para iniciar a aplicação, abra um terminal na pasta raiz do projeto (`C:/Users/aluno/Desktop/cliente-demo/`) e execute o seguinte comando:

```bash
mvn spring-boot:run
```

Após a inicialização, a aplicação estará disponível no seu navegador no endereço [http://localhost:8080](http://localhost:8080).
