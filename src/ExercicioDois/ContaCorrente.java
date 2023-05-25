package ExercicioDois;

public class ContaCorrente extends Conta implements CalculoTributos{


    @Override
    public double calcularTributo(double saldo) {
        System.out.println("O valor do tributo é: " + (saldo * 0.01));
        System.out.println("Seu saldo ficará: ");
        return saldo - (saldo * 0.01);
    }
}
