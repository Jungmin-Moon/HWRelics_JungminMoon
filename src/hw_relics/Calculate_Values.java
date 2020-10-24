/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_relics;

/**
 *
 * @author luckyseven67
 */
public class Calculate_Values {
    
    /*
    used to calculate how many poetics needed for all relics being made at current
    how many more of an item is needed
    
    
    
    */
    
    private int oresNeeded;
    private int shellsNeeded;
    private int seedsNeeded;
    private int boneNeeded;
    private int minimumSandNeed;
    private int maximumSandNeed;
    private int minimumUmbriteNeed;
    private int maximumUmbriteNeed;
    private int oilNeeded;
    private int singingClusterNeeded;
    private int pneumiteNeeded;
    private int inkNeeded;
    
    Calculate_Values() {
        oresNeeded = 0;
        shellsNeeded = 0;
        seedsNeeded = 0;
        boneNeeded = 0;
    }
    
    public int totalOresNeeded(int orePerOneRelic, int relicCount) {
        oresNeeded = orePerOneRelic * relicCount;
        return orePerOneRelic * relicCount;
    }
    
    
    public int totalShellNeeded(int shellsPerOneRelic, int relicCount) {
        shellsNeeded = shellsPerOneRelic * relicCount;
        return shellsPerOneRelic * relicCount;
    }
    
    public int totalSeedNeeded(int seedsPerOneRelic, int relicCount) {
        seedsNeeded = seedsPerOneRelic * relicCount;
        return seedsPerOneRelic * relicCount;
    }
    
    public int totalBoneNeeded(int bonesPerOneRelic, int relicCount) {
        boneNeeded = bonesPerOneRelic * relicCount;
        return bonesPerOneRelic * relicCount;
    }
    
    public int oresNeedToGet(int currentOres) {
        return oresNeeded - currentOres;
    }
    
    public int shellsNeedToGet(int currentShells) {
        return shellsNeeded - currentShells;
    }
    
    public int seedsNeedToGet(int currentSeeds) {
        return seedsNeeded - currentSeeds;
    }
    
    public int boneToGet(int currentBone) {
        return boneNeeded - currentBone;
    }
    
    
    public int minSandNeedCalc(int relicCount, int minSandPer1) {
        minimumSandNeed = relicCount * minSandPer1;
        return relicCount * minSandPer1;
    }

    public int maxSandNeedCalc (int relicCount, int maxSandPer1) {
        maximumSandNeed = relicCount * maxSandPer1;
        return relicCount * maxSandPer1;
    }
}
