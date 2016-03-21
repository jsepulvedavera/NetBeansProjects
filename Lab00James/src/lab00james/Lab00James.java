package lab00james;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab00James {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String nombre = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        nombre = br.readLine();
        System.out.printf("Bienvenido: "+nombre);
    }

}
