package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String marca, modelo, matricula;
        //String cadena, marca = "Honda", modelo = "Civic", matricula = "636638928gt";
        Integer opc = 0, menuExitCounter = 0;

        ArrayList<Coche> lista = new ArrayList<Coche>();

        do {
            System.out.println("TROLLFACE");
            System.out.println("BASE DE DADATOS COCHES");
            System.out.println("1. Añadir coche");
            System.out.println("2. Consultar Coches \n");
            System.out.println("BASE DE DATOS PERSONAS");
            System.out.println("3. Añadir propietario");
            System.out.println("4. Consultar propietarios \n");


            System.out.println("5. Salir");
            System.out.println("Escoje una opcion:");
            opc = Integer.parseInt(br.readLine());
            switch (opc) {
                case 1:
                    System.out.println("Introduce marca del coche:");
                    marca = br.readLine();
                    System.out.println("Introduce modelo del coche");
                    modelo = br.readLine();
                    System.out.println("Introduce matricula del coche");
                    matricula = br.readLine();
                    //Añadir coche a la lista
                    lista.add(new Coche(marca, modelo, matricula));

                    break;
                case 2:
                    for (Coche coche : lista) {
                        System.out.println("CocheID: " + coche);
                        System.out.print("Marca: " + coche.marca);
                        System.out.print(" Modelo: " + coche.modelo);
                        System.out.print(" Matricula: " + coche.matricula + "\n\n");
                    }
                    break;
                case 3:
                    System.out.println("REGISTRO DE VEHICULOS");
                    menuExitCounter++;
                    break;
                case 4:
                    System.out.println("CONSULTA DE PROPIETARIOS");
                    menuExitCounter++;
                    break;
                case 5:
                    System.out.println("SALIR DE LA APP");
                    menuExitCounter++;
                    break;
                default:
                    System.out.println("Elige una opcion!");
                    menuExitCounter++;
                    break;
            }
        } while (menuExitCounter < 1);
    }
}
