public class Modulus {
    public static void main(String[] args) {
        System.out.println(powerMode(3, 4, 7));
    }

    public static int powerMode(int a , int n, int p){
        int power = 1;
        for(int i = 0; i < n; i++){
            power = power * a;
        }
        int ans = power % p;
        return ans;
    }
}
