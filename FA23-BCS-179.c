#include<stdio.h>

int main()
{
    int marks, n;
    float count,total,average;
    n = 1;
    while(n){
    count = 0;
    total = 0;
    //print the university title
    printf("COMSATS University Islamabad,\nLahore Campus\n\n");
    printf("Enter marks [0-100] -1 to exit :");
    scanf("%d",&marks);
    //loop will exit when user enters -1
    while(marks!=-1)
    {
        //checking weather  number entered is between 0-100 or not.
        if(marks>=0 && marks<=100)
        {
            total += marks;//adding marks to total
            count++;//adding 1 in count
        }
        else
        {
            printf("Invalid marks!!!\n");//showing this if marks entered are out of range
        }
        printf("Enter marks [0-100] -1 to exit :");
        scanf("%d",&marks);//taking marks every time the loop runs
    }
    average = total/count;//calculating average
    printf("Total Marks : %.0f\n", total);//printing total marks
    printf("Average Marks : %.2f\n\n", average);//printing average of marks
    printf("Enter 1 to repeat program and 0 to end :");
    scanf("%d",&n);
    }
    return 0;
}
