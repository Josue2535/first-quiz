/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.velezreyes.quiz.question6;

/**
 *
 * @author DesarrolloJC
 */
public class DrinkImpl implements Drink{
    
    private String name;
    private boolean fizzy;

    public DrinkImpl(String name, boolean fizzy) {
        this.name = name;
        this.fizzy = fizzy;
    }
    
    

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFizzy() {
        return fizzy;
    }
    
}
