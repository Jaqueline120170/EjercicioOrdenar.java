package edu.EjercicioOrdena.Inicio;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		int i, j, k;
        i = solicitarNumero();
        j = solicitarNumero();
        k = solicitarNumero();
        if (i>=j & i>=k)
        {
            if (j >= k)
            {
                System.out.println("Orden: " + i + j + k);
            }
            else
            {
                System.out.println("Orden: " + i + k + j);
            }
        }else if (j>=i & j>=k)
        {
            if (i >= k)
            {
                System.out.println("Orden: " + j + i + k);
            }
            else
            {
                System.out.println("Orden: " + j + k + i);
            }
        } else if (k>=i & k>=j)
        {
            if (i >= j)
            {
                System.out.println("Orden: " + k + i + j);
            }
            else
            {
                System.out.println("Orden: " +k + j + i);
            }
        }
       
    }

    static private int solicitarNumero(){
        int numero;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba un número: ");
        numero = sc.nextInt();

        return numero;
	}

}
