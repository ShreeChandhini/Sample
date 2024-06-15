package condition;

public class Conditions {
	public static void main(String[] args) {
		String n="String";
		if(n.startsWith("S"))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		String k="String";
		if(k.endsWith("g"))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		String a="Tring";
		int b=a.length();
		if(b%2==0)
		{
			System.out.println("b");
		}
		else
		{
			System.out.println("no");
		}
		
		String g="Care";
		int j=g.length();
		if(j%2==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
				
				
		int x=4000;
		if(x>=2000)
		{ 
			
		    System.out.println("The amount to be paid is "+x/2);
		}
		else {
			System.out.println(x);
		}
		int s=5000;
		if(s>=3000)
		{
			System.out.println("The amount to be paid is "+s*30/100);
		}
		else
		{
			System.out.println(s);
		}
		String c= "hynk";
		if(c.contains("a")||c.contains("e")||c.contains("i")||c.contains("o")||c.contains("u")) 
		{
			System.out.println("Vowels exist");
		}
		else
		{
			System.out.println("Vowels doesn't exist");
		}
		
		String cj= "Language";
		if(cj.contains("a")||cj.contains("e")||cj.contains("i")||cj.contains("o")||cj.contains("u")) 
		{
			System.out.println("Vowels exist");
		}
		else
		{
			System.out.println("Vowels doesn't exist");
		}
		int num=21;
		if(num> 0) {
			System.out.println("Positive");
		}
		else if(num < 0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Neutral");
		}
		
		
		int mark=90;
		if(mark>=0 && mark<=35)
		{
			System.out.println("Fail");
		}
		else if(mark>35 && mark<=50)
		{
			System.out.println("Grade D");
		}
		else if(mark>50 && mark<=75)
		{
			System.out.println("Grade C");
		}
		else if(mark>75 && mark<=90)
		{
			System.out.println("Grade B");
		}
		else if(mark>90 && mark<=100)
		{
			System.out.println("Grade A");
		}
		int day=5;
		switch(day)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Friday");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		String month="December";
		switch(month)
		{
		case "January":
			System.out.println("1");
			break;
		case "February": 
			System.out.println("2");
			break;
		case "March": 
			System.out.println("3");
			break;
		case "April": 
			System.out.println("4");
			break;
		case "May": 
			System.out.println("5");
			break;
		case "June": 
			System.out.println("6");
			break;
		case "July":
			System.out.println("7");
			break;
		case "August": 
			System.out.println("8");
			break;
		case "September": 
			System.out.println("9");
			break;
		case "October": 
			System.out.println("10");
			break;
		case "November": 
			System.out.println("11");
			break;
		case "December": 
			System.out.println("12");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		String st="String";
		String[] m=st.split("t");
		System.out.println(m[1]);
		
		String dr="Dear";
		String[] mr=dr.split("ea");
		System.out.println(mr[1]);
		
		String ch="character";
		char[] br=ch.toCharArray();
		System.out.println(br[1]);
		System.out.println("---------------------------------------------");
		
	}
}
