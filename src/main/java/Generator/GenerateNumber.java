/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generator;

import java.util.Random;

/**
 *
 * @author mitch
 */
public class GenerateNumber {
    
    private int capacity;

    public GenerateNumber() {
        capacity = 1;
    }
    
    public GenerateNumber(int capacity){
        this.capacity = capacity;
    }
    
    public Object [] generateArray (int capacity){
        
        Object [] X = new Object[capacity];
        Random rand = new Random();
        for (int i = 0; i < capacity; i++)
            X[i] = rand.nextInt(100);
        
        return X;
    }
    
    
    
}
