🍽️ Meu Cardápio

Sistema web para digitalização de cardápios de restaurantes, desenvolvido como Projeto Integrado do curso de Análise e Desenvolvimento de Sistemas.

A proposta é simples: acabar com o cardápio de papel. O estabelecimento cadastra seus produtos na plataforma e recebe um QR Code único. Ao escanear o código, o cliente é levado direto para uma página web com o cardápio completo e atualizado — sem precisar instalar aplicativo nenhum.

🔗 Deploy: Render


✨ Funcionalidades

  📋 Criação e gerenciamento do cardápio (adicionar, editar e remover itens)
  📱 Geração automática de QR Code vinculado ao cardápio
  🌐 Página pública do cardápio, acessível por qualquer pessoa que escanear o QR Code
  🔄 Atualização em tempo real: qualquer alteração no cardápio reflete instantaneamente na página pública


💡 Motivação

Cardápios físicos ficam desatualizados rapidamente, têm custo de impressão e não são práticos de manter — principalmente em estabelecimentos que mudam preços ou itens com frequência. O Meu Cardápio resolve isso oferecendo uma solução digital, prática e de baixo custo para pequenos e médios restaurantes modernizarem o atendimento.


🛠️ Tecnologias utilizadas

  Java com Spring Boot — back-end e regras de negócio
  Thymeleaf — renderização das páginas server-side
  HTML, CSS e JavaScript — interface e interatividade
  Docker — containerização da aplicação
  Render — hospedagem e deploy
  
🚀 Como executar localmente

Pré-requisitos


  Java 17+ (ou a versão configurada no projeto)
  Maven

Passo a passo

# Clone o repositório
git clone https://github.com/arthurcunha-software/MeuCardapio.git
cd MeuCardapio

# Rode com Maven
./mvnw spring-boot:run

A aplicação estará disponível em http://localhost:8080.


