/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.ordenamiento;

import uni.aed.model.Persona;

/**
 *
 * @author mitch
 */
public class SortObjectPerson {
    
    public Persona[] bubble(Persona [] X, int attribute) {
        
        if (!(attribute == Persona.NAME  || attribute == Persona.AGE))
            throw new IllegalArgumentException();
        Persona p1, p2, aux;
        int comparissonResult;
        X[0].setCompareAttribute(attribute);
        for(int i = 0; i < X.length - 1; i++) {   
            for (int j = 0; j < X.length - 1; j++) {
                p1 = X[j];
                p2 = X[j + 1];
                comparissonResult = p1.compareTo(p2);
                if (comparissonResult > 0) {
                    aux = X[j];
                    X[j] = X[j + 1]; 
                    X[j + 1] = aux;
                }
            }
        }
        return X;
    }
}
