    // Declare second integer, double, and String variables.
    int a;
    double b;
    char str[100];
    scanf("%d",&a);
    scanf("%lf",&b);
    scanf("%*[\n]%[^\n]",str);
    // Read and save an integer, double, and String to your variables.
    
    // Print the sum of both integer variables on a new line.
    printf("%d\n",i+a);
    // Print the sum of the double variables on a new line.
    double sum =b+d;
    printf("%.1lf\n",sum);
    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.
   // strcat(s,str);
    printf("%s%s",s,str);