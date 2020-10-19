package hw_relics;
import java.io.Serializable;

enum Beast_Tribe_Tokens implements Serializable{
    TOKEN_BONE(3, 6, 6, 18),
    TOKEN_SHELL(3, 6, 6, 18),
    TOKEN_ORE(3, 6, 6, 18),
    TOKEN_SEEDS(3, 6, 6, 18);
    
    
    //arr means Amalj'aa, Sahagin, Kobold and Sylph
    private int arrTokens;
    private int vanuVanuTokens;
    private int vathTokens;
    private int moogleTokens;
    
    Beast_Tribe_Tokens(int arr, int vvToken, int vToken, int mToken) {
        arrTokens = arr;
        vanuVanuTokens = vvToken;
        vathTokens = vToken;
        moogleTokens = mToken;
    }
    
    
    public int getArrTokens() {
        return arrTokens;
    }
    
    public int getVanuVanuTokens() {
        return vanuVanuTokens;
    }
    
    public int getVathTokens() {
        return vathTokens;
    }
    
    public int getMoogleTokens() {
        return moogleTokens;
    }
}
