package publicacion;
public class Periodico extends Publicacion implements Periodicidad
{
   private String fecha;
 
   public String getFecha(){
   return fecha;
   }
    
   public void setFecha(String fech){
   fecha = fech;
   }
   
   @Override
   public String getPeriodicidad()//implementaci�n del m�todo
   {
    return periodicidad;
   } 
}