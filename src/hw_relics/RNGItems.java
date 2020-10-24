/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_relics;
import java.io.Serializable;

enum RNGItems implements Serializable {
    SAND_NEED(60,75),
    UMBRITE_NEED(60,75);
    
    private int minNeed;
    private int maxNeed;
    
    RNGItems(int min, int max) {
        minNeed = min;
        maxNeed = max;
    }
    
    
    public int getMinNeed() {
        return minNeed;
    }
    
    public int getMaxNeed() {
        return maxNeed;
    }
    
}
