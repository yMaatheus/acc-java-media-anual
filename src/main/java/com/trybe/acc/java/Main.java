package com.trybe.acc.java;

import java.util.Scanner;

/**
 * Class Main.
 */
public class Main {

  /**
   * Initial Method.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual é o seu nome?");

    String name = scanner.next();

    System.out.println("Entre com as notas das provas:");

    try {
      System.out.println("Avaliação 1:");

      double nota1 = Double.parseDouble(scanner.next());

      System.out.println("Avaliação 2:");

      double nota2 = Double.parseDouble(scanner.next());

      System.out.println("Avaliação 3:");

      double nota3 = Double.parseDouble(scanner.next());

      System.out.println("Avaliação 4:");

      double nota4 = Double.parseDouble(scanner.next());

      Nota nota = new Nota();
      double media = nota.calcularMedia(nota1, nota2, nota3, nota4);

      StringBuilder sb = new StringBuilder();

      sb.append("Olá, ").append(name).append(", sua média é ").append(media);

      System.out.println(sb.toString());
    } catch (Exception e) {
      System.out.println("Entre com uma opção válida!");
    }

    scanner.close();
  }

}
