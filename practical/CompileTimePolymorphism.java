package Encapsulation;

public class CompileTimePolymorphism {
	void disp(int number){
		System.out.println ("method:" + number);
		}
		void disp(int number1, int number2){
		System.out.println ("method:" + number1 + "," + number2);
		}
		double disp(double number) {
		System.out.println("method:" + number);
		return number;
		}
		}
		class CompileTimePolymorphismDemo
		{
		public static void main (String args [])
		{
			 CompileTimePolymorphism obj = new  CompileTimePolymorphism();
		double result;
		obj.disp(60);
		obj.disp(70, 50);
		result = obj.disp(6.1);
		System.out.println("Answer is:" + result);
		}
		}