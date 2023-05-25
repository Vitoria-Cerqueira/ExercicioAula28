package ExercicioUm;

public class Fluorescente implements Lampada{
    @Override
    public String ligar() {
        return "Lâmpada ligada";
    }

    @Override
    public String desligar() {
        return "Lâmpada desligada";
    }
}
