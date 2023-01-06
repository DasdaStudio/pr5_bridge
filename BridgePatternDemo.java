public class BridgePatternDemo {
    public static void main(String[] args){
        Shape redCircle = new Circle(0, 20, 4, new RedPen());
        Shape greenCircle = new Circle(2, 20, 4, new GreenPen());

        redCircle.draw();
        greenCircle.draw();

        Shape redSquare = new Square(5, 4, 23, new RedPen());
        Shape greenSquare = new Square(4, 6, 2, new GreenPen());

        redSquare.draw();
        greenSquare.draw();
    }
}
