package Facade;

import Subsistema1.reservation.FlightReservation;
import Subsistema2.flight.FlightApi;

public class Facade {

    public void novaPassagem(String nome, String origem, String destino){
        String empresaAerea = FlightApi.getInstancia().empresaAerea(origem);
        String horarioDecolagem = FlightApi.getInstancia().horarioDecolagem(origem);
        String horarioPouso = FlightApi.getInstancia().horarioPouso(destino);
        String numeroVoo = FlightApi.getInstancia().numeroVoo(origem);

        FlightReservation.gerarPassagem(nome,numeroVoo, empresaAerea, origem, horarioDecolagem, destino, horarioPouso);
    }
}
