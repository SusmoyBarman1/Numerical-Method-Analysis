#include<bits/stdc++.h> 
using namespace std; 
#define MAX_ITER 1000000 
  
// Regular falsi Method. The function is x^3 - x^2  + 2 
double func(double x) 
{ 
    return x*x*x - x*x + 2; 
} 
  
void regulaFalsi(double x0, double x1) 
{ 
    if (func(x0) * func(x1) >= 0) 
    { 
        cout << "You have not assumed right a and b\n"; 
        return; 
    } 
  
    double x2 = x0;  // Initialize result 
  
    for (int i=0; i < MAX_ITER; i++) 
    { 
        x2 = (x0*func(x1) - x1*func(x0))/ (func(x1) - func(x0)); 
  
        if (func(x2)==0) 
            break; 
  
        else if (func(x2)*func(x0) < 0) 
            x1 = x2; 
        else
            x1 = x2; 
    } 
    cout << "The value of root is : " << x2; 
} 

int main() 
{ 
    double a,b,i;
    i=-10;
    while(true)
    {
    //	cout<<"loop: 1 , i ="<<i<<endl;
    	if(func(i)<0)
    	{
    		a = i;
    		while(true)
    		{
    		//	cout<<"loop: 2 , i ="<<i<<endl;
    			if(func(i)>0)
    			{
    				b = i;
    				break;
				}
				i++;
			}
			break;
		}
		i++;
	}
    regulaFalsi(a, b); 
    return 0; 
} 
