class Solution {

    public int GetSquaredSum(int n) {
        int ans = 0;
        while (n != 0) {
            int rem = n%10;
            ans += (rem * rem);
            n /= 10;
        }
        return ans;
    }
    
    public boolean isHappy(int n) {
        if (n == 1) return true;
        
        HashSet<Integer> h = new HashSet<>();
        while (true) {
            int sum = GetSquaredSum(n);
            if (sum == 1) return true;
            if (h.contains(sum)) return false;
            h.add(sum);
            n = sum;
        }
    }
}
