/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elcan
 */
public class Utils {

    public static String requireText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title + ":");
        String answer = sc.nextLine();
        return answer;

    }
    public static int requireNumber(String title ){
         Scanner sc = new Scanner(System.in);
        System.out.println(title + ":");
       int answer = sc.nextInt();
        return answer;
        
    }
    public static int Random(int low , int high ){
     Random r = new Random();
     return r.nextInt(high-low)+low;
        
        
    }
    

}
