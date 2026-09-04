
public class Recursividad {

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
