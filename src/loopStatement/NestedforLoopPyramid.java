package loopStatement;

public class NestedforLoopPyramid {

	public static void main(String[] args) {
		
		for (int i=1; i<=8; i++){
			
			
			for (int m=1; m<=i; m++)	{
				
				for(int k=1; k<=i; k++){
					
					System.out.print("*");
				
				}
				System.out.println();
			
			}
		
		
		}
		
	}
	}
