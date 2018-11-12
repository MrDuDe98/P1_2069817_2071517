/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

/**
 *
 * @author Turma A
 */
public class Menu {
    public enum Command{
        CreateArmy,
        SeeArmy,
        Play, 
        Exit;
    }
    


    public void printCommands(){
        Command[] commands = Command.values();
        for (int i = 0; i < commands.length; i++) {
            System.out.println(i + " - " + commands[i]);
        }
    }

    public void selectCommand(Command command){
        switch(command) {
                case CreateArmy:
                    System.out.println("Army Creator");
                break;
                case SeeArmy:
                    System.out.println("Your Army!");
                break;
                case Play:
                    System.out.println("Start Game!");
                break;
                case Exit:
                    System.out.println("Quit Game");
                break;
                default: throw new IllegalArgumentException();
        }
    }


    
}
