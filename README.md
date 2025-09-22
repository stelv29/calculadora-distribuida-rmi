Calculadora Distribuída com Java RMI
Implementação de uma calculadora descentralizada utilizando Java RMI, desenvolvida como parte de uma atividade acadêmica sobre Arquitetura Orientada a Serviços (SOA).

Sobre o Projeto
Este projeto foi desenvolvido para atender aos requisitos de uma atividade proposta pelo professor da disciplina de Sistemas Distribuídos. O objetivo principal era aplicar na prática os conceitos de Arquitetura Orientada a Serviços (SOA) e comunicação remota utilizando a tecnologia Java RMI.

O sistema simula um ambiente de microserviços, onde um servidor principal atua como um orquestrador, delegando as operações matemáticas para serviços especialistas e independentes.

Arquitetura
A arquitetura do sistema é composta por três componentes principais:

Cliente: A aplicação que interage com o usuário. Ela se comunica apenas com o Servidor Calculadora, abstraindo toda a complexidade da rede de serviços.

Servidor Calculadora (Orquestrador): Atua como um ponto central de entrada (Facade). Ele recebe as requisições do cliente e as encaminha para o servidor especialista apropriado.

Servidores Especialistas (Trabalhadores): Quatro servidores independentes, onde cada um é responsável por uma única operação matemática (Soma, Subtração, Multiplicação e Divisão).

O fluxo de uma requisição é: Cliente → Servidor Calculadora → Servidor Especialista → Servidor Calculadora → Cliente.

Tecnologias Utilizadas
Java: Linguagem de programação principal.

Java RMI (Remote Method Invocation): Tecnologia para a comunicação entre os diferentes servidores (nós) do sistema.

Maven: Ferramenta para gestão de dependências e compilação do projeto.

Para executar a aplicação, é necessário ter o JDK (Java Development Kit) instalado e configurado no PATH do sistema.
