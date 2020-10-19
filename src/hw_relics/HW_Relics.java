/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_relics;
import java.util.Scanner;
/**
 *
 * @author luckyseven67
 */
public class HW_Relics {

    
    public static void main(String[] args) {
        
        
        Calculate_Values calcValues = new Calculate_Values();
        HeavenswardRelicCount hwRC = new HeavenswardRelicCount(3);
        
        //System.out.println(hwRC.getRelicCount() * Poetics.UNIDENTIFIABLE_BONES.getNeededOneRelic());
        
        System.out.println(calcValues.totalOresNeeded(Poetics.UNIDENTIFIABLE_BONES.getNeededOneRelic(), hwRC.getRelicCount()));
        
        System.out.print("How many bones do you currently have?");
        Scanner scanner = new Scanner(System.in);
        int currentOres = scanner.nextInt();
        
        hwRC.addOres(currentOres);
        
        System.out.println();
        
    }
    
}
