/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.Comparator;

import java.util.Comparator;

/**
 *
 * @author Mitchel
 */
public class DecimalComparator implements Comparator {
    
    @Override
    public int compare(Object ob1, Object ob2){
        if (ob1 instanceof Double && ob2 instanceof Double){
            Double num1 = (Double)ob1;
            Double num2 = (Double)ob2;
            return num1.compareTo(num2);    
        }
        else {
            throw new IllegalArgumentException("Los objectos no son innstancias de Double");
        }
    }
    
}
