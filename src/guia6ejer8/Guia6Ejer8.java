/*
Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:

class Uno{
private static int metodo() {
int valor=0;
try {
valor = valor+1;
valor = valor + Integer.parseInt (”42”);
valor = valor +1;
System.out.println(”Valor final del try:” + valor) ;
} catch (NumberFormatException e) {
Valor = valor + Integer.parseInt(”42”);
System.out.println(“Valor final del catch:” + valor);
} finally {
valor = valor + 1;
System.out.println(”Valor final del finally: ” + valor) ;
}
valor = valor +1;

10

System.out.println(”Valor antes del return: ” + valor) ;
return valor;
}
public static void main (String[] args) {
try {
System.out.println (metodo()) ;
}catch(Exception e) {
System.err.println(”Excepcion en metodo() ”) ;
e.printStackTrace();
}
}
}

class Dos{
private static int metodo() {
int valor=0;
try{
valor = valor + 1;
valor = valor + Integer.parseInt (”W”);
valor = valor + 1;
System.out.println(”Valor final del try: ” + valor) ;
} catch ( NumberFormatException e ) {
valor = valor + Integer.parseInt (”42”);
System.out.println(”Valor final del catch: ” + valor) ;
} finally {
valor = valor + 1;
System.out.println(”Valor final del finally: ” + valor) ;
}
valor = valor + 1;
System.out.println(”Valor antes del return: ” + valor) ;
return valor;
}
public static void main (String[] args) {
try{
System.out.println ( metodo ( ) ) ;
} catch(Exception e) {
System.err.println ( ” Excepcion en metodo ( ) ” ) ;
e.printStackTrace();
}
}
}
class Tres{
private static int metodo( ) {
int valor=0;
try{

11

valor = valor + 1;
valor = valor + Integer.parseInt (”W”);
valor = valor + 1;
System.out.println(”Valor final del try: ” + valor);
} catch(NumberFormatException e) {
valor = valor + Integer.parseInt (”W”);
System.out.println(”Valor final del catch: ” + valor);
} finally{
valor = valor + 1;
System.out.println(”Valor final del finally:” + valor);
}
valor = valor + 1;
System.out.println(”Valor antes del return: ” + valor) ;

return valor;
}
public static void main (String[] args) {
try{
System.out.println( metodo ( ) ) ;
} catch(Exception e) {
System.err.println(”Excepcion en metodo ( ) ” ) ;
e.printStackTrace();
}
}
}

 El resultado en pantalla al ejecutar cada una de las clases sería el siguiente:

Clase Uno:

Valor final del try: 44
Valor final del finally: 45
Valor antes del return: 46
46


Clase Dos:

Valor final del catch: 43
Valor final del finally: 44
Valor antes del return: 45
45


Clase Tres:

Valor final del catch: 1
Valor final del finally: 2
Valor antes del return: 3
3


Explicación:
- En la Clase Uno, el bloque `try` se ejecuta correctamente sin lanzar una excepción, por lo que se muestra el mensaje "Valor final del try: 44". Luego, se ejecuta el bloque `finally`, incrementando el valor a 45. Finalmente, se imprime el valor antes del return, que es 46, y se retorna este valor.
- En la Clase Dos, ocurre una excepción `NumberFormatException` dentro del bloque `try` al intentar convertir la cadena "W" a un entero. La excepción es capturada en el bloque `catch`, se suma el valor 42 a la variable y se muestra el mensaje "Valor final del catch: 43". Luego, se ejecuta el bloque `finally`, incrementando el valor a 44. Finalmente, se imprime el valor antes del return, que es 45, y se retorna este valor.
- En la Clase Tres, ocurre una excepción `NumberFormatException` dentro del bloque `try` al intentar convertir la cadena "W" a un entero. La excepción es capturada en el bloque `catch`, se suma el valor 0 a la variable (ya que la conversión falló) y se muestra el mensaje "Valor final del catch: 1". Luego, se ejecuta el bloque `finally`, incrementando el valor a 2. Finalmente, se imprime el valor antes del return, que es 3, y se retorna este valor.
 */
package guia6ejer8;


public class Guia6Ejer8 {
    public static void main(String[] args) {
        
    }
}
