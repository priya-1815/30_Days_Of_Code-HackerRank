
    public int l;
    public int min;
    public int max;
	// Add your code here
    public Difference(int []arr)
    {
        this.elements=arr;
        this.l=arr.length;
    }
    public int computeDifference()
    {
        //int l1=this.elements.length;
        min=elements[0];
        max=0;
        for(int i=0;i<l;i++)
        {
            if(elements[i]<min)
                min=elements[i];
            if(elements[i]>max)
                max=elements[i];    
        }
        maximumDifference=max-min;
        return maximumDifference;
    }