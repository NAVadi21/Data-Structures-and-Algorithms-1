import java.util.*;

class RopeCutting {
    static int get_max(int n, int a, int b, int c, int[] dp) {
        if (n < 1)
            return -1;

        if (dp[n] != 0)
            return dp[n];

        int x = -1, y = -1, z = -1;

        if (n >= a)
            x = get_max(n - a, a, b, c, dp);

        if (n >= b)
            y = get_max(n - b, a, b, c, dp);

        if (n >= c)
            z = get_max(n - c, a, b, c, dp);

        int ans = Math.max(x, Math.max(y, z));
        dp[n] = (ans != -1) ? ans + 1 : -1;

        return dp[n];
    }

    public static void main(String args[]) {
        Scanner I = new Scanner(System.in);
        int n = I.nextInt(), a = I.nextInt(), b = I.nextInt(), c = I.nextInt();
        int[] dp = new int[n + 1];
        int ans = get_max(n, a, b, c, dp);
        System.out.println("Answer: " + ans);
        I.close();
    }
}

//time complexity of this code is reduced to 2^n by using memoization because we used an array dp to store different values of rope 
//memoization helped reduce complexity by storing the computed values rather than recomputiing the value of n
/*  
//DP Solution for the same
    #include<bits/stdc++.h>   //Given that a way to cut the ribbon exists therefore {a*x + b*y +c*z = n}
                              //Task is to maximise x+y+z
    using namespace std;
    int main()
    {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        cout.tie(NULL);
        int n,a,b,c,x=-1,y=-1,z=-1;
        cin >> n >> a >> b >> c;
        int dp[n+1] = {};
        dp[0] = 0;
        for(int i = 1;i<=n;i++,x = -1,y=-1,z=-1)
        {
            x = ((i >= a) ? dp[i-a] : -1);
            y = ((i >= b) ? dp[i-b] : -1);
            z = ((i >= c) ? dp[i-c] : -1);
            if(x+y+z == -3)
              dp[i] = -1;
            else
              dp[i] = max({x,y,z}) + 1;
        }
        cout << dp[n];
        return 0;
    }
*/
