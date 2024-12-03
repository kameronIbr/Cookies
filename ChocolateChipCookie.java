class ChocolateChipCookie {
    // Instance variables
    double cookieDiameter = 0.0;
    int chipCount = 0;

    public ChocolateChipCookie() {
    }

    public ChocolateChipCookie(double diameter, int numberOfChips) {
        cookieDiameter = diameter; // Assigning  value to instance variable
        chipCount = numberOfChips; // Assigning  value to instance variable
    }

    public double getDiameter() {
        return cookieDiameter;
    }

    public void setDiameter(double diameter) {
        cookieDiameter = diameter; // Assigning directly
    }

    public int getNumberOfChips() {
        return chipCount;
    }

    public void setNumberOfChips(int numberOfChips) {
        chipCount = numberOfChips; // Assigning directly
    }

    // Method to calculate the area of the cookie
    public double findArea() {
        return Math.PI * (cookieDiameter / 2) * (cookieDiameter / 2);
    }

    // Method to calculate the number of chips per unit area
    public double chipsPerUnitArea() {
        return chipCount / findArea();
    }
}
