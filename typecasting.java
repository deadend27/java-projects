public class typecasting {
    public static void main(String[] args){
        int n = 10;
        long nl = n;
        float nf = nl;
        double nd = nf;

        System.out.println("int n = " + n);
        System.out.println("long nl = " + nl);
        System.out.println("float nf = " + nf);
        System.out.println("double nd = " + nd);

        nf = (float)nd;
        nl = (long)nf;
        n = (int)nl;

        System.out.println();

        System.out.println("int n = " + n);
        System.out.println("long nl = " + nl);
        System.out.println("float nf = " + nf);
        System.out.println("double nd = " + nd);
    }
}
