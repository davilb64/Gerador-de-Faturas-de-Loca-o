# Gerador de Faturas de Locação

Sistema para geração de faturas de locação desenvolvido em Java com arquitetura MVC (Model-View-Controller).

## Estrutura do Projeto

O projeto segue a arquitetura MVC padrão para Java:

```
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── geradordefaturas/
│   │   │           ├── com.geradordefaturas.locacao.model/          # Camada de modelo (entidades e lógica de negócio)
│   │   │           ├── view/           # Camada de visualização (interface com usuário)
│   │   │           └── com.geradordefaturas.locacao.controller/     # Camada de controle (lógica de aplicação)
│   │   └── resources/                  # Arquivos de configuração e recursos
│   └── test/
│       └── java/
│           └── com/
│               └── geradordefaturas/   # Testes unitários e de integração
├── pom.xml                             # Configuração Maven
└── README.md                           # Este arquivo
```

## Arquitetura MVC

### Model (Modelo)
- Contém as classes de entidade e a lógica de negócio
- Responsável pelos dados e regras de negócio da aplicação
- Exemplos: Fatura, Cliente, ItemLocacao, etc.

### View (Visualização)
- Responsável pela interface com o usuário
- Apresenta os dados ao usuário e captura entrada
- Pode incluir interfaces console, Swing, JavaFX, etc.

### Controller (Controlador)
- Intermediário entre Model e View
- Processa a entrada do usuário
- Coordena as operações entre Model e View

## Requisitos

- Java JDK 11 ou superior
- Maven 3.6 ou superior

## Como Compilar

```bash
mvn clean compile
```

## Como Executar os Testes

```bash
mvn test
```

## Como Executar

```bash
mvn exec:java -Dexec.mainClass="com.geradordefaturas.Main"
```

## Desenvolvimento

Para começar o desenvolvimento:

1. Clone o repositório
2. Importe o projeto em sua IDE (Eclipse, IntelliJ IDEA, etc.)
3. Execute `mvn clean install` para baixar as dependências

## Contribuindo

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-funcionalidade`)
3. Commit suas mudanças (`git commit -am 'Adiciona nova funcionalidade'`)
4. Push para a branch (`git push origin feature/nova-funcionalidade`)
5. Crie um Pull Request

## Licença

Este projeto está sob a licença especificada no arquivo LICENSE.
