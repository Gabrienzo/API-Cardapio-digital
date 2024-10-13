# API-Cardapio-digital
API REST da aplicação de Cardápio Digital desenvolvido durante video aula:\
[Criando Aplicação Fullstack do Zero com Java Spring e React - Parte 1: Desenvolvimento do Backend](https://www.youtube.com/watch?v=lUVureR5GqI&amp;ab_channel=FernandaKipper%7CDev_)

## Tecnologias Utilizadas

- **Java** (Maven): Linguagem de programação utilizada para desenvolver a API.
- **Spring**: Framework utilizado para construir a aplicação e gerenciar a injeção de dependências.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional utilizado para armazenar dados.
- **Flyway**: Ferramenta de versionamento de banco de dados utilizada para gerenciar alterações no esquema do banco de dados.
- **Hibernate**: ORM (Object-Relational Mapping) utilizado para facilitar a interação entre a aplicação e o banco de dados.

## Funcionalidades

- **Listar Itens do Cardápio**: Endpoint para obter todos os itens do cardápio.
- **Adicionar Item ao Cardápio**: Endpoint para adicionar um novo item ao cardápio.

## Endpoints

| Método | Endpoint               | Descrição                              |
|--------|------------------------|----------------------------------------|
| GET    | `/api/foods`           | Obtém todos os itens do cardápio      |
| POST   | `/api/foods`           | Adiciona um novo item ao cardápio     |

## Adicionais
Alem disso, pratiquei a utilização de:
- **pgAdmin 4**
- **Postman**

## Configuração do Ambiente

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/username/repository.git
   cd repository
