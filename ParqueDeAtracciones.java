public class ParqueDeAtracciones
{
    private String nombreParque;
    private int nAtracciones;
    private boolean abierto;

    public ParqueDeAtracciones(int numAtracciones, boolean estaAbierto){
        nombreParque = "Raptor Park";
        nAtracciones = numAtracciones;
        abierto = estaAbierto;
    }

    public String getName(){
        return nombreParque;
    }
    
    public int getNumeroAtracciones(){
        return nAtracciones;
    }
    
    public boolean getAbierto(){
        return abierto;
    }
    
    public void setName (String name){
        nombreParque = name;
    }
    
    public void setAtracciones (int nAtraccionesNuevas){
        nAtracciones += nAtraccionesNuevas;
    }
    
    public void setAbirto (){
        if (abierto){
            abierto = false;
        }
        else{
            abierto = false;
        }
    }
}
