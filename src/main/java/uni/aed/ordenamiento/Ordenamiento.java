/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.ordenamiento;

import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author mitch
 */
public class Ordenamiento {
    
    int intercambios, comparaciones;
    long inicioEjecucion, finEjecucion, tiempoEjecucion;
    
    public int getIntercambios(){
        return intercambios;
    }
    
    public int getComparaciones(){
        return comparaciones;
    }
    
    public long getRunningTime(){
        return finEjecucion - inicioEjecucion;
    }
    
    public Integer[] burbuja(Integer [] X){      
        inicioEjecucion = System.nanoTime();
        intercambios = 0;
        comparaciones = 0;
        int aux = 0;
        for (int i = 0; i < X.length - 1; i++){
            for (int j = 0; j < X.length - 1; j++) {
                comparaciones ++;
                if (X[j] > X[j+1]){
                    aux = X[j];
                    X[j] = X[j+1];
                    X[j+1] = aux;
                    intercambios ++;
                }
            }
        }
        finEjecucion = System.nanoTime();
        return X;
    }
    
    
    public Integer [] insertion(Integer [] X){
        inicioEjecucion = System.nanoTime();
        intercambios = 0;
        comparaciones = 0;
        int  current, k;
        boolean sw = false;
        for (int i = 1; i < X.length; i++) {
            current = X[i];
            k = i - 1;
            sw = false;
            while (sw == false && k >= 0) { 
                comparaciones ++;
                if(current < X[k]){
                    X[k+1]=X[k];
                    k --;
                    intercambios ++;
                }
                else
                    sw = true;
            }
            X[k+1] = current;
        }
        finEjecucion = System.nanoTime();
        return X;
    }
    
    public Integer [] binaryInsertion(Integer [] X) {
        inicioEjecucion = System.nanoTime();
        intercambios = 0;
        comparaciones = 0;
        int aux, p, u, c;
        for(int i = 1; i < X.length; i++){      // i = 2
            aux = X[i];                         // aux = X[1] = 8
            p = 0;                              // p = 0
            u = i - 1;                          // u = 0
            while(p <= u){                      // 1 <= 0 No
                comparaciones ++;
                c = (p + u) / 2;                // c = 0
                if(aux < X[c])                  // 8 < 7 No
                    u = c - 1;                  //
                else                        
                    p = c + 1;                  // p = 1
                intercambios ++;
            }
            for (int k = i - 1; k >= p; k--)    // 0 1 2 3 4        // k = 3    
                X[k + 1] = X[k];                // 7 8 4 6 1    
            X[p] = aux;                         // 4 7 8 4 6
        }
        finEjecucion = System.nanoTime();
        return X;
    }
    
    public Integer [] selection(Integer [] X){
        inicioEjecucion = System.nanoTime();
        intercambios = 0;
        comparaciones = 0;
        int menor, k;
        for (int i = 0; i < X.length - 1; i++) {
            menor = X[i];
            k = i;
            for (int j = i + 1; j < X.length; j++) {
                comparaciones ++;
                if(X[j] < menor){
                    menor = X[j];
                    k = j;
                }
                
            }            
            X[k] = X[i];
            X[i] = menor;
            intercambios ++;
        }
        
        finEjecucion = System.nanoTime();
        return X;
    }
 
    
    public Integer [] shellSort(Integer [] X){
        int salto, N, j, k;
        N = X.length;
        salto = N/2;
        while(salto > 0) {
            for(int i = salto; i < N; i++){
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (X[j] <= X[k])
                        j = 0;
                    else
                        intercambio(X, j, k);
                    j = j - salto;
                }
            }
            salto = salto / 2;
        }
        return X;
    }
    
    private void intercambio(Integer X[], int p, int q){
        int temp = X[p];
        X[p] = X[q];
        X[q] = X[temp];
    }
    
    public Integer [] QuickSort(Integer [] X){
        Integer [] y;
        y = QuickSort(X, 0, X.length);
        return y;
    }
    
    public Integer [] QuickSort(Integer [] X, int start, int end){
        if (start < end){
            int pIndex = QuickSortPartition(X, start, end);
            QuickSort(X, start, pIndex - 1);
            QuickSort(X, pIndex + 1, end);
        }
        return X;
    }
    
    private int QuickSortPartition(Integer [] X, int start, int end){
        int pivot = X[end];
        int pIndex = start;
        for(int i = start; i < end; i ++){
            if (X[i] <= pivot){
                intercambio(X, i, pIndex);
                pIndex ++;
            }
        }
        intercambio(X, pIndex, end);
        return pIndex;
    }
    
    
    
    
    private int HeapSortMaxChild(Integer [] X, int loc, int end) {
        int result, left, right;
        left = 2 * loc + 1;
        right = 2 * loc + 2;
        if (right <= end && X[left] < X[right])
            result = right;
        else
            result = left;
        return result;
    }
    
    private Integer [] HeapSortExtract(Integer [] X) {
        
        Integer [] Y = new Integer [X.length];
        int current, maxChildIndex;
        boolean done;
        
        for (int i = X.length - 1; i >= 0; i--) {
            Y[i] = X[0];            // Putting the root node in the actual position of the new heap
            X[0] = X[i];            // Replace the root node's value with the last nodes's value from the heap
            current = 0;
            done = false;
            while (!done) {
                if (2 * current + 1 > i)
                    done = true;
                else {  // Si el nodo actual tiene al menos un hijo
                   maxChildIndex = HeapSortMaxChild(X, current, i);
                   if (X[current] < X[maxChildIndex]){
                       intercambio(X, current, maxChildIndex);
                       current = maxChildIndex;
                   }
                   else
                       done = true;    
                }
            }
        }
        
        return X;
    }
    
}
