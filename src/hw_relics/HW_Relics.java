package hw_relics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author luckyseven67
 */
public class HW_Relics {

    
    public static void main(String[] args) throws IOException {
        
        /* Testing
        Calculate_Values calcValues = new Calculate_Values();
        HeavenswardRelicCount hwRC = new HeavenswardRelicCount(3);
        
        //System.out.println(hwRC.getRelicCount() * Poetics.UNIDENTIFIABLE_BONES.getNeededOneRelic());
        
        System.out.println(calcValues.totalOresNeeded(Poetics.UNIDENTIFIABLE_BONES.getNeededOneRelic(), hwRC.getRelicCount()));
        
        System.out.print("How many ores do you currently have?");
        Scanner scanner = new Scanner(System.in);
        int currentOres = scanner.nextInt();
        
        hwRC.addOres(currentOres);
        
        System.out.println(); */
        
        boolean cont = true;
        
        while(cont) {
            cont = mainMenu();
        }
    }
    
    public static boolean mainMenu() throws FileNotFoundException, IOException, ClassNotFoundException {
        /*
        needs options to creating a new list of items needed
        options to check for each specific item
        option to add X amounts
        ...
        */
        //System.out.println("Test");
        boolean keepGoing = true;
        
        Scanner sc = new Scanner(System.in);
        HeavenswardRelicCount hwCount;
        FileOutputStream relicSaveFile = new FileOutputStream("Relic List.ser");
        ObjectOutputStream relicFile = new ObjectOutputStream(relicSaveFile);
        FileInputStream fileToLoad = new FileInputStream("Relic List.ser");
        
        System.out.println("Please enter an option for your choice. Choose 0 to break out of the menu: ");
        
        String choice = sc.nextLine();
        
        int choiceInt = attemptConvert(choice);
        
        switch(choiceInt) {
            case 1:
                System.out.println("Do you want to save progress or load?");
                System.out.print("Type save or load for your choice: (capitalization does not matter)");
                String userSaveOrLoad = sc.nextLine();
                if(userSaveOrLoad.equalsIgnoreCase("save")) {
                    saveList(hwCount, relicFile);
                } else if(userSaveOrLoad.equalsIgnoreCase("load")) {
                    hwCount = loadList(fileToLoad);
                }
                break;
            case 2:
                int numRelics = takeNumberInput(sc);
                hwCount = createRelicMaterialsList(numRelics);
                if(hwCount == null) {
                    System.out.println("List was not created.");
                }
                break;
            case 3: 
                break;
            case 0:
                keepGoing = false;
                break;
            default: 
                System.out.println("Enter a valid input.");
                break;
        }
        return keepGoing;
    }
    
    public static int attemptConvert(String str) {
        try {
            int temp = Integer.parseInt(str);
            return temp;
        } catch (NumberFormatException e){
            System.out.println("Unable to convert input into a number. Please enter a valid number");
            return -1;
        }
    }
    
    
    public static HeavenswardRelicCount createRelicMaterialsList(int numRelicsMaking) {    
        try {
            if(numRelicsMaking > 13) {
                throw new RelicCountOverflowException("Only 13 relics exist for Heavensward. Please choose a different number. ");
            }
            
            HeavenswardRelicCount hwRelicCount = new HeavenswardRelicCount(numRelicsMaking);
            return hwRelicCount;
        } catch (RelicCountOverflowException e) {
            System.out.println(e.getMessage());
        }
        
        
        return null;
    }
    
    public static int takeNumberInput(Scanner sc) {
        int num;
        do {
            System.out.println("Please enter a number: ");
            
            while(!sc.hasNextInt()) {
                String input = sc.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
            }
            num = sc.nextInt();
        } while(num <= 0);
        return num;
    }
    
    
    //two methods one for saving and one for loading
    //saveList should return a boolean to check if it saved or not.
    //or perhaps not
    public static void saveList(HeavenswardRelicCount relicListSaveObject, ObjectOutputStream oos) {
        if(relicListSaveObject == null) {
            System.out.println("No list created. There is nothing to save.");
        } else {
            try {
                oos.writeObject(relicListSaveObject);
            } catch (IOException ex) {
                System.out.println("Error finding file to save to.");
            }
        }
    }
    
    //returns null or the object if it failed to load. 
    public static HeavenswardRelicCount loadList(FileInputStream fis) throws ClassNotFoundException {
        ObjectInputStream fileLoad = null;
        try {
            HeavenswardRelicCount temp;
            fileLoad = new ObjectInputStream(fis);
            temp = (HeavenswardRelicCount) fileLoad.readObject();
            return temp;
        } catch (IOException ex) {
            System.out.println("Unable to find file to load.");
        } finally {
            try {
                fileLoad.close();
            } catch (IOException ex) {
                System.out.println("Unable to find t he file.");
            }
        }
        return null;
    }
}
