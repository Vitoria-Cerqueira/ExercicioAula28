### Exercicio Interface

<hr>

<h4> Lógica do exercicio 1 </h4>

- Criei uma interface com o nome "Lampada"
- Dentro dessa interfece foi implementado dois métodos abstratos do tipo String: "ligar()" e "desligar()".
- Foi criado uma classe "FabicaLampada".
- Criei duas classes "Incandescente" e "Fluorescente" implementadas da classe "lampada" e sobreescrevi os métodos "Ligar" e "Desligar".
- Criei um método chamado "construir()" na minha classe "FabricaLampada", dentro desse método utilizei o (switch case) para ter interação com o usuario, dentro do swicth instanciei as duas classes "Incandescente" e "Flourescente" e chamei o metodo "ligar" e "desligar".
- E na minha main chamada "Exercicio01" eu instanciei o Scanner, criei uma interação com o usuario e passei a respoasta como parametro no metodo construir e chamei o metodo "FabricaLampada" tudo isso dentro de um system.out.print.


<hr>

<h4> Lógica do exercicio 2 </h4>

- Criei uma interface chamada CalculoTributos.
- Criei uma classe Conta para criar um atributo saldo e passar um valor fixo e criei um metodo "decisao()".
- Dentro do método "desisao()" coloquei um switch com as cases SuguroVida, ContaCorrente e ContaPoupanca, para interagir com o usuario.
- Criei uma classe SeguroVida coloquei ele como implements da interface CalculoTributos e extends da classe "conta" e sobreescrevi o metodo "calcularTributo()", para calcular a taxa de seguro de vida
- Criei uma classe "ContaCorrente" coloquei como implements de CalculoTributos e extends de conta, e também sobreescrevi o metodo calcularTributo, para que ele calculasse o valor do tributo.
- Criei uma classe chamada ContaPoupanca e coloquei ela como extends de Conta e usei ela para consultar saldo.
- E na main instanciei o objeto Conta e usei um system.out.print para chamar o metodo "decisao()"



