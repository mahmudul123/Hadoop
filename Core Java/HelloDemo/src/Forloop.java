public class Forloop {
    public static void main(String[] args) {
        //print sum of first 10 natural number
        int sum = 0;
        for (int j=1;j<=11;j++) {// 0+1+2+3+4+5+6+7+8+9+10+11 = 66
            sum = sum + j;
        }
        System.out.println("The sum of first natural number is" +sum);
    }
}
