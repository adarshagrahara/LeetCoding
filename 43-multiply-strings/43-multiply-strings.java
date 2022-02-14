class Solution {
    public String multiply(String num1, String num2) {
        int carry=0,k=0,l=0;
    
    if(num1.equals("0") || num2.equals("0")) return "0";
    
	StringBuilder res=new StringBuilder();
	char[] c1=num1.toCharArray();
	char[] c2=num2.toCharArray();
    int[] res1=new int[c2.length+c1.length];
    
    for(int i=c1.length-1;i>=0;i--){
        k=0;
        carry=0;
	    for(int j=c2.length-1;j>=0;j--)  {
            int a= i>=0 ? c1[i] -'0' :1;
            int b= j>=0 ? c2[j] -'0' :1;
	    	int prod= a*b+carry;
            int n1=(res1[k+l] + prod)%10 ;
            carry=(res1[k+l] + prod)/10;
            res1[k+l]=n1;
            k++;		    	
	    }
        if(carry !=0)
        res1[k+l]=carry;
        l++;
    
    }

    for(int num:res1){
        res.append(num);
    }
    
    if(res.charAt(res.length()-1) =='0')
       res.deleteCharAt(res.length()-1);
	   return res.reverse().toString();
    }
}