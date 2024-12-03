// TestCookies.java
// Kameron Ibraheem
// Lab 05: TestCookies
//

public class TestCookies {
    public static void main(String[] args) {
        
        ChocolateChipCookie c1 = new ChocolateChipCookie();
        
        // Set the instance variables
        c1.setDiameter(2.5);
        c1.setNumberOfChips(25);
        
        ChocolateChipCookie c2 = new ChocolateChipCookie();
        c2.setDiameter(4.5);
		c2.setNumberOfChips(30);
        // Display output
        System.out.println("**A cookie story**");
		
        // Display output for c1
        System.out.println("I am a Chocolate Chip Cookie with " + String.format("%.2f", c1.getDiameter()) + " inches in diameter. I have " + String.format("%.2f", c1.chipsPerUnitArea()) + " chips in a single square inch.");
        
        // Display output for c2
        System.out.println("I am a Chocolate Chip Cookie with " + String.format("%.2f", c2.getDiameter()) + " inches in diameter. I have " + String.format("%.2f", c2.chipsPerUnitArea()) + " chips in a single square inch.");
    }
}
