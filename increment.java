public class increment {
    public static void main(String[] args){
        int n = 5;
        n++;

        System.out.println("post increment");
        System.out.println("n = " + n);
        System.out.println("n = " + n++);
        System.out.println("n = " + n);

        System.out.println();

        ++n;
        System.out.println("n = " + n);
        System.out.println("n = " + (++n));
        System.out.println("n = " + n);

        System.out.println();

        n--;
        System.out.println("n = " + n);
        System.out.println("n = " + (--n));
        System.out.println("n = " + n);

        System.out.println();

        --n;
        System.out.println("n = " + n);
        System.out.println("n = " + (n--));
        System.out.println("n = " + n);

    }
}
