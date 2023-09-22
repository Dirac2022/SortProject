/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.Comparator;

import java.util.Comparator;

/**
 *
 * @author MITCHEL SOTO CUYA
 */
public class IntegerComparator implements Comparator{
    
    @Override
    public int compare(Object ob1, Object ob2){
        if (ob1 instanceof Integer && ob2 instanceof Integer){
            Integer num1 = (Integer)ob1;
            Integer num2 = (Integer)ob2;
            return num1.compareTo(num2);    
        }
        else {
            throw new IllegalArgumentException("Los objectos no son innstancias de Integer");
        }
    }
    
}
