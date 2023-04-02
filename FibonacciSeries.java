package Weekend1;

public class FibonacciSeries {
	
	static int range = 8, firstNum = 0, secNum = 1,i,ThirdNum;
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(firstNum+" "+secNum);  //printing 0 and 1 
		
		for(i=2;i<range;++i)
		{
			
			 ThirdNum=firstNum+secNum;    
			 System.out.print(" "+ThirdNum);    
			 firstNum=secNum;    
			 secNum=ThirdNum;    
			}    
		}

}

