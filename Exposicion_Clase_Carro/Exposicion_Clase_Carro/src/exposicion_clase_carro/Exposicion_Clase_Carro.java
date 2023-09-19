/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exposicion_clase_carro;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author casti
 */
public class Exposicion_Clase_Carro {

    public static Scanner lea = new Scanner(System.in);
    public static Scanner lea1 = new Scanner(System.in);
    public static Carro car = new Carro();

    public static void main(String[] args) {
        ArrayList<Carro> carro = new ArrayList();
        boolean seguir = true;
        while (seguir) {
            int opciones = menu();
            switch (opciones) {
                case 1 -> {
                    Carro nuevoC = preguntas();
                    carro.add(nuevoC);
                }
                case 2 -> {
                    imprimir(carro);
                }
                case 3 -> {
                    imprimir(carro);
                    int num = 0;
                    do {
                        System.out.println("ingrese el numero de la lista que desea eliminar:");
                        num = lea.nextInt();
                    } while (num <= 0 || num > carro.size());
                    carro.remove(num - 1);
                }
                case 4 -> {
                    int num = 0;
                    imprimir(carro);
                    do {
                        System.out.println("ingrese el numero de la lista que desea modificar:");
                        num = lea.nextInt();
                    } while (num <= 0 || num > carro.size());
                    boolean seguir1 = true;
                    num--;
                    while (seguir1) {
                        System.out.println("1. Modelo:");
                        System.out.println("2. Marca:");
                        System.out.println("3. Transmision:");
                        System.out.println("4. Motor:");
                        System.out.println("5. Color:");
                        System.out.println("6. Ruedas:");
                        System.out.println("7. Rines:");
                        System.out.println("8. Matricula:");
                        System.out.println("9. Año:");
                        System.out.println("10. Salir:");
                        int opcion = lea.nextInt();
                        switch (opcion) {
                            case 1 -> {
                                System.out.println("Ingrese el modelo de su vehículo:");
                                String modelo = lea1.nextLine();
                                carro.get(num).setModelo(modelo);
                            }
                            case 2 -> {
                                System.out.println("Ingrese la marca de su vehículo:");
                                String marca = lea1.nextLine();
                                carro.get(num).setMarca(marca);
                            }
                            case 3 -> {
                                System.out.println("Ingrese el tipo de transmisión de su vehículo:");
                                String Transmision = lea1.nextLine();
                                carro.get(num).setTransmision(Transmision);

                            }
                            case 4 -> {
                                System.out.println("Ingrese el tipo de motor de su vehículo:");
                                String motor = lea1.nextLine();
                                carro.get(num).setMotor(motor);

                            }
                            case 5 -> {
                                System.out.println("Ingrese el color de su vehículo:");
                                String color = lea1.nextLine();
                                carro.get(num).setColor(color);

                            }
                            case 6 -> {
                                System.out.println("Ingrese el tipo de ruedas de su vehículo:");
                                String ruedas = lea1.nextLine();
                                carro.get(num).setRuedas(ruedas);

                            }
                            case 7 -> {
                                System.out.println("Ingrese el tipo de rines de su vehículo:");
                                String rines = lea1.nextLine();
                                carro.get(num).setRines(rines);

                            }
                            case 8 -> {
                                System.out.println("Ingrese su matricula:");
                                String matricula = lea1.nextLine();
                                carro.get(num).setMatricula(matricula);

                            }
                            case 9 -> {
                                System.out.println("ingrese el año de su vehículo:");
                                int year = lea.nextInt();
                                carro.get(num).setAño(year);

                            }
                            case 10 -> {
                                seguir1 = false;
                            }
                            default -> {

                            }
                        }
                    }
                }
                case 5 -> {
                    seguir = false;
                }
                default -> {
                    System.out.println("Error");
                }
            }
        }
    }

    public static int menu() {
        System.out.println("1.Agregar un nuevo carro");
        System.out.println("2.Ver carros listados");
        System.out.println("3.Eliminar carro de la lista");
        System.out.println("4.Modificar carro");
        System.out.println("5.Salir");
        int opciones = lea.nextInt();
        return opciones;
    }

    public static void imprimir(ArrayList<Carro> carro) {
        for (int i = 0; i < carro.size(); i++) {
            System.out.println("    Carro:" + (i + 1));
            System.out.println("Modelo: " + carro.get(i).getModelo());
            System.out.println("Marca: " + carro.get(i).getMarca());
            System.out.println("Matricula: " + carro.get(i).getMatricula());
            System.out.println("Color: " + carro.get(i).getColor());
            System.out.println("Motor: " + carro.get(i).getMotor());
            System.out.println("Transmision: " + carro.get(i).getTransmision());
            System.out.println("Ruedas: " + carro.get(i).getRuedas());
            System.out.println("Rines: " + carro.get(i).getRines());
            System.out.println("Año: " + carro.get(i).getAño());
        }
    }

    public static Carro preguntas() {
        System.out.println("Ingrese el modelo de su vehículo:");
        String modelo = lea1.nextLine();
        System.out.println("Ingrese la marca de su vehículo:");
        String marca = lea1.nextLine();
        System.out.println("Ingrese el tipo de transmisión de su vehículo:");
        String transmision = lea1.nextLine();
        System.out.println("Ingrese el tipo de motor de su vehículo:");
        String motor = lea1.nextLine();
        System.out.println("Ingrese el color de su vehículo:");
        String color = lea1.nextLine();
        System.out.println("Ingrese el tipo de ruedas de su vehículo:");
        String ruedas = lea1.nextLine();
        System.out.println("Ingrese el tipo de rines de su vehículo:");
        String rines = lea1.nextLine();
        System.out.println("Ingrese su matricula:");
        String matricula = lea1.nextLine();
        System.out.println("ingrese el año de su vehículo:");
        int year = lea.nextInt();
        Carro carro = new Carro(modelo, marca, transmision, motor, color, ruedas, rines, matricula, year);
        return carro;
    }
}
