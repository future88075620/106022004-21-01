import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        x=in.nextInt();
        if(x<=40)
            System.out.printf("%d\n",x*100);
        else
                System.out.printf("%d\n",4000+(x-40)*120);


    }
}
