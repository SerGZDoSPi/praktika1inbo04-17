public class Main {

    public static void main(String[] args) {
        MovableCircle MyCircle = new MovableCircle(66, 103, 10, 10, 21);
        System.out.println(MyCircle.toString());
        MyCircle.moveDown();
        MyCircle.moveRight();
        System.out.println(MyCircle.toString());
    }
}
