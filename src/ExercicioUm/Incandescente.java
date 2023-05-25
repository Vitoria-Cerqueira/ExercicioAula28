package ExercicioUm;

public class Incandescente implements Lampada{
    @Override
    public String ligar() {
        return "Lâmpada foi ligada";
    }

    @Override
    public String desligar() {
        return "Lâmpada foi desligada";
    }
}
