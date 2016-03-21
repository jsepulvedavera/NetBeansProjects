package lab04james;
//PYM1501 ejerc vie/18/03/2016

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab04James {

    public static void main(String[] args) throws IOException {
        int edad;
        String smilitar, sexo, titulo;
        
        System.out.println("POSTULACIONES");
        
        System.out.println("Sexo Hombre (H) - Mujer (M) --> ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        sexo = br.readLine();   
        
        if (sexo.toLowerCase().equals("h")) {
            
            System.out.println("Edad entre 20 y 25 años --> ");
            br = new BufferedReader(new InputStreamReader(System.in));
            edad = Integer.parseInt(br.readLine());
            
            if (edad >= 20 && edad <= 25) {
                
                System.out.println("Situación Militar SI (S) - No (N) --> ");
                br = new BufferedReader(new InputStreamReader(System.in));
                smilitar = br.readLine();
                
                if (smilitar.toLowerCase().equals("s")) {
                    System.out.println("Califica !!!");
                } else {
                    System.out.println("No Califica");
                }
            }
            else {
                System.out.println("No Califica");
            }
        } else {
            
            System.out.println("Posee Título SI (S) - No (N) --> ");
            br = new BufferedReader(new InputStreamReader(System.in));
            titulo = br.readLine();
            
            if (titulo.toLowerCase().equals("s")) {
                System.out.println("Califica !!!");
            } else {
                System.out.println("No Califica");
            }
        }
    }
}
