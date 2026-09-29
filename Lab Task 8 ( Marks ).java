class Marks {

    int mark1;
    int mark2;
    int mark3;

    Marks() {
        mark1 = 3;
        mark2 = 5;
        mark3 = 7;
    }

    Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    int sum() {
        return mark1 + mark2 + mark3;
    }

    public static void main(String[] args) {

        Marks m1 = new Marks();
        Marks m2 = new Marks(80, 75, 90);

        System.out.println("Sum of Marks 1: " + m1.sum());
        System.out.println("Sum of Marks 2: " + m2.sum());
    }
}