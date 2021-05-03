class Calculator
{

public static void main (String args[])
{

int num1=10;
int num2=5;
int result=0;
char operator='+';
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
