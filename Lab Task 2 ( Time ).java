public class Time {
    int Hours;
    int Minutes;
    int Seconds;

public void Add(){
    System.out.println("We can add Time ");
}

public void Display(){
    System.out.println("We can display time ");
}

public void Edit(){
    System.out.println("We can edit time ");
}

public void display(){
    System.out.println("Time : "+Hours+" h :"+Minutes+" m :"+Seconds+" s");


}

public static void main(String[]args){

Time t1 = new Time();
t1.Hours=12;
t1.Minutes=5;
t1.Seconds=1;

Time t2 = new Time();
t2.Hours=6;
t2.Minutes=2;
t2.Seconds=12;

t1.display();
t2.display();


}

}
