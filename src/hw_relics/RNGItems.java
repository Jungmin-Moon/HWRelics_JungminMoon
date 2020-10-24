/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_relics;
import java.io.Serializable;

enum RNGItems implements Serializable {
    SAND_NEED(60,75, 0),
    UMBRITE_NEED(60,75, 75);
    
    private int minNeed;
    private int maxNeed;
    private int poeticsPer1;
    
    RNGItems(int min, int max, int pPer1) {
        minNeed = min;
        maxNeed = max;
        poeticsPer1 = pPer1;
    }
    
    
    public int getMinNeed() {
        return minNeed;
    }
    
    public int getMaxNeed() {
        return maxNeed;
    }
    
    public int getPoeticsPerOne() {
        return poeticsPer1;
    }
    
}
