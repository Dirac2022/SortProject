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
    
    public Object [] bubble (Object [] X, Comparator comp){
        inicioEjecucion = System.nanoTime();
        intercambios = 0;
        comparaciones = 0;
        Object aux = 0;
        for (int i = 0; i < X.length - 1; i++){
            for (int j = 0; j < X.length - 1; j++) {
                comparaciones ++;
                if (comp.compare(X[j], X[j+1]) > 0){
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
    
    public <K> void merge(K[] S1, K[] S2, K[] S, Comparator<K> comp){
        int i = 0, j = 0;
        while (i + j < S.length){
            if (j == S2.length || (i < S1.length && comp.compare(S[i], S[j]) < 0))
                S[i + j] = S[i ++];
            else
                S[i + j] = S2[j ++];
        }
    }
    
    public <K> void mergeSort(K[] S, Comparator<K> comp){
        int n = S.length;
        if (n < 2 ) return;
        int mid = n / 2;
        K[] S1 = java.util.Arrays.copyOfRange(S, 0, mid);
        K[] S2 = java.util.Arrays.copyOfRange(S, mid, n);
        mergeSort(S1, comp);
        mergeSort(S2, comp);
        merge(S1, S2, S, comp);
    }
    
}
