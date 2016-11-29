/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpsproject;

import java.io.File;

/**
 *
 * @author David
 */
public class GPSProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x = System.getProperty("user.home");

        x = x + File.separator + "5 minute Chef";
        System.out.println(x);

        File directory = new File(x);
        if (!directory.exists()) {
            try {
                directory.mkdir();
            } catch (Exception e) {
                System.out.println("Erro a criar pasta.");
            }

            if (directory.exists()) {
                System.out.println("Pasta criada.");
            }
        }

    }

}
