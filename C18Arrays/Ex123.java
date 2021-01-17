package C18Arrays;

import java.util.Scanner;

public class Ex123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First array is: ");
		int[] A = Methods.readArray(sc);
		System.out.print("A has the elements:\n");
		Methods.printArray(A, A.length);
		
		System.out.println("Second array is: ");
		int[] B = Methods.readArray(sc);
		System.out.print("B has the elements:\n");
		Methods.printArray(B, B.length);
		

		int[] C = Methods.arrayDifference(A, B);
		
		System.out.print("1. Diferenta dintre A si B este: ");
		Methods.printArray(C, C.length);
		

		int[] D = Methods.arrayIntersection(A, B);
		
		System.out.print("2.1 Intersectia dintre A si B este: ");
		Methods.printArray(D, D.length);
		
		
		int[] E = Methods.arrayUnion(A, B);
		
		System.out.print("2.2 Reuniunea dintre A si B este: ");
		Methods.printArray(E, E.length);
		
		
		sc.close();
	}
}

