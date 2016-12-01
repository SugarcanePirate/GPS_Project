/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpsproject;

import LogicPackage.*;
import static LogicPackage.Variables.DIRECTORIA;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author David
 */
public class GPSProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nomeDirectoria = System.getProperty("user.home");

        nomeDirectoria = nomeDirectoria + File.separator + DIRECTORIA;

        File directoria = new File(nomeDirectoria);

        if (!directoria.exists()) {
            try {
                directoria.mkdir();
            } catch (Exception e) {
            }

        }

    }

}
