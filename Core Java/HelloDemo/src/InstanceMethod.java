public class InstanceMethod {
    public static void main(String[] args) {
        //Creating an object of the class
        InstanceMethod obj = new InstanceMethod();
        //Invoking instance method
        System.out.println("The sum is"+obj.add(12,13));
    }
    int s;
    //user Defined method because we have not used static keyword
    public int add(int a, int b){
        s = a+b;
        return s;
    }
}

