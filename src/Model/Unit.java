/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author nicolasvondru
 */
public abstract class Unit {
    
    //    Variables
    protected int health;
    protected int armor;
    protected int damage;
    protected int attackSpeed;
    protected int moveSpeed;
    protected int cost;
    protected int range;
    protected double creationTime;
    protected ImageView form;
    
//    Constructor    
    
    public Unit(){
        
    }
    
    
//    Methods
    public void die(){
        
    }
    public void attack(){
        
    }
    public void move(){
        
    }
    public void getDamage(){
        
    }
    
//    Getteer/Setter

    public ImageView getForm() {
        return form;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
    
}
