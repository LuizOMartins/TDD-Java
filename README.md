# TDD-Java

O problema dos testes manuais: 
- Lentos

- Tipos de testes automatizados:
    - Testes unitários: um metodo por exemplo
    - Testes de integração: testa a integração entre os componentes (com banco de dados, por exemplo)
    - Testes funcionais/Testes de aceitação
    - Teste de carga: testa a performance da aplicação (JMETER)


- Chain of Responsibility:
- Chain of Responsibility é um padrão de projeto comportamental que permite passar solicitações ao longo de uma cadeia de manipuladores. Ao receber uma solicitação, cada manipulador decide processar a solicitação ou passá-la para o próximo manipulador na cadeia.


Codigo de Teste: 
- nome explicativo

- Atenção as asserções:
-- cada teste deve ter apenas uma asserção.

____________
Identificar resposabilidade de uma classe:
- Uma classe deve ter apenas uma responsabilidade


Tecnica de Teste e separação de responsabilidades:
- exemplo: projeto passagem aerea.
-  Exemplo de caso com varios tipos de passeiros e  com descontos diefrentes.

-  Desacoplando e aumentando a coesões das classes:
- Estratégia usada: delegando no tipo passageiro Enum a responsabilidade de escolher a classe de calculo.
- Nesse exemplo, também é possivel separar os testes por tipo de passageiro e assim realizar o testes em cada classe e dai no caso extinguir os testes extensos em apenas uma classe, no exemplo, no Service.


_______________________________________________________

Mock: Usando Mock Objects

Regras para pedido:
- calcular imposto
- salvar no banco de dados
-  enviar e-mail para cliente
- notificar por SMS


Dependencia Mockito: AUXILIA NA CRIAÇÃO DE MOCKS.
- no caso foi utilizado um mock para simular salvar no banco de dados.
Exemplo:
Pedidos pedidos = Mockito.mock(Pedidos.class);
-> o objeto pedido é um mock, ou seja, não é um objeto real, mas sim um objeto simulado.
no código: MOckito.verify(pedidos).salvar(pedido);
> faz a verificação se o método salvar foi chamado.

