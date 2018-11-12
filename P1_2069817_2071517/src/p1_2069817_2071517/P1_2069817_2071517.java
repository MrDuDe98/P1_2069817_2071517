/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_2069817_2071517;

import java.util.Scanner;

/**
 *
 * @author Turma A
 */
public class P1_2069817_2071517 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.printCommands();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza um comando: ");
        int entry = Integer.parseInt(scanner.nextLine());
        Menu.Command command = Menu.Command.values()[entry];
        
        menu.selectCommand(command);
    }
}
