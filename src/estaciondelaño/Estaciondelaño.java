/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estaciondelaño;

/**
 *
 * @author jcplo
 */
public class Estaciondelaño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingresar número del mes: ");
    int mes = scanner.nextInt();       
    String estacion = "";
    if (mes == 12 || mes == 1 || mes == 2){
    estacion = "Invierno";
    }else if (mes == 3 || mes == 4 || mes == 5){
    estacion = "Primavera";
    }else if (mes == 6 || mes == 7 || mes == 8){
    estacion = "Verano";
    }else if (mes == 9 || mes == 10 || mes == 11){
    estacion = "Otoño";
    }else {
    System.out.println("El número de mes debe estar entre 1 y 12.");
    scanner.close();
    System.out.println("La estación es: " + estacion);
    scanner.close();
    } 
}
