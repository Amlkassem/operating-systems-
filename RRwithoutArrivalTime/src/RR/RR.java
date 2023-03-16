package RR;
import java.util.Scanner;  
public class RR {
	public static void main(String args[])  
	{  
	int n,i,qt,count=0,temp,sq=0;  
	float awt=0,atat=0; 
	Scanner s=new Scanner(System.in); 
	System.out.print("Enter the quantum time: ");  
	qt = s.nextInt();   
	System.out.print("Enter no of process: ");  
	n = s.nextInt();  
	int[] bt = new int[n];  
	int[] wt = new int[n];  
	int[] ta = new int[n];  
	int[] rem_bt = new int[n];  
	for (i=0;i<n;i++)  
	{  
	System.out.println ("enter process " + (i+1) + " brust time:");	 
	bt[i] = s.nextInt();  
	rem_bt[i] = bt[i];  
	}  
	
	while(true)  
	{  
	for (i=0,count=0;i<n;i++)  
	{  
	temp = qt;  
	if(rem_bt[i] == 0)  
	{  
	count++;  
	continue;  
	}  
	if(rem_bt[i]>qt)  
	rem_bt[i]= rem_bt[i] - qt;  
	else  
	if(rem_bt[i]>=0)  
	{  
	temp = rem_bt[i];  
	rem_bt[i] = 0;  
	}  
	sq = sq + temp;  
	ta[i] = sq;  
	}  
	if(n == count)  
	break;  
	}  
	 
	System.out.print("\nProcess Burst Time Turnaround Time Waiting Time\n");  
	for(i=0;i<n;i++)  
	{  
	wt[i]=ta[i]-bt[i];  
	awt=awt+wt[i];  
	atat=atat+ta[i];  
	System.out.print("\n "+(i+1)+"\t "+bt[i]+"\t\t "+ta[i]+"\t\t "+wt[i]+"\n");  
	}  
	awt=awt/n;  
	atat=atat/n;  
	System.out.println("\nAverage waiting Time = "+awt+"\n");  
	System.out.println("Average turnaround time = "+atat);  
	} 
}
