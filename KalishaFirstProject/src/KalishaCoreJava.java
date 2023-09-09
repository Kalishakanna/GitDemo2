
public class KalishaCoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=26;
		char letter='A';
		String aala="My name is Aala Azrin";
		Boolean tellme=true;
		double dot=10.55;
		
		System.out.println(num+aala);
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		int[] arr2= {1,2,3,4,5,6};
		for(int i=0;i< arr2.length;i++)
		{
			System.out.println (arr2[i]);
		}
			
		String[] name={"kalisha","azrin","nazeerah","razak"};
		for(int i=0 ;i<name.length;i++)
		{System.out.println (name[i]);}
		
		for(String s:name)
			System.out.println(s);
		for(int i:arr)
			System.out.println(i);
		
		String s="kalisha bee shaik";
		String[] s1=s.split("bee" );
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println((s1[1]).trim());
		
		for(int i=0;i<s.length();i++)
		{System.out.println(s.charAt(i));}
		for(int i=s.length()-1;i>=0;i--)
		{System.out.println(s.charAt(i));}

	}

}
