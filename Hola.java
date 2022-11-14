/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.curso.uno;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.logging.Logger;

/**
 *
 * @author jlunaque
 */
public class Hola {

    private static Logger LOGGER = Logger.getLogger("Main");
    // Funcion que dada una cadena de texto nos dice cuantas palabras unicas hay

    /*
    public static int cuentaPalabras(String texto){
        
        HashSet <String> uniqueWords = new HashSet<>();
        String[] parts = texto.split("\\s+");
        
        for (int i = 0; i < parts.length; i++){
            parts[i] = parts[i].replaceAll("[^\\w]", "");
        
        uniqueWords.add(parts[i]);
        }
        
        return uniqueWords.size();
        
    }
     */
    public static void main(String[] args) {

        LOGGER.info("Logging information");

        /*
        int numero1 = 3;
        int numero2 = 6;
        int numero3 = 0;
        numero3 = numero1 + numero2;
        int[][] matriz = new int[2][4]; // Matriz 2x4
        String cadena = "el bicho";
        int sumatoria = 0;
        int m = 0;
        while(m<=10){
            sumatoria+=m;
            m++;
        }
        System.out.println(sumatoria);
        int sumatoria1=0;
        for(int j=0; j<=10;j++){
            sumatoria1+=j; // incrementa j en 1
        }
        System.out.println(sumatoria1);
        int array[] = new int[11];
        for(int j=0; j<=10;j++){
            array[j]=j;
        }
        int sumatoria2=0;
        for(int num:array){
            sumatoria2+= num;
        }
        System.out.println(sumatoria2);
        for (int i=0;i<10;i++) {
            System.out.println("Hello World! " + numero1 + " " + cadena);
         */
 /*
        Student Javi = new Student(24, "Hombre", "Javier");
        Student Edu = new Student();
        Student Angel = new Student();
        
        System.out.println(Javi.getNombre());
        Javi.setNombre("Javi");
        System.out.println(Javi.getNombre());
        Edu.setEdad(24);
        System.out.println(Edu.getEdad());
        
        CentroEducativo cole = new CentroEducativo("San Juan", 1970);
        
        ArrayList<Student> students = new ArrayList();
        
        for(int i=0;i<10;i++){
            Student student1 = new Student(22, "Hombre", "Paco"+i);
            students.add(student1);
        }
        
        students.add(Edu);
        cole.setStudents(students);
        
        Universidad Ugr = new Universidad("Universidad de Granada", 1937);
        System.out.println(Ugr.getNumberstud());
         */
        Scanner teclado = new Scanner(System.in);

        // Juego del piedra papel tijeras
        /*
        System.out.println("Juego piedra-papel-tijera");
        
        
        Random randomNumber = new Random();
        int computerOption;
        
        int playerNumber;
        String keepPlaying = "";
        
        while(!keepPlaying.equals("Exit") ){    // usamos equal() para comparar strings
            System.out.println("Indique su seleccion [1 = Piedra, 2 = Papel, 3 = Tijera]: ");
            playerNumber = 0;
            while(playerNumber < 1 || playerNumber > 3){
                System.out.println("Introduzca un numero del 1 al 3: ");    
                playerNumber = teclado.nextInt();
            
            }
            computerOption = randomNumber.nextInt(3) + 1;
            switch (playerNumber){
                case 1:
                    if(computerOption == 1){
                        System.out.println("Empate a piedras");
                    }
                    if(computerOption == 2){
                        System.out.println("Papel gana a piedra: Has perdido!");
                    }
                    if(computerOption == 3){
                        System.out.println("Piedra gana a tijeras: Has ganado!");
                    }
                    break;
                case 2:
                    if(computerOption == 1){
                        System.out.println("Papel gana a piedra: Has ganado!");
                    }
                    if(computerOption == 2){
                        System.out.println("Empate a papel");
                    }
                    if(computerOption == 3){
                        System.out.println("Tijeras gana a papel: Has perdido!");
                    }
                    break;
                case 3:
                    if(computerOption == 1){
                        System.out.println("Piedra gana a tijeras: Has perdido!");
                    }
                    if(computerOption == 2){
                        System.out.println("Tijeras gana a papel: Has ganado!");
                    }
                    if(computerOption == 3){
                        System.out.println("Empate a tijeras");
                    }
                    break;
            }
            System.out.println("Si no quieres jugar más escribe: Exit");
            keepPlaying = teclado.next();
        }
         */
        // PriorityQueue es una cola que ordena los elementos segun un coste que tu estableces
        // en los metodos compareTo y equals
        /*
        PriorityQueue <Patient> pq = new PriorityQueue<Patient>();
        Patient Javi = new Patient(48);
        Patient Angel = new Patient(53);
        Patient CR7 = new Patient(27);
        
        pq.add(CR7);
        pq.add(Angel);
        pq.add(Javi);
        
        for(Patient p: pq){
            System.out.println(p.getRisk());
        }
        
        // En cada poll te coge el primer elemento de la cola de PriorityQueue y te la elimina
        System.out.println(pq.poll().getRisk());
        System.out.println(pq.poll().getRisk());
        System.out.println(pq.poll().getRisk());
        
        
        
        
        phoneBook agenda = new phoneBook();
        agenda.addUser("CR7", "123456789");
        agenda.addUser("Javi", "660079571");
        System.out.println(agenda.getPhoneNumber("CR7"));
        String user;
        String phone;
        System.out.println("Introduzca el usuario:");
        user = teclado.next();
        System.out.println("Introduzca el telefono:");
        phone = teclado.next();
        agenda.addUser(user, phone);
        System.out.println(agenda.getPhoneNumber(user));
        
        
        GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("America/New_York"));
        System.out.println(cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
         */
 /*
        Scanner teclado1 = new Scanner(System.in);
        int userOption = 0;
        UserPokemon Ash = new UserPokemon();
        while (userOption != 5) {
            System.out.println("Indique lo que quiere realizar: [1 = Ver su equipo Pokemon, 2 = Capturar un Pokemon, 3 = Entrenar un Pokemon a su elección, 4 = Combate Pokemon]: ");
            userOption = teclado.nextInt();

            if (userOption == 1) {
                System.out.println(Ash.showTeam());
            } else if (userOption == 2) {
                Ash.Catch();
            } else if (userOption == 3) {
                System.out.println("Elija el Pokemon que quiere entrenar: ");
                int pokemonTrain = teclado1.nextInt();
                Ash.Train(pokemonTrain);
            } else if (userOption == 4) {
                System.out.println("Elija el Pokemon con el que quiera combatir: ");
                int pokemonBattle = teclado1.nextInt();
                if (pokemonBattle > Ash.pokeTeam.size()) {
                    System.out.println("No tiene tantos Pokemons en su equipo");
                } else {
                    Ash.Fight(pokemonBattle);
                }

            }
        }
        
         */
 /*
        Scanner teclado2 = new Scanner(System.in);
        int catalogueOption = 0;
        VendingMachine machinita = new VendingMachine();
        System.out.println("Indique el producto que desea: 0 = " + machinita.catalogue.get(0).getName() + ", " + "1 = " + machinita.catalogue.get(1).getName());
        catalogueOption = teclado2.nextInt();
         */
        Scanner teclado2 = new Scanner(System.in);
        int userOption = 0;
        UsersBase database = new UsersBase();
        User javi = new User();
        String newname;
        String newpassword;
        while (userOption != 6) {
            System.out.println("En primer lugar, debe iniciar sesión; para ello pulse 1: ");
            userOption = teclado2.nextInt();

            if (userOption == 1) {
                if (database.logInMember(javi.name) && database.logInPassword(javi.name, javi.password)) {
                    System.out.println("Bienvenido");
                } else {
                    System.out.println("No está registrado, introduzca un nombre de usuario, un email y una contraseña: ");
                    System.out.println("Nombre de usuario: ");
                    javi.name = teclado2.next();
                    System.out.println("Email: ");
                    javi.email = teclado2.next();
                    System.out.println("Introduzca una contraseña: ");
                    javi.password = teclado2.next();
                }
            }

            System.out.println("Ya se encuentra dentro de nuestra plataforma, introduzca un número para seleccionar lo que desee");
            System.out.println(" 2 -> Establecer pregunta de seguridad ");
            System.out.println(" 3 -> Modificar el nombre de usuario ");
            System.out.println(" 4 -> Modificar contraseña ");
            System.out.println(" 5 -> Enviar mensaje a otro usuario ");
            System.out.println(" 6 -> Log out ");
            userOption = teclado2.nextInt();
            if (userOption == 2){
                System.out.println("Introduza su pregunta de seguridad: ");
                javi.secQuestion = teclado2.next();
            } else if (userOption == 3){
                newname = teclado2.next();
                javi.setName(newname);
            } else if (userOption == 4){
                newpassword = teclado2.next();
                javi.setPassword(newpassword);
            } else if (userOption == 5){
                Message text = new Message();
            }
        }
        
        System.out.println("Ha abandonado la sesión");

    }

}

