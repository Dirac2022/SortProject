/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.ordenamiento;

import java.util.Comparator;

/**
 *
 * @author mitch
 */
public class Sort {
    
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
    

    public Object [] bubble (Object [] X, Comparator comp){
        inicioEjecucion = System.nanoTime();
        intercambios = 0;
        comparaciones = 0;
        Object aux;
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
    
    
    
    public Object [] insertion(Object [] X, Comparator comp){
        inicioEjecucion = System.nanoTime();
        intercambios = 0;
        comparaciones = 0;
        Object current;
        int k;
        boolean sw;
        for (int i = 1; i < X.length; i++) {
            current = X[i];
            k = i - 1;
            sw = false;
            while (sw == false && k >= 0) { 
                comparaciones ++;
                if (comp.compare(current, X[k]) < 0){
                    X[k + 1] = X[k];
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
    
    public Object [] binaryInsertion(Object [] X, Comparator comp) {
        inicioEjecucion = System.nanoTime();
        intercambios = 0;
        comparaciones = 0;
        Object aux; 
        int p, u, c;
        for(int i = 1; i < X.length; i++){      
            aux = X[i];                         
            p = 0;                              
            u = i - 1;                          
            while(p <= u){                      
                comparaciones ++;
                c = (p + u) / 2;                
                if(comp.compare(aux, X[c]) < 0)                  
                    u = c - 1;                  
                else                        
                    p = c + 1;                  
                intercambios ++;
            }
            for (int k = i - 1; k >= p; k--)        
                X[k + 1] = X[k];                    
            X[p] = aux;                         
        }
        finEjecucion = System.nanoTime();
        return X;
    }
    
    public Object [] selection(Object [] X, Comparator comp){
        inicioEjecucion = System.nanoTime();
        intercambios = 0;
        comparaciones = 0;
        Object menor;
        int k;
        for (int i = 0; i < X.length - 1; i++) {
            menor = X[i];
            k = i;
            for (int j = i + 1; j < X.length; j++) {
                comparaciones ++;
                if(comp.compare(X[j], menor) < 0){
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
    
    private <T> void merge(T[] S1, T[] S2, T[] S, Comparator<T> comp){
        int i = 0, j = 0;
        while (i + j < S.length){
            if (j == S2.length || (i < S1.length && comp.compare(S1[i], S2[j]) < 0))
                S[i + j] = S1[i ++];
            else
                S[i + j] = S2[j ++];
        }
    }
    
    public <T> void mergeSort(T[] S, Comparator<T> comp){
        int n = S.length;
        if (n < 2 ) return;
        int mid = n / 2;
        T[] S1 = java.util.Arrays.copyOfRange(S, 0, mid);
        T[] S2 = java.util.Arrays.copyOfRange(S, mid, n);
        mergeSort(S1, comp);
        mergeSort(S2, comp);
        merge(S1, S2, S, comp);
    }

    
    private <T> void quickSortInPlace(T[] S, Comparator<T> comp, int a, int b){
        if (a >= b) return;
        int left = a;
        int right = b - 1;
        T pivot = S[b];
        T temp;
        while (left <= right) {
            comparaciones ++;
            while (left <= right && comp.compare(S[left], pivot) < 0)
                left ++;
            while (left <= right && comp.compare(S[right], pivot) > 0)
                right --;
            if (left <= right) {
                temp = S[left];
                S[left] = S[right];
                S[right] = temp;
                left ++;
                right --;
                intercambios ++;
            }
        }
        
        temp = S[left];
        S[left] = S[b];
        S[b] = temp;
        intercambios ++;
        
        quickSortInPlace(S, comp, a, left - 1);
        quickSortInPlace(S, comp, left + 1, b);
    }
    
    public <T> void quickSort(T[] X, Comparator<T> comp){
        inicioEjecucion = System.nanoTime();
        quickSortInPlace(X, comp, 0, X.length - 1);
        finEjecucion = System.nanoTime();
    }
    
    public Integer [] shellSort(Integer [] X){
        inicioEjecucion = System.nanoTime();
        int salto, N, j, k;
        N = X.length;
        salto = N/2;
        while(salto > 0) {
            for(int i = salto; i < N; i++){
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (X[j] <= X[k]){
                        comparaciones++;
                        j = 0;
                    }
                        
                    else{
                        intercambio(X, j, k);
                        intercambios++;
                    }
                        
                        
                    j = j - salto;
                }
            }
            salto = salto / 2;
        }
        finEjecucion = System.nanoTime();
        return X;
    }
    
    private void intercambio(Integer X[], int p, int q){
        int temp = X[p];
        X[p] = X[q];
        X[q] = temp;
    }
    
}

