package arraylist;

public class ListApp {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.addItem("Hello");
        stringList.addItem("World");

        ArrayList<Square> squareList = new ArrayList<>();
        squareList.addItem(new Square(5.0));
        squareList.addItem(new Square(7.0));

        ArrayList<PointThreeD> pointList = new ArrayList<>();
        pointList.addItem(new PointThreeD(1.0, 2.0, 3.0));
        pointList.addItem(new PointThreeD(4.0, 5.0, 6.0));

        System.out.println("String List:");
        System.out.println(stringList);

        System.out.println("\nSquare List:");
        System.out.println(squareList);

        System.out.println("\nPoint3D List:");
        System.out.println(pointList);
    }
}
