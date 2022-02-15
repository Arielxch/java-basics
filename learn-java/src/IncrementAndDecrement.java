public class IncrementAndDecrement {
    public static void main(String[] args) {
        //prefix: ++i increments the value of i by 1 and uses the new value in the statement;
        int i = 1;
        int j = ++i;
        System.out.println(i);
        System.out.println(j);

        //postfix: i++ increments the value of i by 1 and uses the original value in the statement;
        int x = 1;
        int y = x++;
        System.out.println(x);
        System.out.println(y);

        // prefix: --i decrements the value of i by 1 and uses the new value in the statement;
        int k = 2;
        int f = --k;
        System.out.println(k);
        System.out.println(f);

        // postfix: i-- decrements the value of i by 1 and uses the original value in this statement;
        int h = 5;
        int v = h--;
        System.out.println(h);
        System.out.println(v);


    }

}
