import java.util.*; 
import java.io.*; 

class prac13{
	static void revstr(){
		Scanner s = new Scanner(System.in); 
		String str = s.nextLine();
		String revstr =""; 
		for(int i=0; i<str.length(); i++)
		 revstr = str.charAt(i) + revstr;
		System.out.println("Given: "+str+"\nReverse: "+revstr); 
		if(str.equalsIgnoreCase(revstr))
			System.out.println("Pelindrome");
		else
			System.out.println("Not Pelindrome"); 
	}
	static void facto(){
		Scanner s = new Scanner(System.in); 
		int no = s.nextInt(); 
		int tmp = 1; 
		for(int i=no; i>0; i--)
			tmp = i * tmp; 
		System.out.println("Factorial of "+no+" = "+tmp); 
	}
	static void charCount(){
		String s = "adasdadf@@#$11323123";
		int cch=0, cno=0, csc=0;
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i); 
			if(Character.isLetter(ch))
				cch++; 
			else if (Character.isDigit(ch))
				cno++; 
			else
				csc++; 
		}
		System.out.println("Char: "+cch+"\nNo: "+cno+"\nSC: "+csc); 
	}
	static void upperlower(){
		String s = "WiNdOWs";
		String tmp = "";
		for(int i=s.length()-1; i>=0; i--){
			char ch = s.charAt(i); 
			if(Character.isUpperCase(ch))
				tmp = Character.toLowerCase(ch) + tmp;
			else if(Character.isLowerCase(ch))
				tmp = Character.toUpperCase(ch) + tmp; 
		}
		System.out.println("Before: "+s+"\nAfter: "+tmp); 
	}
	static void sortarray(){
		int a[] = {15, 14, 13, 12, 11};
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++)
				if(a[i] > a[j]){
					int tmp = a[i]; 
					a[i] = a[j]; 
					a[j] = tmp; 
				}
			System.out.print(a[i]+","); 
		}
	}
	static void startwith(){
		String s = "Hello World!!"; 
		System.out.println(s.startsWith("Hello")); 
		System.out.println(s.endsWith("World")); 
	}
	static void prime(){
		Scanner s = new Scanner(System.in); 
		int no = s.nextInt();
		for(int i=2; i<=no; i++)
			for(int j=2; j<=i; j++)
				if(i%j==0)
					if(i==j)
						System.out.print(i+","); 
					else
						break; 
	}
	static void fibonanci(){
		Scanner s = new Scanner(System.in); 
		int no = s.nextInt(); 
		int next=0, prev=1; 
		for(int i=0; i<=no; i++){
			System.out.print(next+","); 
			int tmp = next + prev; 
			next = prev; 
			prev = tmp;
		}
	}
	static void dupary(){
		int a[] = {1,2,3,1,2,3,4,1,2,5,4,6,5};
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++)
				if(a[i] == a[j])
					a[j] = 0; 
			if(a[i] != 0)
				System.out.print(a[i]+","); 
		}
	}
	static void swapnotext(){
		String s1 = "Hello", s2 = "World"; 
		int a = 10, b = 5, len=s1.length(); 
		a = a + b; 
		b = a - b; 
		a = a - b; 
		s1 = s1 + s2; 
		s2 = s1.substring(0,len); 
		s1 = s1.substring(len); 
		System.out.print("a: "+a+"\nb: "+b+"\ns1: "+s1+"\ns2: "+s2); 
	}
	static void charfreq(){
		String s = "aabbccddde";
		char ch[] = s.toCharArray(); 
		for(int i=0; i<ch.length; i++){
			int count = 1; 
			for(int j=i+1; j<ch.length; j++)
				if(ch[i]==ch[j]){
					count++; 
					ch[j]='\0';
				}
			if(ch[i] != '\0')
			System.out.println(ch[i]+" = " + count);
		}
	}
	static void fileops(){
		try{
			File file = new File("C:\\Users\\KN00832612\\Documents\\Test files\\test.txt"); 
			if(file.createNewFile())
				System.out.println("Create New File");
			else
				System.out.println("Already existed file"); 
			
			FileWriter writer = new FileWriter(file); 
			writer.write("8/4/2025Test Data"); 
			writer.close();
	
			FileReader reader = new FileReader(file); 
			int c=0; 
			while((c=reader.read()) != -1)
				System.out.print((char)c); 
		} catch(Exception e){
			System.out.println("Exception: "+e.getMessage()); 
		}
	}
	public static void main(String[] args){
		//revstr();	
		//facto();
		//charCount();
		//upperlower();
		//sortarray();
		//startwith();
		//prime();
		//fibonanci();
		//dupary();
		//swapnotext();
		//charfreq();
		fileops();
		
	}
}