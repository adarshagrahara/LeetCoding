class Solution {
    public int romanToInt(String s) {
        int sum=0;
if(s.charAt(0)=='I')
{
sum=1;
}
else if(s.charAt(0)=='V')
{
sum=5;
}
else if(s.charAt(0)=='X')
{
sum=10;
}
else if(s.charAt(0)=='L')
{
sum=50;
}
else if(s.charAt(0)=='C')
{
sum=100;
}
else if(s.charAt(0)=='D')
{
sum=500;
}
else
{
sum=1000;
}
for(int i=1;i<s.length();i++)
{
if(s.charAt(i)=='I')
{
sum=sum+1;
}
if(s.charAt(i)=='V')
{
sum=sum+5;
if(s.charAt(i-1)=='I')
{
sum=sum-2;
}
}
if(s.charAt(i)=='X')
{
sum=sum+10;
if(s.charAt(i-1)=='I')
{
sum=sum-2;
}
}
if(s.charAt(i)=='L')
{
sum=sum+50;
if(s.charAt(i-1)=='X')
{
sum=sum-20;
}
}
if(s.charAt(i)=='C')
{
sum=sum+100;
if(s.charAt(i-1)=='X')
{
sum=sum-20;
}
}
if(s.charAt(i)=='D')
{
sum=sum+500;
if(s.charAt(i-1)=='C')
{
sum=sum-200;
}
}
if(s.charAt(i)=='M')
{
sum=sum+1000;
if(s.charAt(i-1)=='C')
{
sum=sum-200;
}
}
}
return sum;
    }
}