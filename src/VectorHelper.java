import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YacineMestoui
 */
public class VectorHelper {
    
    public VectorHelper() {

	}
	

	public static int [] tri (int vector[]){
		
		int i,j = 0 ;
		int permut = 0 ;
		for (i=0 ; i<vector.length ; i++ ){
			for(j=i; j<vector.length ; j++ ){
				
				if (vector[j]<vector[i]){
					permut=vector[i] ;
					vector[i]=vector[j];
					vector[j]=permut;
				}	
				
				
			}
		}
		return ( vector ) ;
	}


	public static int [] Somme (int vector1[],int vector2[] ) throws LengthException{
	int i  ;
	
	if (vector1.length != vector2.length) throw new LengthException() ; 
	

	int vector3 [] = new int [vector1.length] ;
		for (i = 0 ; i < vector1.length ; i++ ){
		vector3[i] =vector1[i]+ vector2[i] ; 
		}
	return(vector3);
	
	}

	public static int [] InverserVector (int vector[]){
		
		int i=0;
		int inverse;
		for (i=0;i<(vector.length)/2;i++ )
		{
			inverse = vector[i];
			vector[i]=vector[vector.length-i-1];
			vector[vector.length-i-1]=inverse;
			
		}
		
		return(vector) ;
	}

	public static void MinMax (int vector[]){
		
		int min = vector[0] ;
		int max = vector[0] ;
		int i;
		for (i=1;i<vector.length;i++){
			if(vector[i]<min){
				min=vector[i];
			
			}
			else if (vector[i]>max){
				max=vector[i];
			}
		}
		System.out.println("Maximum = " + max +" Minimum = " + min);
		
		
	} 
	
	public static int [] Formule (int vector []) {
		
		int i = 0 ;
		for(i=0 ; i< vector.length ; i++){
			vector[i]= vector[i]*vector[i];
		}
		
	return(vector);
	}

	public static void AfficherVector(int vector[]) {
		
	for (int i = 0; i < vector.length; i++){
		
		System.out.println( vector[i]);
		}
	}

	public static int[] RemplirVector ( int vector[] ) {
		
	Scanner keyb = new Scanner(System.in)	;
	for (int i = 0; i < vector.length; i++){
		vector[i] = keyb.nextInt();
		}
	return(vector);
	}


    
}