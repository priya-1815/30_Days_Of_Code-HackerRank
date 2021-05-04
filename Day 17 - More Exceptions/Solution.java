
//Write your code here
class Calculator{
    int power(int n,int p) throws Exception
    {
        int ans=0;
        if(n>0 && p>0)
        {
            ans=1;
            for(int i=1;i<=p;i++)
            ans=ans*n;
            
        }
        else if(n==0)
            ans=0;
        else if(p==0)
            ans=1;
        else
            throw new Exception("n and p should be non-negative");
        return ans;
    }
}

