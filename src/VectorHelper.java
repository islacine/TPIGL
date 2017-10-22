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


/**
 * VectorHelper class uses for operations on a vector
 */
public class VectorHelper {
    
    
    public int max,min ;
    
      /**
     * This is a constructor to initialize VectorHelper object.
     */

    public VectorHelper() {

	}
	
/**
     * @param vector non sorted to be sorted
     * @return a sorted vector
     */
	public int [] tri (int vector[]){
/**
         * i index of a vector
         * j index of a vector
         * permut is a variable
         */
		
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

        
        
            /**
     *
     * @param vector1
     * @param vector2
     * @return a vector of integers as an addition of the two vectors vector1 and vector2
     * @throws LengthException
     */

	public  int [] Somme (int vector1[],int vector2[] ) throws LengthException{
	int i  ;
	
	if (vector1.length != vector2.length) throw new LengthException() ; 
	
        /**
         * Vector3 is generated from the addition of vector1 with vector2
         * i index to browse vectors
         */

	int vector3 [] = new int [vector1.length] ;
		for (i = 0 ; i < vector1.length ; i++ ){
		vector3[i] =vector1[i]+ vector2[i] ; 
		}
	return(vector3);
	
	}

    /**
     *
     * @param vector to inverse
     * @return inverted vector
     */

	public  int [] InverserVector (int vector[]){
        /**
         * i index to browse a vector
         * j index to browse a vector
         * inverse variable
         */
		
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

        
            /**
     * To extract minimum and maximum value of a vector
     * @param vector to extract min and max from
     */

	public  void MinMax (int vector[]){
        /**
         * min is minimum value of a vector
         * max is maximum value of a vector
         * i index to browse a vector
         */

            int [] Min_Max = {0,0};
		min = vector[0] ;
		max = vector[0] ;
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
	
        
            /**

     * @param vector on which we apply a function
     * @return a vector after a function is applied on its elements every element power 2
     */

	public  int [] Formule (int vector []) {
        /**
         * i index to browse a vector
         */
		
		int i = 0 ;
		for(i=0 ; i< vector.length ; i++){
			vector[i]= vector[i]*vector[i];
		}
		
	return(vector);
	}

        
            /**
     * To show elements of a vector
     * @param vector to show
     */

	public  void AfficherVector(int vector[]) {
        /**
         * i index to browse a vector
         */
		
	for (int i = 0; i < vector.length; i++){
		
		System.out.println( vector[i]);
		}
	}
    /**
     * To fill a vector with integers
     * @param vector to fill
     * @return a filled vector
     */

	public  int[] RemplirVector ( int vector[] ) {
        /**
         * i index to browse a vector
         */
		
	Scanner keyb = new Scanner(System.in)	;
	for (int i = 0; i < vector.length; i++){
		vector[i] = keyb.nextInt();
		}
	return(vector);
	}


    
}
