
package com.mycompany.game;

import com.mycompany.game.spaceship.MillenniumFalcon;
import com.mycompany.game.spaceship.StellarDestroyer;


public class Game {

    public static void main(String[] args) {
        StellarDestroyer stellarDestroyer = new StellarDestroyer (true, true, "hgfdjg", false, 30, 20, 48, 58);
        stellarDestroyer.shoot();
        
        MillenniumFalcon millenniumFalcon = new MillenniumFalcon (true ,2, false, "bjgcbjk", true, 45, 67, 36, 93);
        millenniumFalcon.shoot();
    }
}
