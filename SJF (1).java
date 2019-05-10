import java.util.*; 
class SJF 
{ 
public static void main(String args[]) 
{  
Scanner sc=new Scanner(System.in); 
int n,B[],W[],T[], O[]; 
System.out.println("Enter no of process"); 
n=sc.nextInt(); 
B=new int[n+1]; 
W=new int[n+1]; 
T=new int[n+1];
O=new int[n+1];
float A=0;
float AT=0;
System.out.println("Enter Burst time for each process"); 
for(int i=0;i<n;i++) 
{ 
System.out.println("Enter BT for process "+(i+1)); 
B[i]=sc.nextInt(); 
O[i]=i+1;
}for(int i=0;i<n;i++) 
{
W[i]=0; T[i]=0; 
} 
int temp; 
for(int i=0;i<n-1;i++) 
{
for(int j=0;j<n-1;j++) 
{ 
if(B[j]>B[j+1])    
{
temp=B[j]; 
B[j]=B[j+1]; 
B[j+1]=temp; 
temp=O[j]; 
O[j]=O[j+1]; 
O[j+1]=temp; 
}}
} 
for(int i=0;i<n;i++) 
{
    T[i]=B[i]+W[i]; 
    W[i+1]=T[i]; 
} 
T[n]=W[n]+B[n]; 
for(int j=0;j<n;j++)
 {
    T[j]=W[j]+B[j];
    A+=W[j]; 
}
System.out.println("  PROCESS   BT      WT      TAT     "); 
for(int i=0;i<n;i++) 
System.out.println("    "+ O[i] + "       "+B[i]+"       "+W[i]+"       "+T[i]); 
A=A/n; 
System.out.println("***********************************************"); 
System.out.println("Avg waiting time="+A+"\n***********************************************"); 
for(int i=0;i<n;i++) 
{ 
T[i]=W[i]+B[i]; 
AT=AT+T[i]; 
}
AT=AT/n; 
System.out.println("***********************************************"); 
System.out.println("Avg turn around time="+AT+"\n***********************************************"); 
} 
}
