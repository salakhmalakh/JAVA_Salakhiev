import java.util.Scanner;

public class Magadan{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int maxon=0;
		while(true){
			int k=scanner.nextInt();
			if(k==0){
				break;
			}
			if(k>maxon){
				maxon=k;
			}
		}
		System.out.println(maxon);
	}
}		