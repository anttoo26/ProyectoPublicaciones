package publicacion;
import java.util.ArrayList;
import java.util.Scanner;
public class Principal 
{
   public static void main(String[] args) 
   {
      int ctrlpub = 0, num,precio,n,anio,nump, opc,n1,anio1,nump1,precio1,nump2,precio2;
      String issn, tit, isbn, tit1, autor,edic,tit2, fecha;
      Scanner leer = new Scanner(System.in);
      /*Se podrá realizar un ArrayList de tipo Object? Sí, sí se puede realizar, lo inicie así,
      cuando herede lo de publicacion y implemente lo de periodicidad no me dio error, pero
      no supe cómo imprimir los datos de publicacion, junto con los de revista, libro y periodico, 
      solo me aparecia los datos que estaban en las clases de revista, libro y periodico, no lo de publicacion asi que 
      mejor así lo deje*/
      Object publicaciones [] = new Object[10];
      do
      {
         System.out.println("MENU");
         System.out.println("[1] Dar de alta Revistas");
         System.out.println("[2] Dar de alta Libros ");
         System.out.println("[3] Dar de alta Periodico ");
         System.out.println("[4] Mostrar revistas");
         System.out.println("[5] Mostrar libros");
         System.out.println("[6] Mostrar periodicos ");
         System.out.println("[7] Salir ");
         System.out.print("Elija una opcion: ");
         opc = leer.nextInt();
         leer.nextLine();
         switch(opc)
         {
            case 1:
                     Revista revista = new Revista();
                     System.out.print("ISSN: ");
                     issn = leer.nextLine();
                     System.out.print("Titulo: ");
                     tit = leer.nextLine();
                     System.out.print("Precio: ");
                     precio = leer.nextInt();
                     System.out.print("Numero: ");
                     n = leer.nextInt();
                     System.out.print("Año: ");
                     anio = leer.nextInt();
                     System.out.print("Numero de paginas: ");
                     nump = leer.nextInt();
                     revista.setISSN(issn);
                     revista.setTitulo(tit);
                     revista.setPrecio(precio);
                     revista.setNumero(n);
                     revista.setAnio(anio);
                     revista.setNumpag(nump);
                     publicaciones[ctrlpub] = revista;
                     ctrlpub++;
               break;
            case 2:
                     Libro libro = new Libro();
                     System.out.print("ISBN: ");
                     isbn = leer.nextLine();
                     System.out.print("Titulo: ");
                     tit1 = leer.nextLine();
                     System.out.print("Autor: ");
                     autor = leer.nextLine();
                     System.out.print("Edicion: ");
                     edic = leer.nextLine();
                     System.out.print("Precio:  ");
                     precio1 = leer.nextInt();
                     System.out.print("Numero de paginas:  ");
                     nump1 = leer.nextInt();
                     libro.setISBN(isbn);
                     libro.setTitulo(tit1);
                     libro.setAutor(autor);
                     libro.setEdicion(edic);
                     libro.setPrecio(precio1);
                     libro.setNumpag(nump1); 
                     publicaciones[ctrlpub] = libro;
                     ctrlpub++;                    
               break;
            case 3:
                     Periodico periodico = new Periodico();
                     System.out.print("Titulo: ");
                     tit2 = leer.nextLine();
                     System.out.print("Fecha: ");
                     fecha = leer.nextLine();
                     System.out.print("Precio:  ");
                     precio2 = leer.nextInt();
                     System.out.print("Numero de paginas:  ");
                     nump2 = leer.nextInt();
                     periodico.setTitulo(tit2);
                     periodico.setFecha(fecha);
                     periodico.setPrecio(precio2);
                     periodico.setNumpag(nump2);
                     publicaciones[ctrlpub] = periodico;
                     ctrlpub++; 
               break;
            case 4:
                     for(int i = 0; i < ctrlpub; i ++ )
                     {
                        System.out.println("  " + publicaciones [i].getClass());
                        if(publicaciones[i] instanceof Revista)
                        {
                             Revista revistas = new Revista();
                             revistas = (Revista)publicaciones[i];
                             System.out.println("----REVISTA----");
                             System.out.println("ISSN: " + revistas.getISSN());
                             System.out.println("Titulo: " + revistas.getTitulo());
                             System.out.println("Precio: " + revistas.getPrecio());
                             System.out.println("Numero: " + revistas.getNumero());
                             System.out.println("Anio: " + revistas.getAnio());
                             System.out.println("Numero de paginas: " + revistas.getNumpag());
                        }
                     }
               break;
            case 5:
                     for(int i = 0; i < ctrlpub; i ++ )
                     {
                        System.out.println("  " + publicaciones [i].getClass());
                        if(publicaciones[i] instanceof Libro)
                        {
                             Libro libros = new Libro();
                             libros = (Libro)publicaciones[i];
                             System.out.println("----LIBRO----");
                             System.out.println("ISBN: " + libros.getISBN());
                             System.out.println("Titulo: " + libros.getTitulo());
                             System.out.println("Autor: " + libros.getAutor());
                             System.out.println("Edicion: " + libros.getEdicion());
                             System.out.println("Precio: " + libros.getPrecio());
                             System.out.println("Numero de paginas: " + libros.getNumpag());
                        }
                     }
               break;
            case 6:  
                     for(int i = 0; i < ctrlpub; i ++ )
                     {
                        System.out.println("  " + publicaciones [i].getClass());
                        if(publicaciones[i] instanceof Periodico)
                        {
                             Periodico periodicos = new Periodico();
                             periodicos = (Periodico)publicaciones[i];
                             System.out.println("----PERIODICO----");
                             System.out.println("Titulo: " + periodicos.getTitulo());
                             System.out.println("Fecha: " + periodicos.getFecha());
                             System.out.println("Precio: " + periodicos.getPrecio());
                             System.out.println("Numero de paginas: " + periodicos.getNumpag());
                        }
                     }
               break;
            case 7: System.out.println("Adiooos. ");
               System.exit(0);
               break;
            default:
               System.out.println ("Elige una opcion correcta");
         }
      }while(opc!=7);   
   }      
}