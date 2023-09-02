/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.ordenamiento;

/**
 *
 * @author Mitchel
 */
public class BubbleSort {
    
    
    public static Integer[] burbuja(Integer [] X){
        
        int aux = 0;
        for (int i = 0; i < X.length - 1; i++){
            for (int j = 0; j < X.length - 1; j++) {
                if (X[j] > X[j+1]){
                    aux = X[j];
                    X[j] = X[j+1];
                    X[j+1] = aux;
                }
            }
        }
        return X;
    }
    
}
