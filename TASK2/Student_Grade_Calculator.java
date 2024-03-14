import java.util.Scanner;
class Student_Grade_Calculator
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
int totM=0;
boolean b=false;
int i=1;//Initialization
while(i<=6)//Condition
{
System.out.println("Enter marks of Sub"+i);
int mk = s.nextInt();
if(mk<0 || mk>100)
{
System.out.println("Invalid Marks...");
continue;
}
if(mk>=0 && mk<=34)
{
	b=true;
}
totM = totM+mk;
i++;//Increment
}
System.out.println("TotalMarks:"+totM);
float per = (float)totM/6;
System.out.println("Percentage:"+per);
if(b)
{
System.out.println("StudentResult : Fail");
}
else if(per>=70 && per<=100)
{
 System.out.println("StudentResult : Destinction");
}
else if(per>=60 && per<70)
{
System.out.println("StudentResult : FirstClass");
}
else if(per>=50 && per<60)
{
System.out.println("StudentResult : SecondClass");
}
else
{
System.out.println("StudentResult : ThirdClass");
}
 }
}
