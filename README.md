# 🚀 SpaceShare

Sistema de gerenciamento de reservas de estações de trabalho compartilhadas, desenvolvido em Java como projeto acadêmico no IFNMG.

---

## 📋 Sobre o Projeto

O **SpaceShare** permite que usuários reservem turnos em estações de trabalho, com verificação automática de conflitos de horário. O sistema impede que dois usuários reservem o mesmo período na mesma estação e exibe um mapa completo das reservas agendadas.

---

## 🏗️ Estrutura do Projeto

```
SpaceShare/
├── src/
│   └── br/edu/ifnmg/aluno/jpss1/
│       ├── SpaceShare.java   # Classe principal (main)
│       ├── Estacao.java      # Gerencia reservas de uma estação
│       └── Reserva.java      # Representa uma reserva de turno
```

### Descrição das Classes

| Classe | Responsabilidade |
|--------|-----------------|
| `SpaceShare` | Ponto de entrada da aplicação. Cria estações e reservas de exemplo. |
| `Estacao` | Armazena e gerencia a lista de reservas de uma estação, detectando conflitos. |
| `Reserva` | Representa uma reserva com usuário, horário de início e duração em horas. |

---

## ⚙️ Funcionalidades

- ✅ Cadastro de reservas em estações de trabalho
- ✅ Detecção automática de conflitos de horário
- ✅ Exibição do mapa de reservas da estação
- ✅ Cálculo automático do horário de término com base na duração

---

## 🖥️ Exemplo de Saída

```
Reserva de Joao adicionada com sucesso !

Reserva de Maria negada! Conflito de horário com Joao.

Reserva de Carlos adicionada com sucesso !

Reserva de Ana negada! Conflito de horário com Joao.

Estação 1:
  Usuario: Joao de: 08:00 às 10:00 total: 2h
  Usuario: Carlos de: 10:00 às 11:00 total: 1h
```

---

## 🚀 Como Executar

### Pré-requisitos

- Java JDK 8 ou superior
- IDE Java (NetBeans, IntelliJ IDEA, Eclipse) ou terminal com `javac`

### Compilar e Executar via Terminal

```bash
# Compilar
javac -d out src/br/edu/ifnmg/aluno/jpss1/*.java

# Executar
java -cp out br.edu.ifnmg.aluno.jpss1.SpaceShare
```

### Via IDE

Abra o projeto na sua IDE e execute a classe `SpaceShare.java` diretamente.

---

## 🧩 Como Funciona

### Verificação de Conflito

O método `adicionarReserva()` da classe `Estacao` percorre todas as reservas existentes usando um `for-each` e verifica se há sobreposição de horários com a nova reserva. A lógica utilizada é:

```
Nova reserva conflita se:
  início da nova < término da existente
  E início da existente < término da nova
```

Se houver conflito, a reserva é negada e uma mensagem é exibida. Caso contrário, ela é adicionada com sucesso.

---

## 🛠️ Tecnologias Utilizadas

- **Java** — Linguagem principal
- **`java.time.LocalTime`** — Manipulação de horários
- **`java.util.ArrayList`** — Armazenamento dinâmico das reservas

---

## 👨‍🎓 Autor

**João Pedro S. Silqueira**  
Estudante de Análise e Desenvolvimento de Sistemas — IFNMG  
Repositório acadêmico — disciplina de Programação Orientada a Objetos
