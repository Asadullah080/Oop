 class M_Car {

    String Brand;
    String Model;
    String Color;
    int Price;
    int Speed;

    public void Accelerate(){
        System.out.println("A car can Accelerate");
    }
    public void Brake(){
         System.out.println("A car can Brake");
    }
    public void On(){
        System.out.println("A car can be turned ON");
    }

    public void Off(){
        System.out.println("A car can be turned OFF");
    }

    public void display(){

        System.out.println("----------------------------------");
        System.out.println("Brand   : "+ Brand);
        System.out.println("Model   : "+ Model);
        System.out.println("Color   : "+ Color);
        System.out.println("Price   : "+ Price);
        System.out.println("Speed   : "+ Speed);


    }

    public static void main(String[] args) {

        M_Car c1= new M_Car();
        c1.Brand= "Honda";
        c1.Model= "VSS2 11";
        c1.Color= "White";
        c1.Price= 50000;
        c1.Speed= 150;

        M_Car c2= new M_Car();
        c2.Brand= "Suzuki";
        c2.Model= "Kmms2";
        c2.Color= "Black";
        c2.Price= 30000;
        c2.Speed= 120;

        c1.display();
        c2.display();




    }
}