/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author CicloM
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        final char CAR_MIN = 'A';
        final char CAR_MAX = 'Z';
        char APELLIDO = (char) (RND.nextInt(CAR_MAX - CAR_MIN + 1) + CAR_MIN);
        System.out.printf("Letra de Inicio de Examen...: %c %n", APELLIDO);
    }

}
