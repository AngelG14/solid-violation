import java.util.ArrayList;

public class GestorEnvio {
    
    private ArrayList<Envio> myEnvios;
    
    public GestorEnvio(){
        this.myEnvios = new ArrayList();
    }
    
    public void CrearEnvio(String tipo, int precio, int tiempo){
        Envio shipment = new Envio(tipo, precio, tiempo);
        this.myEnvios.add(shipment);
    }
    
    public ArrayList<Envio> getEnvios(){
        return myEnvios;
    }
    
}