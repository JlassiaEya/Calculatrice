package com.example;

public class App {
    public static void main(String[] args) {
        Calcul calcul = new Calcul();

        int a = 5;
        int b = 3;

        int somme = calcul.additionner(a, b);
        int produit = calcul.multiplier(a, b);

        System.out.println("Résultats du calcul :");
        System.out.println(a + " + " + b + " = " + somme);
        System.out.println(a + " * " + b + " = " + produit);
    }
}
