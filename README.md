# dsmovie

DSMovie é uma aplicação full stack web e mobile construída durante a 6ª edição da Semana Spring React , evento organizado pela DevSuperior.

A aplicação consiste em um catálogo de filmes, dos quais podem ser avaliados por um usuário, que informa seu email e uma nota para o filme em questão. Os dados são apresentados de forma contínua, automatizada e paginada.
Tecnologias utilizadas
Back end

    Java
    Spring Boot
    Spring Data JPA
    Maven

Front end

    HTML / CSS / Bootstrap / JS / TypeScript
    ReactJS

Implantação em produção

    Back end: Heroku
    Front end: Netlify
    Banco de dados: Postgresql 12

Como executar o projeto
Back End

Pré-requisitos: Java 17

# clonar repositório
git clone https://github.com/AugustoCesar/dsmovie

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run

Front End

Pré-requisitos: npm / yarn

# clonar repositório
git clone https://github.com/AugustoCesar/dsmovie

# entrar na pasta do projeto front end
cd frontend

# instalar dependências
yarn install

# executar o projeto
yarn start
