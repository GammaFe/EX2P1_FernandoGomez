package com.mycompany.ex2p1_fernandogomez;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2P1_FernandoGomez {

    public static void main(String[] args) {

       Juego();
    }
       public static void Juego() {
        String x = "";
        ArrayList<Planta> plantas = new ArrayList();
        System.out.println("Porfavor ingrese el nombre de su granja");
        Scanner entrada = new Scanner(System.in);
        String granja = entrada.nextLine();
        int cont = 1;
        while (true) {
            System.out.println("Binevenido a la granja: " + granja);
            System.out.println("    Que desea hacer     ");
            System.out.println("1.-Plantar Cosechas\n 2.-Cosechar las cosechas\n 3.-Conseguir animales\n 4.-Vender Cosas\n 5.-Dormir");
            int decicion = entrada.nextInt();
            switch (decicion) {
                case 1:
                    System.out.println("Cuantas desea plantar");
                    int num = entrada.nextInt();
                    String Plantas;
                    Planta plants = new Planta(num, 2, 2, 3);
                    System.out.println("PLANTANDO COSECHAS ....");
                    break;
                case 2:
                    System.out.println("Las cosechas han sido cosechadas");
                    break;
                case 3:
                    System.out.println("Que animales desea?");
                    System.out.println("1.conejos-> 150 2.vacas-> 350");
                    int anim = entrada.nextInt();
                    if (anim == 1) {
                        System.out.println("Cuantos conejos desea: ");
                        int animal = entrada.nextInt();
                        Vaca vaca = new Vaca();
                    }
                    break;
                case 4:
                    System.out.println("Vender animales que animales desea vender: ");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("El jugador ha decidodo ser diferente y termina este ciclo\n"
                            + "y a causa de esto el ha sido forzado fuera del ciclo y ahora *a tocar grama*.\n"
                            + "todo por no usar un numero pre etablecido");
                    System.exit(0);
                    break;
            }
            cont = cont+1;
        }
    }
    
}
