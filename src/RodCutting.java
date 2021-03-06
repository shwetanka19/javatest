/**
 * Created by shwetanka on 6/11/17.
 */
public class RodCutting {
    public static void main(String args[]){
        int[] rod = new int[]{1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(maxProfit(rod));
    }

    static int maxProfit(int [] rod){
        if (rod.length==0){
            return 0;
        }
        int [] max = new int[rod.length+1];
        max[0] = 0;
        for (int i=1;i<max.length;i++){
            max[i] = rod[i-1];
        }

        for (int i=1;i<max.length;i++){
            for (int j=0;j<=i/2;j++){
                max[i] = Math.max(max[i], rod[j] + max[i-j-1]);
            }
        }
        for (int i=0;i<max.length;i++){
            System.out.print(max[i]+", ");
        }
        return max[max.length-1];
    }
}
