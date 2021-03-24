public class BasicJavaTest {
    public static void main(String[] args){
    BasicJava basic = new BasicJava();
    basic.pnums();

    basic.pnumsOdd();
    
    basic.psums();

    int[] a= {2,4,5,6,9};
    basic.itarray(a);

    int[] b= {2,-4,5,6,-9};
    basic.findmax(b);

    int[] c= {2,3,4};
    basic.getavg(c);

    basic.oddary();

    int[] d={2,4,8,9,63,100};
    basic.greaty(d,10);

    int[] e={2,4,5};
    basic.sqvals(e);

    int[] f={1,5,10,-2};
    basic.elimneg(f);

    int[] g={1,5,10,-2};
    basic.maxminavg(g);

    int[] h={1,5,10,7,-2};
    basic.shiftyvals(h);
}
}