package hw_relics;
import java.io.Serializable;

enum Light implements Serializable{
    VAGUE(8),
    MEAGER(16),
    VIGOROUS(24),
    ROBUST(48),
    STURDY(64),
    HARDENED(96),
    STALWART(128);
    
    
    private int lightLevel;
    
    Light(int lightLevel) {
        this.lightLevel = lightLevel;
    }
    
    
    public int getLightLevel() {
        return lightLevel;
    }
}
