/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.directorio;

import java.util.Comparator;
import javax.swing.ImageIcon;
import uni.aed.model.Persona;
import uni.aed.ordenamiento.SortObjectPerson;
import uni.aed.ordenamiento.SortObject;

/**
 *
 * @author MITCHEL SOTO CUYA
 */
public class DirectorioV1 implements Directorio{
    
   
    
    private static final int DEFAULT_SIZE = 25;
    private  Persona [] entry;
    private int count;
    
    private Comparator comp;
    
    
    public DirectorioV1(){
        this(DEFAULT_SIZE);
    }

    public DirectorioV1(int size) {
        count = 0;
        if (size <= 0)
            throw new IllegalArgumentException("Tamaño debe ser mayor a cero");
        entry = new Persona[size];
    }

    public Persona[] getEntry() {
        return entry;
    }
    
    @Override
    public void add(Persona persona) {
        if (count == entry.length)
            enlarge();
        entry[count] = persona;
        count ++;
    }

    @Override
    public Persona[] Sort(int attribute, String algorithm) {
        if (!(attribute == Persona.NAME  || attribute == Persona.AGE))
            throw new IllegalArgumentException();
        Persona[] sortedList = new Persona[count];
        for(int i = 0; i < count; i ++) 
            sortedList[i] = entry[i];
        
        SortObjectPerson sort = new SortObjectPerson();
        switch(algorithm.toUpperCase()) {
            case "BUBBLE" ->{
                sort.bubble(sortedList, attribute);
            }
        }
        
        return sortedList;  
    }
    
    private void enlarge() {
        int newLength = (int)(1.5 * entry.length);
        Persona [] temp = new Persona [newLength];
        for (int i = 0; i < entry.length; i++)
            temp[i] = entry[i];
        entry = temp;
    }

    
    
    @Override
    public Object[] Sort(Comparator comp) {
        
        Object[] sortedList = new Persona[count];
        for(int i = 0; i < count; i ++) 
            sortedList[i] = entry[i];
        
        
        SortObject sort = new SortObject(comp);
        sort.HeapSort(sortedList);
        return sortedList;
    }
     
    
    
}
