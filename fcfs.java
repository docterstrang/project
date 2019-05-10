import java.io.*; 
class fcfs 
{ 
public static void main(String args[]) throws Exception 
{ 
int n,A[],B[],W[],T[]; 
float AW=0;
float AT=0;
InputStreamReader isr=new InputStreamReader(System.in); 
BufferedReader br=new BufferedReader(isr); 
System.out.println("Enter no of process"); 
n=Integer.parseInt(br.readLine()); 
B=new int[n]; 
W=new int[n]; 
T=new int[n]; 
A=new int[n]; 
System.out.println("Enter Burst time for each process\n******************************"); 
for(int i=0;i<n;i++) 
{ 
System.out.println("Enter BT for process "+(i+1)); 
B[i]=Integer.parseInt(br.readLine()); 
} 
System.out.println("***********************************************"); 
for(int i=0;i<n;i++) 
{ 
System.out.println("Enter AT for process"+(i+1)); 
A[i]=Integer.parseInt(br.readLine()); 
} 
System.out.println("***********************************************"); 
W[0]=0;
for(int i=1;i<n;i++) 
{ 
W[i]=W[i-1]+B[i-1]+A[i-1]; 
W[i]=W[i]-A[i]; 
} 
for(int i=0;i<n;i++)
{ 
T[i]=W[i]+B[i]; 
AW=AW+W[i]; 
} 
System.out.println("  PROCESS   BT      WT      TAT     "); 
for(int i=0;i<n;i++) 
{
System.out.println("    "+ i + "       "+B[i]+"       "+W[i]+"       "+T[i]);
} 
AW=AW/n; 
System.out.println("***********************************************"); 
System.out.println("Avg waiting time="+AW+"\n***********************************************");
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
