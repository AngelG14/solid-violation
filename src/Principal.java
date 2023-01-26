public class Principal {
    
    //Variable de clase
    
    private GestorEnvio gestor;

    public static void main(String[] args) {
        
    // En el main solo se ejecuta el constructor debido a que es la puerta de entrada del programa
      
    new Principal();

    /*
    
    Se hace uso de un gestor de los envios para administrarlos, ademas, fue añadido el tiempo como atributo del envio
    
    Envio[] envios = {
        new Envio("Municipal",5000),
        new Envio("Intermunicipal",15000),
        new Envio("Internacional",25000)
    };

    //Esta repetido
    
    imprimirTiempoDeEnvio(envios);
    imprimirTiempoDeEnvio(envios);
    
    */
    
    }

    public Principal(){
        
        this.gestor = new GestorEnvio();
        
        this.gestor.CrearEnvio("Municipal",5000,12);
        this.gestor.CrearEnvio("Intermunicipal",15000,36);
        this.gestor.CrearEnvio("Internacional",25000,90);
        
        //Gracias al uso del gestor, no es necesario comunicar los envios al metodo
        
        imprimirTiempoDeEnvio();
        
    }

    private void imprimirTiempoDeEnvio(){
      for (Envio coche : this.gestor.getEnvios()) {
          
          /*
          
          Se accede a las propiedades de los envios mediante metodos publicos de encapsulamiento,
          y debido a que el tiempo es un atributo del envio no es necesario condicionar las opciones.
          
          */
          System.out.println(coche.getTipo() + ": Tiempo envio " + coche.getTiempo() + " horas");
          
          
        /*if(coche.getTipo().equals("Municipal")) System.out.println("Tiempo envio 12 horas");
        if(coche.getTipo().equals("Intermunicipal")) System.out.println("Tiempo envio 36 horas");
        if(coche.getTipo().equals("Internacional")) System.out.println("Tiempo envio 90 horas");*/
      }
    }
    
}