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
        minimumSandNeed = 0;
        maximumSandNeed = 0;
        minimumUmbriteNeed = 0;
        maximumUmbriteNeed = 0;
        oilNeeded = 0;
        singingClusterNeeded = 0;
        pneumiteNeeded = 0;
        inkNeeded = 0;
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
        if(oresNeeded - currentOres < 0) {
            return -1;
        } else if(oresNeeded - currentOres == 0) {
            return 0;
        }
        
        oresNeeded -= currentOres;
        return oresNeeded - currentOres;
    }
    
    public int shellsNeedToGet(int currentShells) {
        if(shellsNeeded - currentShells < 0) {
            return -1;
        } else if(shellsNeeded - currentShells == 0) {
            return 0;
        }
        
        shellsNeeded -= currentShells;
        return shellsNeeded - currentShells;
    }
    
    public int seedsNeedToGet(int currentSeeds) {
        if(seedsNeeded - currentSeeds < 0) {
            return -1;
        } else if(seedsNeeded - currentSeeds == 0) {
            return 0;
        }    
        seedsNeeded -= currentSeeds;
        return seedsNeeded - currentSeeds;
    }
    
    public int boneToGet(int currentBone) {
        if(boneNeeded - currentBone < 0) {
            return -1;
        } else if(boneNeeded - currentBone == 0) {
            return 0;
        }
        
        boneNeeded -= currentBone;
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
    
    //will need to edit to check if the current oil user has causes oilneeded to go negative
    //same with other methods as well.
    //Methods to calculate how many more of each item is needed for non shells/bone/seeds/ore along with sand and umbrite
    public int returnOilNeedGet(int currentOil) {
        if(oilNeeded - currentOil < 0) {
            return -1;
        } else if(oilNeeded - currentOil == 0) {
            return 0;
        }
        
        oilNeeded -= currentOil;
        return oilNeeded - currentOil;
    }
    
    public int returnClusterNeedGet(int currentCluster) {
        if(singingClusterNeeded - currentCluster < 0) {
            return -1;
        } else if(singingClusterNeeded - currentCluster == 0) {
            return 0;
        }
        
        singingClusterNeeded -= currentCluster;
        return singingClusterNeeded - currentCluster;
    }
    
    public int returnPneumiteNeedGet(int currentPneumite) {
        if(pneumiteNeeded - currentPneumite < 0) {
            return -1;
        } else if(pneumiteNeeded - currentPneumite == 0) {
            return 0;
        }
        
        pneumiteNeeded -= currentPneumite;
        return pneumiteNeeded - currentPneumite;
    }
    
    public int returnInkNeedGet(int currentInk) {
        if(inkNeeded - currentInk < 0) {
            return -1;
        } else if(inkNeeded - currentInk == 0) {
            return 0;
        }
        
        inkNeeded -= currentInk;
        return inkNeeded - currentInk;
    }
    
    //methods to find sand and umbrite still needed 
    
    public int returnMinSandNeedGet(int currentSand) {
        if(minimumSandNeed - currentSand < 0) {
            return -1;
        } else if(minimumSandNeed - currentSand == 0) {
            return 0;
        }
        
        minimumSandNeed -= currentSand;
        return minimumSandNeed - currentSand;
    }
    
    public int returnMaxSandNeedGet(int currentSand) {
        if(maximumSandNeed - currentSand < 0) {
            return -1;
        } else if(maximumSandNeed - currentSand == 0) {
            return 0;
        }
        
        maximumSandNeed -= currentSand;
        return maximumSandNeed - currentSand;
    }
    
    public int returnMinUmbriteNeedGet(int currentUmbrite) {
        if(minimumUmbriteNeed - currentUmbrite < 0) {
            return -1;
        } else if(minimumUmbriteNeed - currentUmbrite == 0) {
            return 0;
        }
        
        minimumUmbriteNeed -= currentUmbrite;
        return minimumUmbriteNeed - currentUmbrite;
    }
    
    public int returnMaxUmbriteNeedGet(int currentUmbrite) {
        if(maximumUmbriteNeed - currentUmbrite < 0) {
            return -1;
        } else if(maximumUmbriteNeed - currentUmbrite == 0) {
            return 0;
        }
        maximumUmbriteNeed -= currentUmbrite;
        return maximumUmbriteNeed - currentUmbrite;
    }
    
    
    
    //Methods to calculate poetics needed for each non RNG item 
    //the poeticsPer1 variable in each method represents the cost in poetics for 1 of that item
    public int returnPoeticsNeedOil(int oilPoeticsPer1) {
        return oilNeeded * oilPoeticsPer1;
    }
    
    public int returnPoeticsNeedCluster(int clusterPoeticsPer1) {
        return singingClusterNeeded * clusterPoeticsPer1;
    }
    
    public int returnPoeticsNeedPneumite(int pneumitePoeticsPer1) {
        return pneumiteNeeded * pneumitePoeticsPer1;
    }
    
    public int returnPoeticsNeedInk(int inkPoeticsPer1) {
        return inkNeeded * inkPoeticsPer1;
    }
    /*
    
    create calculation methods for the other poetics items that aren't random
    
    
    */
}
