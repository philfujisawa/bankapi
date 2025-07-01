# 💸 BankAPI — API de Transferências com Idempotência em Java + Spring Boot

🚀 Projeto de estudo e demonstração de boas práticas em desenvolvimento de APIs REST com controle de idempotência, testes automatizados com JUnit 5 + RestAssured e configuração completa para rodar localmente.

![Java](https://img.shields.io/badge/Java-21-blue.svg) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.3-brightgreen.svg) ![Maven](https://img.shields.io/badge/Maven-3.x-orange.svg) ![JUnit5](https://img.shields.io/badge/JUnit-5-green.svg)

---

## ✨ Funcionalidades

✅ Transferência entre contas, com idempotência para evitar duplicação de transações.  
✅ Endpoint para consultar o total de transações processadas.  
✅ Testes automatizados de API com JUnit + RestAssured.  
✅ Projeto simples e limpo, ideal para iniciantes aprenderem como montar uma API REST.  
✅ Configuração pronta para entrevistas técnicas.

---

## 📂 Estrutura do Projeto
bankapi/
├─ src/
│ ├─ main/java/com/estudo/bankapi/
│ │ ├─ BankapiApplication.java
│ │ ├─ TransferRequest.java
│ │ ├─ TransferController.java
│ │ └─ ...
│ └─ main/resources/application.properties
├─ pom.xml
└─ README.md

---

## ⚙️ Pré-requisitos

✅ Java 21 instalado (recomendo [AdoptOpenJDK](https://adoptium.net/)).  
✅ Maven 3.x instalado e configurado no PATH.  
✅ IntelliJ IDEA (ou outro IDE) — mas você também pode rodar no terminal.

---

## 🚀 Como executar o projeto

1️⃣ Clone este repositório:
```bash
git clone https://github.com/SEU_USUARIO/bankapi.git
cd bankapi
2️⃣ Compile e instale as dependências:
mvn clean install
3️⃣ Inicie a API localmente:
mvn spring-boot:run
✅ A aplicação estará rodando em http://localhost:8080.

🔥 Como testar a API
➕ Criar uma transferência
Faça um POST para /transfer com JSON como:
{
  "fromAccount": "123",
  "toAccount": "456",
  "amount": 500,
  "idempotencyKey": "algumakeyunica"
}
Exemplo no Postman:

URL: POST http://localhost:8080/transfer

Headers: Content-Type: application/json

Body: JSON acima.

🔍 Consultar total de transações
Faça um GET para /transfer/count:
curl http://localhost:8080/transfer/count

🧪 Executando os testes automatizados
Dica: Deixe a API rodando (mvn spring-boot:run) em um terminal e execute em outro:
mvn test
✅ Isso vai rodar testes automatizados com JUnit e RestAssured, verificando os endpoints da API.

📚 O que você aprende com este projeto?
Estrutura básica de um projeto Spring Boot.

Implementação de idempotência em APIs REST.

Escrita de testes de API com JUnit 5 + RestAssured.

Conceitos de boas práticas em endpoints RESTful.

Controle de dependências com Maven.

Integração com Git/GitHub para versionamento e portfólio.
👨‍💻 Autor
Philippe Fujisawa


📌 Este projeto é apenas para fins de estudo e demonstração — não é uma aplicação de produção.
⭐ Se você gostou, deixe um ⭐ no repositório para ajudar mais pessoas a encontrar este material!