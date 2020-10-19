package hw_relics;
import java.io.Serializable;

public class HeavenswardRelicCount implements Serializable{
    
    private int relicCount;
    private int oresObtained = 0;
    private int shellObtained = 0;
    private int boneObtained = 0;
    private int seedsObtained = 0;
    private int aetherOilObtained = 0;
    private int singingClusterObtained = 0;
    private int pneumiteObtained = 0;
    private int archaicEnchantedInkObtained = 0;
    private int lightObtained = 0;
    private int sandObtained = 0;
    private int umbriteObtained = 0;
    
    private static transient int maxLightNeeded = 1000;
    
    public HeavenswardRelicCount (int count) {
        relicCount = count;
    }
    
    public int getRelicCount() {
        return relicCount;
    }
    
    public int getOresObtained() {
        return oresObtained;
    }
    
    public int getShellObtained() {
        return shellObtained;
    }
    
    public int getSeedsObtained() {
        return seedsObtained;
    }
    
    public int getBoneObtained() {
        return boneObtained;
    }
    
    public int getAetherOilObtained() {
        return aetherOilObtained;
    }
    
    public int getSingingClusterObtained() {
        return singingClusterObtained;
    }
    
    public int getPneumiteObtained() {
        return pneumiteObtained;
    }
    
    public int getInkObtained() {
        return archaicEnchantedInkObtained;
    }
    
    public int getLightCollected() {
        return lightObtained;
    }
    
    public int getSandsObtained() {
        return sandObtained;
    }
    
    public int getUmbriteObtained() {
        return umbriteObtained;
    }
    
    public void setResetLight() {
        lightObtained = 0;
    }
    
    public void addOres(int ores) {
        oresObtained += ores;
    }
    
    public void addSeeds(int seeds) {
        seedsObtained += seeds;
    }
    
    public void addShells(int shells) {
        shellObtained += shells;
    }
    
    public void addBone(int bones) {
        boneObtained += bones;
    }
    //TODO
    
    /*
    methods needed: 

    
    method to calculate how much more light is needed
    method to calculate tokens needed for unidentifiables
    method to calculate total poetics needed for N relics
    method to see how many tokens are left to get for an unidentifiable
    method to see how many poetics are left to get for an item

    calculate how many of each item is needed for N relics
    instance variables to store how many of each item is needed
    methods to reset those variables to 0
    
    method to display current values
    
    */
}