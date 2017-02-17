package com.epn;

import java.util.Arrays;
import java.util.Scanner;

public class Shell{
	 
	  public static void shell(int[] array) {
		//variables para el metodo
	    int interior, exterior;  
	    int temp;
	  //variables para tomar el tiempo
	    long tiempo_inicio;		
	    long tiempo_final;
	    
	    tiempo_inicio =System.currentTimeMillis();	//cuando se ejecuta el programa comienza tomando el tiempo
	    
	    int a = 1;	
	    while (a <= array.length / 3) {
	      a = a * 3 + 1;
	    }
	    while (a > 0) {
	      for (exterior = a; exterior < array.length; exterior++) {
	        temp = array [exterior];
	        interior = exterior;
	 
	        while (interior > a - 1 && array[interior - a] >= temp) {
	          array[interior] = array [interior - a];
	          interior -= a;
	        
	          System.out.println("Arreglando " + Arrays.toString(array));
	        }
	        array [interior] = temp;
	      }
	      a = (a - 1) / 3;
	    }
	    
	    tiempo_final=System.currentTimeMillis();	//toma el tiempo en que se termina la ejecucion
	    
	    System.out.println("\nEL proceso de la tarea tomo un tiempo de: "+(tiempo_final-tiempo_inicio)+" milisegundos\n");	// imprime el tiempo de ejecucion
	  }
	 
	  public static void main(String[] args) {
	 
		  System.out.println("\n********************************");
		  System.out.println("      ORDENAMIENTO SHELL \n");
		  System.out.println("**********************************\n");
		  
		  Scanner lector = new Scanner(System.in);
		  System.out.println("INGRESE LA CANTIDAD DE DATOS");
		  int b = lector.nextInt();
		  int array[]= new int [b];
		  System.out.println("INGRESE LOS VALORES DEL ARREGLO");
		  for(int i = 0; i<b; i++){
			 array[i] = lector.nextInt();
		  }
		System.out.println("\nEL VECTOR ES: ");
	    System.out.println("Antes: " + Arrays.toString(array)+"\n");
	    shell(array);
	    System.out.println("Despues:   " + Arrays.toString(array));
	    
	  }
	}

