/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.model;

/**
 *
 * @author mitch
 */
public class Persona {
    
    
    public static final int NAME = 0;
    public static final int AGE = 1;
    
    public static final int LESS = -1;
    public static final int EQUAL = 0;
    public static final int GREATER = 1;
    
    public static int compareAttribute;
    
    private String name;
    private int age;
    private char gender;

    public Persona(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    static {
        compareAttribute = NAME;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.name + " || " + this.age + " || " + this.gender;
    }
    
   public void setCompareAttribute(int attribute) {
       compareAttribute = attribute;
   } 
   
   
   public int compareTo(Persona persona) {
       return compareTo(persona, compareAttribute);
   }
   
   private int compareTo(Persona persona, int attribute) {
       int comparissonResult;
       if (attribute == AGE) {
           int p2age = persona.getAge();
           if (this.age < p2age)
               comparissonResult = -1;
           else if (this.age == p2age)
               comparissonResult = 0;
           else
               comparissonResult = 1;
       }
       
       else {
           String p2name = persona.getName();
           comparissonResult = this.name.compareTo(p2name);
       }
       
       return comparissonResult;
   }
    
    
}
