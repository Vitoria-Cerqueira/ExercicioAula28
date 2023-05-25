package ExercicioDois;

public class SeguroVida extends Conta implements CalculoTributos{
    @Override
    public double calcularTributo(double saldo) {
        System.out.println("O valor do seguro de vida é: " + 42);
        System.out.println("O saldo ficará: ");
        return saldo - 42.0;
    }
}
