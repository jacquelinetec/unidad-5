/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosu4;

/**
 *
 * @author Jacqueline Sarabia
 */
public class Metodosu4 {

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        double resultadosumar = sumar(5,3);
        System.out.println("la suma es " + resultadosumar);
        
        double resultadoresta = restar(5,3);
        System.out.println("la resta es " + resultadoresta);
        
        double resultadodivision = dividir(5,3);
        System.out.println("la multiplicacion es " + resultadodivision);
        
        double resultadodividir = multiplicar(6,3);
        System.out.println("la division es " + resultadodividir);

    }

} 
