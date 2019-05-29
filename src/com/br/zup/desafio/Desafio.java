package com.br.zup.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		List<Integer> senha = new ArrayList<Integer>();
		List<Integer> tentativa = new ArrayList<Integer>();
		List<String> resultado = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);

		Random random = new Random();

		for (int i = 0; i < 5; i++) {

			senha.add(random.nextInt(5));

		}

		for (int x = 15; x > 0; x--) {

			System.out.println("Neste jogo você tentara adinvinhar uma senha de 5 digitos. \n" + "Vocẽ tem " + x
					+ " tentativas." + "Boa sorte...\n \n -----------------------------------------");

			for (int i = 0; i < 5; i++) {

				System.out.println("Digite um numero inteiro de 0 e 5");
				tentativa.add(scan.nextInt());

			}

			for (int i = 0; i < 5; i++) {
				if (senha.get(i) == tentativa.get(i)) {
					
					resultado.add("O");
				} else {
					resultado.add("X");
				}

			}

			if (senha.get(0) == tentativa.get(0) && senha.get(1) == tentativa.get(1) && senha.get(2) == tentativa.get(2)
					&& senha.get(3) == tentativa.get(3) && senha.get(4) == tentativa.get(4)) {

				System.out.println("Parabéns você acertou a senha\n" + " Senha = " + tentativa);

				x = -1;

			} else {
				System.out.println("\n \n *******TENTE NOVAMENTO******\n " + "resultado = " + resultado + "\n \n");
			}

			tentativa.clear();
			resultado.clear();

			//System.out.println(senha);

		}

	}

}
