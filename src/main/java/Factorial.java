/**
 * Created by Евгений on 12.03.2017.
 */
public class Factorial {
    int fact(int num) {
        if(num==1) return 1;
        return fact(num-1)*num;
    }
}
