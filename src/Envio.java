public class Envio {
    
  private String tipo;
  private int precio;
  private int tiempo;

  public Envio() {
    this.tipo = "";
    this.precio = 0;
    this.tiempo = 0;
  }

  public Envio(String tipo, int precio, int tiempo) {
    this.tipo = tipo;
    this.precio = precio;
    this.tiempo = tiempo;
  }

   public String getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }
    
    public int getTiempo() {
        return tiempo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

  /*void crearTipoEnvio(Envio envio) {
    //Save Envio DB
  }*/
    
}