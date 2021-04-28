/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.farao;

/**
 *
 * @author ramon.simona
 */
public class Farao {

    public static void main(String[] args) {
        char lletres[] = {'c', 'o', 'm', 'o', 's', 'e', 'r', 'a', 'd', 'a', 'r', 'c', 'o', 'n', 'n', 'e', 'k', 'g', 'i', 'k', 'i', 's', 'v', '.', '.', '.'};
        int numeros[] = {23, 24, 25, 18, 19, 5, 6, 7, 20, 15, 17, 8, 10, 11, 4, 3, 12, 2, 16, 14, 9, 21, 0, 1, 13, 22};

        for (int i = 0; i < lletres.length; i++) {
            for (int j = 0; j < lletres.length; j++) {
                if (numeros[j] == i) {
                    System.out.print(lletres[j]);
                }
            }

        }
    }

}
