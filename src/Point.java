public class Point {
    // instance variables
    private int x;
    private int y;

    // constructor to create a point (with an object) with a specific x and y coord
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    // constructor to create a point (with an object) with the same x and y coord
    public Point (int samePoint) {
        x = samePoint;
        y = samePoint;
    }
    // constructor to create a point (with an object) with DEFAULT x and y coord
    public Point () {
        x = 0;
        y = 0;
    }

    //getter methods
    public int getX () {
        return x;
    }

    public int getY () {
        return y;
    }
    //setter methods
    public void setX (int newX) {
        x = newX;
    }

    public void setY (int newY) {
        y = newY;
    }

    //Methods with a String return type
    public String coordinate () {
        return ("(" + x + ", " + y + ")");
    }

    public String quadrant () {
        String quad = "";
        if (x > 0 && y == 0 || x < 0 && y == 0) {
            quad = "on a x axis";
        }
        if (x == 0 && y > 0 || x == 0 && y < 0) {
            quad = "on a y axis";
        }
        if (x > 0 && y > 0) {
            quad = "I";
        }
        if (x < 0 && y > 0) {
            quad = "II";
        }
        if (x < 0 && y < 0) {
            quad = "III";
        }
        if (x > 0 && y < 0) {
            quad = "IV";
        }
        if (x == 0 && y == 0) {
            quad = "origin";
        }
        return quad;
    }
}
