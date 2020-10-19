package hw_relics;
import java.io.Serializable;


enum Poetics implements Serializable{
    UNIDENTIFIABLE_BONES(150, 10),
    UNIDENTIFIABLE_SHELL(150, 10),
    UNIDENTIFIABLE_ORE(150, 10),
    UNIDENTIFIABLE_SEEDS(150, 10),
    AETHER_OIL(350, 5),
    SINGING_CLUSTER(40, 50),
    PNEUMITE(100, 15),
    ARCHAIC_ENCHANTED_INK(500, 1);
    
    
    
    
    private int poeticsCostPerOne;
    private int amountNeededPerOneRelic;
    
    
    Poetics(int staticPoeticCost, int perRelicNeed) {
        poeticsCostPerOne = staticPoeticCost;
        amountNeededPerOneRelic = perRelicNeed;
    }
    
    
    public int getPoeticsValue() {
        return poeticsCostPerOne;
    }
    
    public int getNeededOneRelic() {
        return amountNeededPerOneRelic;
    }
}