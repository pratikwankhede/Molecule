/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public 
class trying
{
	public static void mul(Stack sta, String st)
	{
		
		String nw = mult(sta.pop(),st);
		sta.push(nw);
	
	}
	
	
	public static void add(Stack sta, String st)
	{
		if(sta.isEmpty()){sta.push(st);}
		else{
		String nw = sum(sta.pop(),st);
		sta.push(nw);}
	}
	
	
	public static String getMass(char c,char[] ca, String[] mo)
	{int ind=0;
		for(int i=0;i<ca.length;i++)
		{
			if(c==ca[i]){ind=i; break;}
		}
		
		return mo[ind];
		
	}
	
	
	public static String mult(String A, String B)
	{String r="";
	 
		for(int i=0;i<Integer.parseInt(B);i++)
		{
			r=sum(A,r);
		//System.out.println(r);
		}
			return r;
	}
	
	
	public static String sum(String A, String B)
    {
        String s = (A.length()>B.length())?B:A;
	String l =  (A.length()>B.length())?A:B;

	while(s.length()!=l.length())
{
s="0"+s;	
}	
int cry=0,n1,n2,ss,d; String t="",t2;
for(int i=l.length()-1;i>=0;i--)
{ n1 = Integer.parseInt(Character.toString(l.charAt(i)));
 n2 = Integer.parseInt(Character.toString(s.charAt(i)));
ss=n1+n2+cry;
cry=ss/10; d=ss%10;
String g= Integer.toString(cry);
t2 = Integer.toString(d);


t=t2+t;
if(i==0&&cry!=0)t=g+t;
    
}
return t;
    }
    
	public static void merge(Stack st)
	{
		{String a =  st.pop();
		String b =  st.pop();
		st.push(sum(a,b));}
	
	}
    
    public static String Reverse(String A)
    {
        String t="";
        for(int i=A.length()-1;i>=0;i--)
        {
            t=t+A.charAt(i);
        }
        return t;
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		
		//String A="25"; String B="85";
	//System.out.println(mult(A,B));
	//System.out.println(getMass('O'));
		Scanner sc = new Scanner(new File("weight.txt"));
		int n = sc.nextInt();
		char[] elem = new char[n];
				String[] wt = new String[n];
				
		sc.nextLine();
		for(int i=0;i<n;i++)
		{String[] st = sc.nextLine().split(" ");
			char cc = st[0].charAt(0);
			elem[i]=cc;
			wt[i]=st[1];
		
		}
		Scanner sc2 = new Scanner(new File("formula.txt"));
		ArrayList<String> formulas = new ArrayList<String>();
		while(sc2.hasNextLine())
		{
			formulas.add(sc2.nextLine());
		}
			for(int j=0;j<formulas.size();j++)
			{
		String d = formulas.get(j);
	int l= d.length();
Stack stk = new Stack(l);
char cn;
String m="";
for(int i=0;i<l;i++)
{
	char c = d.charAt(i);
//	if(i==l-1&&(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')){  mul(stk,String.valueOf(d.charAt(i))); continue;}
	if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')continue;
	if(i!=l-1) cn = d.charAt(i+1) ; else cn='0';
	
	if(c=='('){stk.push("0"); continue;}
	if(c==')'){   if(cn=='1'||cn=='2'||cn=='3'||cn=='4'||cn=='5'||cn=='6'||cn=='7'||cn=='8'||cn=='9'){mul(stk,String.valueOf(cn));  if(stk.p>0)
		merge(stk); } continue;  }
	if(cn=='1'||cn=='2'||cn=='3'||cn=='4'||cn=='5'||cn=='6'||cn=='7'||cn=='8'||cn=='9')
	
		m=mult(getMass(c,elem,wt),String.valueOf(cn));
	
	else m = getMass(c,elem,wt);
	///System.out.println("** "+m);
	add(stk,m);
	//System.out.println("***begin");
	//while(!(stk.isEmpty()))System.out.println(stk.peek());//System.out.println(stk.peek());
	//System.out.println("***end");
	//System.out.println("***");
}
String ans="";
while(!(stk.isEmpty()))ans=sum(ans,stk.pop());
System.out.println(ans);
		}/*PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
		writer.println("The first line");
		writer.println("The second line");
		writer.close();*/
	}
}
