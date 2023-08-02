package week3.assignements;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		
		int count;
		
		String[] split = text.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			count = 1;
		for (int j = i+1; j < split.length; j++) {
				if(split[i].equalsIgnoreCase(split[j])) {
					count = count+1;
				}
					if(count>1) {
					split[j]=" ";
					
					}
		}
					System.out.print(split[i]+" ");
				}
			}
			
			}
		
			
		
	

	
		
	


