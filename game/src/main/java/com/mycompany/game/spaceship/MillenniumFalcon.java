
package com.mycompany.game.spaceship;


public class MillenniumFalcon extends NuclearShip{
    private boolean hyperSpeed;
    private int cannons;
    private boolean shield;

    public MillenniumFalcon(boolean hyperSpeed, int cannons, boolean shield, String name, boolean armed, int crew, int damage, int health, int speed) {
        super(name, armed, crew, damage, health, speed);
        this.hyperSpeed = hyperSpeed;
        this.cannons = cannons;
        this.shield = shield;
    }
    
    @Override //sobreescribir
    public void shoot(){
        System.out.println("¡Disparo a cañonazos!!!!");
    }
    
    /*
    @Override
    public void fly(){
        
    }
    */
    
    public void toogleShield(){
        this.shield = !this.shield;
    }
}
