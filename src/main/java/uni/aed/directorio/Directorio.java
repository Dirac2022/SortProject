/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uni.aed.directorio;

import java.util.Comparator;
import uni.aed.model.Persona;

/**
 *
 * @author MITCHEL SOTO CUYA
 */
public interface Directorio {
    
    public void add(Persona persona);
    
    public Persona [] Sort(int attribute, String algorithm);
    public Object [] Sort(Comparator comp);

}
