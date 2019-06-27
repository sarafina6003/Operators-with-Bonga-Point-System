/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseif.statements;

/**
 *
 * @author nyawira
 */
import java.util.Scanner;
import java.io.*;

public class Ifelseif_Bonga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int points;
      System.out.println("Enter your Bonga Points:");
      Scanner sn = new Scanner(System.in);
      points =sn.nextInt();
      
      if (points>=0 && points<100){
          System.out.println("5 minutes talktime");
      }
      else if (points>=100 && points<500){
          System.out.println("10 minutes talktime");
      }
      else if (points>=500 && points<1000){
          System.out.println("15 minutes talktime");
      }
      else if (points>1000){
          System.out.println("20 minutes talktime");
      }
    }
}
