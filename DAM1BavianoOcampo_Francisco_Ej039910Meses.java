/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dam1bavianoocampo_francisco_ej039910meses;

/**
 *
 * @author Franb
 */
public class DAM1BavianoOcampo_Francisco_Ej039910Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};        
        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};        
        int [] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        
        System.out.println("-Listado en dos lineas de todos los meses en Español e Inglés: ");
        
        for(int contador = 0; contador < meses.length ; contador++){
            
            if( contador != (meses.length - 1) ){ 
                System.out.print(meses[contador] + ", ");
            }else{
                System.out.println(meses[contador] + ".");
            }        
        }
        
        for (int contador = 0; contador < month.length ; contador++){
            
            if( contador != (month.length - 1) ){
                System.out.print(month[contador] + ", ");
            }else{
                System.out.println(month[contador] + ".");
            }      
        }

        System.out.println("\n-Listado de meses en Español con más de 6 letras y que tengan 30 días:");
        
        for(int contador = 0, MINLETRAS = 6, DIAS = 30; contador < meses.length; contador++){
            
            if(meses[contador].length() > MINLETRAS && dias[contador] == DIAS){
                System.out.print(meses[contador] + ", ");
            }
        }
        
        System.out.println("\n\n-Listado de meses de 31 dias con el nombre en el idioma que sea más largo, o Español si son iguales:");
        
        for(int contador = 0, DIAS = 31; contador < meses.length; contador++){
            
            if(meses[contador].length() < month[contador].length() && dias[contador] == DIAS){
                System.out.print(month[contador] + ", ");
            }else{
                System.out.print(meses[contador] + ", ");
            }          
        }

        System.out.println("\n\n-Dada una fecha en formato dd-mm-aaaa indicar si es incorrecta.");
        
        String fecha = "13-2-2023"; 
        String[] partes = fecha.split("-");     // Creamos un arrays en el que los tres elementos que tiene son el dia, el mes y el año de la fecha anterior.
                                                // Esto se hace al utilizar el .split que divide la fecha a partir del caracter que le indiques, en este caso el -.
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int año = Integer.parseInt(partes[2]);
 
        //Las condiciones que hacen que la fecha este mal:
            if ( año < 0 || año > 2200 ){
                
                System.out.println("La fecha es incorrecta");
                
            }else if ( mes < 1 || mes > 12 ){
                
                System.out.println("La fecha es incorrecta");
                
            }else if ( dia < 1 || dia > 31 ){
                
                System.out.println("La fecha es incorrecta");
                
            }else if ( dia > 30 && (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11 )){
                
                System.out.println("La fecha es incorrecta");
                
            }else if( mes == 2 && dia == 29 && !((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) ){
                
                System.out.println("La fecha es incorrecta");
                
            }else
                
            System.out.println("La fecha es correcta ---> " + dia + "-" + mes + "-" + año);             
                
        
        /*
        Explicacion del calculo del año bisiesto:
            
            Si el año es divisible entre 4, es decir con resto 0, el año puede ser bisiesto.
            
            Si la anterior condicion se cumple, calcular si el año no es divisible entre 100, es decir con resto distinto a 0, 
            si es asi, el año puede ser bisiesto.
            
            Si las dos condiciones anteriores se cumplen, dividir el año entre 400 y si el resto es 0,
            el año es bisiesto.
        */
        
    }
    
}
