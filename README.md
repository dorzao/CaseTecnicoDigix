<font size="5">
# Desafio técnico

## Seleção de famílias aptas a ganharem uma casa popular

Temos um produto e recebemos o desafio de gerar uma lista de pessoas aptas a ganhar uma casa popular do governo, tendo como única exigência que essa lista esteja ordenada de forma mais justa possível com um somatório de pontos, analisando aspectos das famílias que estão participando. São considerados os seguintes critérios para a construção das pontuações:

- Renda total da família até 900 reais - valendo 5 pontos;
- Renda total da família de 901 à 1500 reais - valendo 3 pontos;
- Famílias com 3 ou mais dependentes  (lembrando que dependentes maiores de 18 anos não contam) - valendo 3 pontos;
- Famílias com 1 ou 2 dependentes  (lembrando que dependentes maiores de 18 anos não contam) - valendo 2 pontos.

O código que faz essa análise hoje é totalmente procedural, repleto de blocos if/else pra analisar e montar as classificações e nos dá muito custo de manutenção, nos motivando a procurar uma nova solução para este problema. Seu desafio é justamente isso, codificar uma forma melhor de chegar no mesmo resultado usando e abusando da orientação à objetos, criando classes e métodos de uma forma que fique tudo mais legível e fácil de manter e estender.

Falando sobre estender, o cliente já deixou um alerta ligado de que irão incluir novos critérios na avaliação das famílias em breve, assim que forem aprovados pelo governador, então temos que ter uma solução preparada para adicioná-los sem muito custo de implementação.

Como iremos focar em avaliar os conceitos usados, também não há necessidade de entregar um código funcionando e muito menos uma interface (tela), seja ela na linha de comando, web ou desktop. O que nos importa mesmo é o código que fará a regra de negócio e como ele estará estruturado.

### Sua missão

O resultado esperado é que as famílias, na listagem, estejam pontuadas de acordo com os critérios que foram atendidos (cada família pode pontuar uma única vez por critério, além de poder atender todos os critérios ou nenhum deles) e ordenadas pela pontuação, favorecendo as famílias melhores pontuadas.

## O que esperamos ver no seu código

- Lógica de programação;
- Capacidade de resolver problemas complexos;
- Orientação à objetos;
- Clean code.

## Aspectos que contariam um ponto a mais se aparecerem no seu código

- Testes automatizados;
- Conceitos de arquitetura;
- Design patterns.

## Demais dúvidas

**O código precisa estar rodando ou funcionando?**

Não, o nosso maior interesse é na sua abordagem de solução, esta sim precisa estar bem implementada.

**Sobre o modelo exibido, famílias podem ter mais de um pretendente ou não ter nenhum?**

Não, uma família sempre possuirá um único pretendente e um único cônjuge.

**Quando devo realizar o desenvolvimento?**
Apenas no momento do teste, na data que marcamos com você.
Liberamos o acesso antes da etapa para que tenha a oportunidade de entender o case.

# Minha Construção

Criei um projeto no eclipse,utilizei o modelo de padrão de projetos (design patterns) Strategy em alguns momentos, e reduzi ao máximo os ifs, elseifs, fors. Criei as interfaces para calculo da pontuação através dos critérios (interface), adicionei uma classe para cada cálculo (Pontuador -> renda e dependentes 1 e 2)(Context), e por fim, criei uma classe para cada critério (critério 1 e 2)(concret). Além disso, declarei uma classe família que dialoga com os 2 critérios, também a classe prioridade que gera um vetor de objetos de si própria para conseguir separar os objetos família de acordo com suas pontuações. Dentro da classe prioridade eu coloquei um arraylist estático e uma tupla estática com todas as possibilidades de pontuação, o tamanho do vetor de objetos é exatamente o tamanho da tupla, e a organização é uma comparação entre o objeto e as posições da tupla estática, o que facilita futuras implementações tais como, novos critérios com novas pontuações. Com relação a testes, criei a classe lista final, onde contemplei uma lista em formato de saída, utilizando todos os arraylistss dos objetos prioridade, de acordo com a pontuação adiquirida, e em cada uma das 3 entidades do strategy, adicionei saídas no terminal para verificação de funcionamento. Ainda coloquei uma classe para cadastrar familias, onde se pede o nis, número de membros na familia, dos n membros da familia, quantos são menores de 18 anos? E por fim, um novo objeto familia criado e manipulado.
</font>