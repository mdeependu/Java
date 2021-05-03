class Calc
{
public static void main(String args[])
{
if (args.length!=0)
{
System.out.println(args[0] + " " + args[1] + " " + args[2]);
}
else
{
System.out.println("Invalid");
}
int num1=args[0];
int num2=args[2];
char operator=args[1];
result=0;

switch (operator)
{
case '+':
result=num1+num2;
break;

case '-':
result=num1-num2;
break;
}
System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

}
}