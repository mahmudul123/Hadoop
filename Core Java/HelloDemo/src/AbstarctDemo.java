abstract class Myclass {
    // abstract void M_name()
    abstract void display();
}
public class AbstarctDemo extends Myclass
{
    @Override
    //method implementation
    void display() {
        System.out.println("ABM");

    }

    public static void main(String[] args) {
        AbstarctDemo demo = new AbstarctDemo();
        demo.display();
    }
}
