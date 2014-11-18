/**
 * Created by dwight on 11/18/14.
 */
public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        displayData(rectangle);

        rectangle = new Rectangle(15, 10);
        displayData(rectangle);
    }

    public static void displayData(Rectangle rect) {
        System.out.println("Current Dimensions: \n" + rect);
        System.out.printf("Area: %.2f\nPerimeter: %.2f\n\n", rect.calcArea(), rect.calcPerimeter());
    }
}
