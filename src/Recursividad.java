
public class Recursividad {
    

    public static int localizarYSumar(String cadena){

        if (cadena == null || cadena.isEmpty()) {
            return 0;
        }
        int suma = 0;
        char actual = cadena.charAt(0);
        if(actual >= '0' && actual <= '9' ){
            suma = actual - '0';
        }
        return suma + localizarYSumar(cadena.substring(1));
    }

    public static int buscarXEnCadena(int[] cadenaNumeros, int numeroAEncontrar, int posicion){
        if(cadenaNumeros.length == posicion) {
            return -1;
        } else if(cadenaNumeros[posicion] == numeroAEncontrar){
            return numeroAEncontrar;
        }
        return buscarXEnCadena(cadenaNumeros, numeroAEncontrar,posicion + 1);
    }
}
