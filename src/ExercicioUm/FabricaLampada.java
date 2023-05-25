package ExercicioUm;

public class FabricaLampada {

    public static String construir(int decisao){

        switch (decisao){
            case 1:
                Incandescente lampada = new Incandescente();
                return "Lâmpada incandescente criada " + "\n" + lampada.ligar() + "\n" + lampada.desligar();

            case 2:
                Fluorescente lampadaNova = new Fluorescente();
                return "Lâmpada flourescente criada" + "\n" + lampadaNova.ligar() + "\n" + lampadaNova.desligar();

            default:
                return "Opção invalida";
        }
    }
}
