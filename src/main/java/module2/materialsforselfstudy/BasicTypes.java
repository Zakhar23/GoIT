package module2.materialsforselfstudy;

/**
 * Created by Home on 31.10.2016.
 */
public class BasicTypes {
    public static void main(String[] args) {

        // 1
        char q = 21, w = 8;
        System.out.println(q/((double)w));
        //System.out.println(q/w);


        // 2
        char n = 99;
        int a = (int)n/10;
        int b = (int)n%(a*10);
        System.out.println(a+b);

        // 3
        double c = 3.5;
        int d = (int)(c+1);
        int e = (int)c;

        if (((double)d - c) < c - ((double)e)) {
            System.out.println(d);
        }else if (((double)d - c) > c - ((double)e)) {
            System.out.println(e);
        }else{
            System.out.println("this is "+e+" and " + d);
        }

        // 4
        char g = 125;
        int f = (int)g/100;
        int m = ((int)g/10)%10;
        int o = (int)g%(f*10+m);
        System.out.println(f+m+o);
    }
}
