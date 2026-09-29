class Circle {

    double radius;

    Circle() {
        radius = 5;
    }

    Circle(double r) {
        radius = r;
    }

    double circumference() {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(10);

        System.out.println("Circle 1 Circumference: " + c1.circumference());
        System.out.println("Circle 2 Circumference: " + c2.circumference());
    }
}