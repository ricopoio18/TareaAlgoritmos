
public class Recursividad {


    public static int buscarXEnCadena(int[] cadenaNumeros, int numeroAEncontrar, int posicion){
        if(cadenaNumeros.length == posicion) {
            return -1;
        } else if(cadenaNumeros[posicion] == numeroAEncontrar){
            return numeroAEncontrar;
        }
        return buscarXEnCadena(cadenaNumeros, numeroAEncontrar,posicion + 1);
    }

    public static int valorMasGrandeArreeglo(int[] cadenaNumeros, int posicion, int numeroMasGrande){
        if(posicion == cadenaNumeros.length){
            return numeroMasGrande;
        }
        if (cadenaNumeros[posicion] > numeroMasGrande){
            numeroMasGrande = cadenaNumeros[posicion];
        }
        return valorMasGrandeArreeglo(cadenaNumeros,posicion + 1, numeroMasGrande);
    }

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

    public static int cantidadOrejasConejo(int cantidadConejos, int cantidadOrejas){
        if(cantidadConejos == 0){
            return cantidadOrejas;
        }
        return cantidadOrejasConejo(cantidadConejos-1, cantidadOrejas + 2);
    }

    public static boolean caracterApareceAntes(String cad, char c1, char c2){
        if (cad == null || cad.length() < 2) {
            return false;
        }
        if (cad.charAt(0) == c1 && cad.charAt(1) == c2) {
            return true;
        }
        return caracterApareceAntes(cad.substring(1), c1, c2);
    }
}
