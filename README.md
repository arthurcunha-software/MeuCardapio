## 🍽️ Meu Cardápio

Sistema web para digitalização de cardápios de restaurantes, desenvolvido como Projeto Integrado do curso de Análise e Desenvolvimento de Sistemas.

A proposta é simples: acabar com o cardápio de papel. O estabelecimento cadastra seus produtos na plataforma e recebe um QR Code único. Ao escanear o código, o cliente é levado direto para uma página web com o cardápio completo e atualizado — sem precisar instalar aplicativo nenhum.


## 🔗 **Deploy:** [Acessar](https://projetointegrado-kper.onrender.com/)

---

## ✨ Funcionalidades


- 📋 Criação e gerenciamento do cardápio (adicionar, editar e remover itens)
- 📱 Geração automática de **QR Code** vinculado ao cardápio
- 🌐 Página pública do cardápio, acessível por qualquer pessoa que escanear o QR Code
- 🔄 Atualização em tempo real: qualquer alteração no cardápio reflete instantaneamente na página pública



## 💡 Motivação

Cardápios físicos ficam desatualizados rapidamente, têm custo de impressão e não são práticos de manter — principalmente em estabelecimentos que mudam preços ou itens com frequência. O **Meu Cardápio** resolve isso oferecendo uma solução digital, prática e de baixo custo para pequenos e médios restaurantes modernizarem o atendimento.


## 🛠️ Tecnologias utilizadas


- **Java** com **Spring Boot** — back-end e regras de negócio
- **Thymeleaf** — renderização das páginas server-side
- **HTML, CSS e JavaScript** — interface e interatividade
- **Bootstrap** — estilização e componentes responsivos
- **Docker** — containerização da aplicação
- **Render** — hospedagem e deploy

## 🤖 Processo de desenvolvimento com IA

Utilizei ferramentas de IA generativa (Gemini) para acelerar etapas repetitivas do desenvolvimento, mantendo total controle sobre arquitetura, regras de negócio e decisões de produto:

- **Back-end, lógica de negócio e arquitetura**: definidos e implementados por mim
- **Front-end (HTML/CSS/JS)**: gerado com apoio de IA a partir de prompts específicos, 
  detalhando o que criar e onde alterar — depois padronizado manualmente para 
  garantir consistência visual entre as páginas
- **Documentação**: estruturada com apoio de IA (Claude), a partir do conteúdo e 
  decisões que eu já tinha definido

Esse fluxo de trabalho com IA foi determinante para viabilizar a entrega individual 
de um projeto que a faculdade recomendava ser feito em equipes de até 3 pessoas.
  
## 🚀 Como executar localmente

### Pré-requisitos

- Java 17+ (ou a versão configurada no projeto)
- Maven
### Passo a passo

Clone o repositório:

```bash
git clone https://github.com/arthurcunha-software/MeuCardapio.git
```

Entre na pasta do projeto:

```bash
cd MeuCardapio
```

Rode com Maven:

```bash
./mvnw spring-boot:run
```

# Rode com Maven
./mvnw spring-boot:run

A aplicação estará disponível em http://localhost:8080.

## 🎓 Sobre o projeto

Este projeto foi desenvolvido por **Arthur Cunha** como Trabalho de Conclusão de Curso (Projeto Integrado) do curso de **Análise e Desenvolvimento de Sistemas**, com foco em aplicar na prática os conhecimentos de desenvolvimento back-end com Spring Boot, templates server-side com Thymeleaf, e deploy de aplicações em produção.

## 📄 Licença

Feito para fins acadêmicos. Sinta-se à vontade para explorar o código e utilizá-lo como referência de estudo.

🙏 Agradecimentos

O desenvolvimento foi individual, mas registro aqui meu agradecimento a [Henrique Carvalho](https://github.com/HenriqueCarvalhoFernandes) pela contribuição pontual na implementação do sistema de geração de QR Code, que me ajudou a concluir dentro do prazo de entrega.


