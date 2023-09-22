/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.ordenamiento;

import java.util.Comparator;

/**
 *
 * @author MITCHEL SOTO CUYA
 */
public class SortObject {
    
    
    private Object [] heap;
    private Object [] listaOrdenada;
    private Comparator comp;
    
    public SortObject(Comparator comp){
        this.comp = comp;
    }
    
    public void inicitaDatos(Object [] datos, Comparator comp) {
        heap = new Object[datos.length];
        listaOrdenada = new Object[datos.length];
        this.comp = comp;
        
        for(int i = 0; i < datos.length; i++)
            heap[i] = datos[i];
    }
    
    public Object[] HeapSort(Object[] X){
        Object[] Y=new Object[X.length];
        HeapSortConstruct(X);//fase de construccion: contruir el heap
        Y = HeapSortExtract(X, comp);//fase de extraccion los valores del nodo raiz        
        return Y;
    }
    
    public Object [] ordena(){
        
        listaOrdenada = HeapSortExtract(heap, comp);
        return listaOrdenada;
        
    }
    
    private int HeapSortMaxChild(Object [] X, int loc, int end) {
        int result; 
        int left, right;
        left = 2 * loc + 1;
        right = 2 * loc + 2;
        if (right <= end && comp.compare(X[left], X[right]) < 1)
            result = right;
        else
            result = left;
        return result;
    }
    
    private void HeapSortConstruct(Object[] X){
        int current = 0;
        int maxChildIndex;
        boolean hecho;
        for(int i=(X.length-2)/2;i>=0;i--)
        {
            current=i;
            hecho = false;
            while(!hecho){//2*i+1,2*i+2
                if(2*current+1 > X.length-1)
                    //nodo actual no tiene hijos
                    hecho=true;
                else//el nodo actual tiene al menos un hijo                    
                {
                    maxChildIndex=HeapSortMaxChild(X,current,X.length-1);
                                    
                    if(comp.compare(X[current], X[maxChildIndex]) < 0){//nodo padre con el maximo valor de los nodos hijo
                        intercambio(X,current,maxChildIndex);
                        current=maxChildIndex;
                    }else
                        hecho=true;
                }
            }//end while   
        }//end for
    }
    
    private Object [] HeapSortExtract(Object [] X, Comparator comp) {
        
        Object [] Y = new Integer [X.length];
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
                   if (comp.compare(X[current], X[maxChildIndex]) < 0){
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
    
    
    private void intercambio(Object X[], int p, int q){
        Object temp = X[p];
        X[p] = X[q];
        X[q] = temp;
    }
    
    // -------------------------
    //---------------------------
    
    
    
    
    
    /*
    private int HeapSortMaxChild(Integer[] X, int loc,int end){
        int result,Izq,Der;        
        Izq=2*loc+1;
        Der=2*loc+2;
        if(Der<=end && X[Izq]<X[Der])
            result=Der;
        else
            result=Izq;
        return result;
    }
    */
    
    
    
    /*
    private Integer[] HeapSortExtract(Integer[] X){
        Integer[] Y=new Integer[X.length];//sortList
        int current,maxChildIndex;
        boolean hecho;
        for(int i=X.length-1;i>=0;i--){
            Y[i]=X[0];//colocando el nodo raiz en la posicion actual del nuevo heap
            X[0]=X[i];//reemplazamo el valor del nodo raiz con el valor del ultimo nodo del heap
            current=0;
            hecho=false;
            while(!hecho){
                if(2*current+1 > i)
                    hecho=true;
                else{//si el nodo actual tiene al menos un hijo                    
                    maxChildIndex=HeapSortMaxChild(X,current,i);
                    if(X[current]<X[maxChildIndex])
                    {intercambio(X,current,maxChildIndex);
                        current=maxChildIndex;
                    }else//la restrccion de la relacion de valor se cumple, por tanto terminar
                        hecho=true;
                }
            }
        }
        return Y;
    }
*/
    
    
    
    
    
    
    
    
    
    
    
}
