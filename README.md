# 📅 Agendador de Horários

API REST desenvolvida com **Java e Spring Boot** para gerenciamento de agendamentos.
O sistema permite criar, listar, atualizar e excluir horários de forma simples, simulando aplicações reais como clínicas, barbearias ou serviços de atendimento.

---

## 🚀 Objetivo

Este projeto foi desenvolvido com foco em aprendizado de:

* Construção de APIs REST com Spring Boot
* Integração com banco de dados usando JPA/Hibernate
* Organização em camadas (Controller, Service, Repository)
* Boas práticas para back-end Java

---

## 🛠️ Tecnologias utilizadas

* ☕ Java
* 🌱 Spring Boot
* 📦 Spring Data JPA
* 🗄️ Hibernate
* 💾 H2 Database (banco em memória)
* 🔧 Maven

---

## 📂 Estrutura do projeto

```bash
src/main/java/
 ├── controller/   # Endpoints da API
 ├── service/      # Regras de negócio
 ├── repository/   # Acesso ao banco
 └── model/        # Entidades (JPA)

src/main/resources/
 ├── application.properties
 └── data.sql (opcional)
```

---

## ⚙️ Como executar o projeto

### 🔹 Pré-requisitos

* Java 17 ou superior
* Maven instalado
* IDE (IntelliJ recomendado)

---

### 🔹 Passo a passo

```bash
# Clone o repositório
git clone https://github.com/Cesarleitor/agendador-horarios.git

# Entre na pasta
cd agendador-horarios

# Execute o projeto
mvn spring-boot:run
```

---

## 🌐 API Endpoints

| Método | Endpoint             | Descrição                   |
| ------ | -------------------- | --------------------------- |
| GET    | `/agendamentos`      | Lista todos os agendamentos |
| GET    | `/agendamentos/{id}` | Busca por ID                |
| POST   | `/agendamentos`      | Cria um novo agendamento    |
| PUT    | `/agendamentos/{id}` | Atualiza um agendamento     |
| DELETE | `/agendamentos/{id}` | Remove um agendamento       |

---

## 📌 Exemplo de requisição (POST)

```json
{
  "nome": "Cesar",
  "data": "2026-03-30",
  "horario": "14:00"
}
```

---

## 🧪 Banco de dados (H2)

O projeto utiliza o H2 para facilitar testes.

Acesse no navegador:

```
http://localhost:8080/h2-console
```

---

## ⚠️ Observações importantes

* Campos primitivos (`long`, `int`) podem gerar erro ao receber `null`, então prefira usar `Long` e `Integer`
* Para evitar problemas de performance, recomenda-se desativar:

```properties
spring.jpa.open-in-view=false
```

---

## 💡 Possíveis melhorias

* 🔐 Sistema de autenticação (Spring Security + JWT)
* 📱 Integração com front-end (React ou Angular)
* 📧 Notificações de agendamento
* 📊 Dashboard administrativo
* 🐳 Dockerização da aplicação

---

## 🧑‍💻 Autor

Desenvolvido por **Cesar**

* GitHub: https://github.com/Cesarleitor

---

## 📄 Licença

Este projeto está sob a licença MIT.

---

## ⭐ Sobre o projeto

Sistemas de agendamento são amplamente utilizados em aplicações reais para organização de horários e reservas, permitindo cadastro, consulta e gerenciamento de compromissos de forma eficiente ([GitHub][1]).

---

[1]: https://github.com/Snarloff/sistema-agendamento?utm_source=chatgpt.com "GitHub - Snarloff/sistema-agendamento: Este é um projeto de sistema de agendamento desenvolvido como parte de estudos anteriores. O sistema permite que os usuários cadastrem e visualizem agendamentos em um calendário, vejam detalhes de agendamentos individuais e recebam notificações por e-mail quando uma consulta está próxima."
