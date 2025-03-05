/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaexercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Camille
 */
public class Javaexercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Declarando as variáveis a serem utilizadas
        int[] numbers = new int[10];
        int numbersLength = numbers.length;
        int sum = 0;
        double average;
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        //Inicializando loop pedindo os números do array para o usuário
        for (int i = 0; i < numbersLength; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");

            //Verifica se não é um número inteiro, caso não for pede para o usuário digitar novamente e limpa o buffer
            //Apenas para tornar mais intuitivo para o usuÃ¡rio caso retorne um erro
            while (!scanner.hasNextInt()) {
                System.out.print("Ops, parece que voce nao digitou um numero inteiro! Tente novamente. ");
                scanner.next();
                System.out.print("Digite o " + (i + 1) + " numero: ");
            }

            //Armazena os números em um array chamado números
            numbers[i] = scanner.nextInt();
            //Acrescenta a cada número digitado à variável chamada soma
            sum += numbers[i];

            //Verifica qual o número menor e qual o maior, comparando com as variáveis menorNumero e maiorNumero
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }

        }
        //Calculando a média com base na soma e no tamanho do array numeros
        average = (double) sum / numbersLength;
        //Mostrando o resultado para o usuário
        System.out.print("\nOs numeros digitados foram: ");
        System.out.println(Arrays.toString(numbers));
        //Ou podemos fazer com um for
        //for (int i = 0; i < numbersLength; i++){
        // System.out.println("Numero" + " " + (i+1) + ": " + numbers[i]);
        //}
        System.out.println("\nA media e: " + average);
        System.out.println("\nO maior numero: " + maxNumber);
        System.out.println("\nO menor numero: " + minNumber);

        scanner.close();
    }
}
