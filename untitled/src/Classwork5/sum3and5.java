package Classwork5;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class sum3and5 {

    public static int sum3And5(int n) {
        int x = 0;
        int y = 0;
        for(int i=n; i <= 1000; i++) {
            if((i % 3 == 0) && (i % 5 == 0 )) {
                System.out.println(i + " is divisible by three and five" );
                x += i;
                y += 1;
                if( y == 5) {
                    break;
                }

            }

        }
        System.out.println("total sum = " + x);
        return x;
    }
}
