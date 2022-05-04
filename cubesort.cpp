#include<bits/stdc++.h>
using namespace std;
void cubesort(int arr[], int n)
{
    int i,j,temp;
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            int a=pow(arr[i],3);
            int b=pow(arr[j],3);
            if(a>b)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
int main()
{
    int arr[] = {4, -2, 0, 5, -9, 3};
    int n = sizeof(arr)/sizeof(arr[0]);
    cubesort(arr, n);
    for(int i=0;i<n;i++)
        cout<<arr[i]<<" ";
}