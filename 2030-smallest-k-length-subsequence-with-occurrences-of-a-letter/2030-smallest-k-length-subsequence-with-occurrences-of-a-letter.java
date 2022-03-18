class Solution {
    int n;
    char[] arr;
    int[] sizes, pointers;
    int[][] indices;
    
    public String smallestSubsequence(String s, int k, char letter, int r) {
        init(s);
        char[] ans = new char[k];
        int c = letter - 'a';
        for(int i=0; i<k-r; ++i) {
            int rth = (r == 0 ? n : indices[c][sizes[c] - r]), x = Math.min(rth, n - (k-i));
            for(int j=0; j<26; ++j) if(pointers[j] < sizes[j]) {
                int first = indices[j][pointers[j]];
                if(x >= first) {
                    ans[i] = arr[first];
                    if(j == c && r > 0)
                        --r;
                    for(j=0; j<26; ++j)
                        while(pointers[j] < sizes[j] && indices[j][pointers[j]] <= first)
                            ++pointers[j];
                    break;
                }
            }
        }
        for(int i=k-r; i<k; ++i)
            ans[i] = letter;
        return String.valueOf(ans);
    }
    
    private void init(String s) {
        arr = s.toCharArray();
        n = arr.length;
        sizes = new int[26];
        pointers = new int[26];
        for(char c: arr)
            ++sizes[c-'a'];
        indices = new int[26][];
        for(int i=0; i<26; ++i) {
            indices[i] = new int[sizes[i]];
            sizes[i] = 0;
        }
        for(int i=0; i<n; ++i) {
            int c = arr[i] - 'a';
            indices[c][sizes[c]++] = i;
        }
    }
}