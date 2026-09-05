//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] cadenaNumeros = {1,8,3,4};
        System.out.println(Recursividad.buscarXEnCadena(cadenaNumeros, 4, 0));
        System.out.println(Recursividad.valorMasGrandeArreeglo(cadenaNumeros, 0, 0));
        System.out.println(Recursividad.caracterApareceAntes("Parangaricutirimicuaro", 'u', 'c'));
        System.out.println(Recursividad.cantidadOrejasConejo(70,0));
        System.out.println(Recursividad.localizarYSumar("Nuevo Leon 298"));
    }
}