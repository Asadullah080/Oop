 class Rectangle {
    double length;
    double width;

    public void Change(){
        System.out.println("We can change the length and width of rectangle");
    }

    public void Area(){
        System.out.println("We can find the Area of rectangle ");
    }

    public void Parameter(){
        System.out.println("We can find the parameter of rectangle ");
    }

    public void display(){
        System.out.println("Length : "+ length);
        System.out.println("Width  : "+ width);


    }

    public static void main(String[]args){

   Rectangle r1= new Rectangle();
   r1.length=10;
   r1.width=5;

   r1.display();

    }
}
