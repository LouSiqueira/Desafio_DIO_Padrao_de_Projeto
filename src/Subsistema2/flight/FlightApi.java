package Subsistema2.flight;

public class FlightApi {

    public static FlightApi instancia = new FlightApi();

    private FlightApi(){
        super();
    }

    public static FlightApi getInstancia(){
        return instancia;
    }

    public String empresaAerea(String origem){
        return "Gol";
    }

    public String numeroVoo (String origem){
        return "2057";
    }

    public String horarioDecolagem(String origem) {
        return "2:45";
    }

    public String horarioPouso(String destino) {
        return "10:05";
    }

}
