public class RectangleRunner {
    public static void main(String[] arg) {

        Rectangle plot1 = new Rectangle(150, 200);
        System.out.println();
        System.out.println("Plot 1 length: " + plot1.getLength());
        System.out.println("Plot 1 width: " + plot1.getWidth());

        int area = plot1.calculateArea();
        System.out.println("Plot 1 area: " + area);

        Rectangle plot2 = new Rectangle(125);
        System.out.println();
        System.out.println("Plot 2 length: " + plot2.getLength());
        System.out.println("Plot 2 width: " + plot2.getWidth());

        area = plot2.calculateArea();
        System.out.println("Plot 2 area: " + area);

        Rectangle plot3 = new Rectangle();
        System.out.println();
        System.out.println("Plot 3 length: " + plot3.getLength());
        System.out.println("Plot 3 width: " + plot3.getWidth());

        area = plot3.calculateArea();
        System.out.println("Plot 3 area: " + area);

        plot1.setWidth(75);
        plot2.setWidth(75);
        plot3.setWidth(75);
        plot2.setLength(75);

        int totalArea = 0;
        area = plot1.calculateArea();
        totalArea = totalArea + area;

        area = plot2.calculateArea();
        totalArea = totalArea + area;

        area = plot3.calculateArea();
        totalArea = totalArea + area;


        System.out.println();
        System.out.println("The three plots requires " + totalArea + " square feet of seed.");
    }
}
