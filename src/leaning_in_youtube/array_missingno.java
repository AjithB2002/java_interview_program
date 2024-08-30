package leaning_in_youtube;
public class array_missingno {
    public static void main(String[] args) {
        int[] a= {1,0,2,4,3,6,7,8,9};
        int sum=0;
        int n =a.length;
        for (int i=0;i<n;i++) {
            sum = sum + a[i];
        }
        n = n*(n+1)/2;
           int ans = n-sum;
           System.out.println(ans);
    }
}
