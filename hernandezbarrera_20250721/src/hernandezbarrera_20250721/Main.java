/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandezbarrera_20250721;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("50 Grados Centigrados a Farenheit: "+celcius_a_farenheit()+" f");
        System.out.println("50 Grados Centigrados a Kelvin: "+celsius_a_kelvin()+" k");
        System.out.println("50 Grados Centigrados a Rankine: "+celsius_a_rankine()+" r");
        
        System.out.println("30 Grados Farenheit a Celsius: "+ farenheit_a_celsius()+" c");
        System.out.println("30 Grados Farenheit a Kelvin: "+ farenheit_a_kelvin()+" k");
        System.out.println("30 Grados Farenheit a Rankine: "+ farenheit_a_rankine()+" r");

        System.out.println("30 Grados kelvin a Celsius: "+ kelvin_a_celsius()+" c");
        System.out.println("30 Grados kelvin a Farenheit: "+ kelvin_a_farenheit()+" f");
        System.out.println("30 Grados kelvin a Rankine: "+ kelvin_a_rankine()+" r");

        System.out.println("30 Grados Rankine a Celsius: "+ rankine_a_celsius()+" C");
        System.out.println("30 Grados Rankine a Farenheit: "+ rankine_a_farenheit()+" C");
        System.out.println("30 Grados Rankine a Kelvin: "+ rankine_a_kelvin()+" C");

        
        // TODO code application logic here
    }
    public static double celsius_a_farenheit(){
        double grados_centigrados = 50.0;
        return (grados_centigrados * 9/5) + 32;
    }
    
    public static double celsius_a_kelvin(){
        double grados_centigrados = 50.0;
        return grados_centigrados + 273.15;
    }
    
    public static double celsius_a_rankine() {
        double grados_centigrados = 50.0;
        return ((grados_centigrados *9)/5) + 491.67;
    }
    
    public static double farenheit_a_celsius(){
        double grados_farenheit = 30.0;
        return ((grados_farenheit -32) * 5)/9;
    }
    
    public static double farenheit_a_kelvin(){
        double grados_farenheit = 30.0;
        return (((grados_farenheit -32) * 5)/9) + 273.15;
    }
     
    public static double farenheit_a_rankine(){
        double grados_farenheit = 30.0;
        return grados_farenheit + 459.67;
    }
    
    public double kelvin_a_celsius(){
        double grados_kelvin = 30.0;
        return grados_kelvin - 273.15;
    }

    public double kelvin_a_farenheit(){
        double grados_kelvin = 30.0;
        return ((grados_kelvin -273.15) * 9/5) + 32;
    }

    public double kelvin_a_rankine(){
        double grados_kelvin = 30.0;
        return grados_kelvin * 1.8;
    }

    public double rankine_a_celsius(){
        double grados_rankine = 30.0;
        return (grados_rankine - 491.67) * 5/9;
    }

    public double rankine_a_kelvin(){
        double grados_rankine = 30.0;
        return grados_rankine * 5/9;
    }

    public double rankine_a_farenheit(){
        double grados_rankine = 30.0;
        return grados_rankine - 459.67;
    }


}
