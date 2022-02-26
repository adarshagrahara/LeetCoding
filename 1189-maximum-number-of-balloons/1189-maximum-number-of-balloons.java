class Solution {
    public int maxNumberOfBalloons(String text) {
        
        int arr[]=new int[5];
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='b')
                arr[0]=arr[0]+1;
             else if(text.charAt(i)=='a')
                arr[1]=arr[1]+1;
             else if(text.charAt(i)=='l')
                arr[2]=arr[2]+1;
             else if(text.charAt(i)=='o')
                arr[3]=arr[3]+1;
             else if(text.charAt(i)=='n')
                arr[4]=arr[4]+1;
        }
        arr[2]=arr[2]/2;
        arr[3]=arr[3]/2;
        int min=10000;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=Math.min(min,arr[i]);
        }
        return min;
    }
}