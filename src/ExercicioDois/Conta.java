package ExercicioDois;

import java.util.Scanner;

public class Conta {
    protected double saldo;

    public Conta() {
        this.saldo = 1000;
    }


    public double decisao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Seu saldo é: " + saldo);
        System.out.println("Você deseja acessar: \n1- Conta Poupança \n2- Conta Corrente \n3- Seguro de Vida");
        switch (scan.nextInt()){
            case 1:
                ContaPoupanca cp = new ContaPoupanca();
                return cp.consultarSaldo();
            case 2:
                ContaCorrente acc = new ContaCorrente();
                return acc.calcularTributo(saldo);

            case 3:
                SeguroVida sv = new SeguroVida();
                return sv.calcularTributo(saldo);

            default:
                return 4.5;
        }
    }
}