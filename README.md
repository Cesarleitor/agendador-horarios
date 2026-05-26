# 💈 Sistema de Agendamento – Barbearia Premium

Sistema full stack para gerenciamento de agendamentos de uma barbearia, desenvolvido com Spring Boot (backend) e React (frontend).

---

## 🚀 Visão Geral

Este projeto permite que clientes visualizem serviços, realizem agendamentos online e consultem horários disponíveis.  
Também permite que administradores gerenciem agendamentos, clientes e horários de atendimento.

---

## 🧱 Tecnologias Utilizadas

### Backend
- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- H2 Database (em desenvolvimento)
- Maven

### Frontend
- React
- React Router DOM
- JavaScript (ES6+)
- CSS
- Vite

---

## 📁 Estrutura do Projeto

agendar-horarios/
│
├── backend/
│   ├── src/
│   ├── pom.xml
│   └── mvnw
│
├── frontend/
│   ├── src/
│   ├── package.json
│   └── vite.config.js
│
└── README.md

---

## ⚙️ Como Executar o Projeto

### Backend (Spring Boot)

cd backend  
./mvnw spring-boot:run  

Servidor: http://localhost:8081  

---

### Frontend (React)

cd frontend  
npm install  
npm run dev  

Aplicação: http://localhost:5173  

---

## 🔗 Integração Frontend + Backend

O frontend consome a API do backend:

fetch("http://localhost:8081/agendamentos")  
.then(res => res.json())  
.then(data => console.log(data));

---

## 📌 Funcionalidades

### Cliente
- Visualizar serviços
- Realizar agendamentos
- Consultar horários disponíveis

### Administrador
- Listar agendamentos
- Cancelar ou editar horários
- Gerenciar clientes

---

## 🧠 Aprendizados

- Desenvolvimento full stack
- Criação de API REST com Spring Boot
- Consumo de API com React
- Organização de projetos frontend/backend
- Integração entre sistemas

---

## 🔮 Próximas melhorias

- Sistema de login (JWT)
- Painel administrativo completo
- Controle de barbeiros
- Notificações de agendamento
- Deploy (Vercel + Railway)

---

## 👨‍💻 Autor

Desenvolvido por Cesar  
Projeto pessoal focado em aprendizado e portfólio full stack.

---

## ⭐ Status do Projeto

Em desenvolvimento contínuo
