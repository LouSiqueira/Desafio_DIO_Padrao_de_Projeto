package Subsistema1.reservation;

public class FlightReservation {

    private FlightReservation(){
        super();
    }

    public static void gerarPassagem(String nome, String numeroVoo, String empresaAerea, String origem,
                                     String horarioDecolagem, String destino, String horarioPouso){
        System.out.println("SUA PASSAGEM FOI GERADA COM SUCESSO");
        System.out.println("Companhia Aérea: " + empresaAerea);
        System.out.println("Passageiro: " + nome);
        System.out.println("Número do voo: " + numeroVoo);
        System.out.println("Origem: " + origem + "   Decolagem: " + horarioDecolagem);
        System.out.println("Origem: " + destino + "   Pouso: " + horarioPouso);
    }
}
