public class decrement {
    public static void main(String[] args) {
        int n = 5;
        n--;
        
        System.out.println("pre decrement");
        System.out.println("n = " + n);
        System.out.println("n = " + (--n));
        System.out.println("n = " + n);

        System.out.println();

        --n;
        System.out.println("post decrement");
        System.out.println("n = " + n);
        System.out.println("n = " + (n--));
        System.out.println("n = " + n);
    }
    
}
