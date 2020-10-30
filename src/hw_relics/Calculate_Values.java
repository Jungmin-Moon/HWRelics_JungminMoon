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
    
    //Finding total amount of shells/ores/seed/bone needed for the amount of relics they want
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
    
    //Ores/shell/seed/bone to get
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
    
    //Umbrite and Sand minimum and maximum calculations needed for amount of relics
    public int minSandNeedCalc(int relicCount, int minSandPer1) {
        minimumSandNeed = relicCount * minSandPer1;
        return relicCount * minSandPer1;
    }

    public int maxSandNeedCalc (int relicCount, int maxSandPer1) {
        maximumSandNeed = relicCount * maxSandPer1;
        return relicCount * maxSandPer1;
    }
    
    public int minUmbriteCalc(int relicCount, int minUmbritePer1) {
        minimumUmbriteNeed = relicCount * minUmbritePer1;
        return relicCount * minUmbritePer1;
    }
    
    public int maxUmbriteCalc(int relicCount, int maxUmbritePer1) {
        maximumUmbriteNeed = relicCount * maxUmbritePer1;
        return relicCount * maxUmbritePer1;
    }
    
    
    //poetics required calculation methods. for shell/ore/seed/bone, umbrite, aether oil, singing cluster, pneumite, and ink
    
    public int poeticsNeedOre(int poeticsOreValue) {
        return oresNeeded * poeticsOreValue;
    }
    
    public int poeticsNeedShell(int poeticsShellValue) {
        return shellsNeeded * poeticsShellValue;
    }
    
    public int poeticsNeedSeed(int poeticsSeedValue) {
        return seedsNeeded * poeticsSeedValue;
    }
    
    public int poeticsNeedBone(int poeticsBoneValue) {
        return boneNeeded * poeticsBoneValue;
    }
    
    //beast tribes needed for bones/shell/seeds/ore
    
    public int tokensNeedOre(int tokensCostPerOre) {
        return oresNeeded * tokensCostPerOre;
    }
    
    public int tokensNeedShell(int tokensCostPerShell) {
        return shellsNeeded * tokensCostPerShell;
    }
    
    public int tokensNeedSeed(int tokensCostPerSeed) {
        return seedsNeeded * tokensCostPerSeed;
    }
    
    public int tokensNeedBone(int tokensCostPerBone) {
        return boneNeeded * tokensCostPerBone;
    }
    
    //Other items that are not RNG dependant and thus have set values needed per X amount of relics
    public int totalOilNeeded(int relicCount, int oilPer1) {
        oilNeeded = relicCount * oilPer1;
        return oilNeeded;
    }
    
    public int totalClusterNeeded(int relicCount, int clusterPer1) {
        singingClusterNeeded = relicCount * clusterPer1;
        return singingClusterNeeded;
    }
    
    public int totalPneumiteNeeded(int relicCount, int pneumitePer1) {
        pneumiteNeeded = relicCount * pneumitePer1;
        return pneumiteNeeded;
    }
    
    public int totalInkNeeded(int relicCount, int inkPer1) {
        inkNeeded = relicCount * inkPer1;
        return inkNeeded;
    }
    
    
    //Methods to calculate how many more of each item is needed for non shells/bone/seeds/ore along with sand and umbrite
    
    
    //Methods to calculate poetics needed for each non RNG item 
    
    
    /*
    
    create calculation methods for the other poetics items that aren't random
    
    
    */
}
