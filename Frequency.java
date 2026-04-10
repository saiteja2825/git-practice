import java.util.*;
class Frequency{

	public static void main(String []args){
		Scanner sc=new Scanner(System.in);

		
		int arr[]={2 ,2 ,2 ,4 ,3 ,4 ,5 ,5 ,6 ,7};

		for(int i=0;i<arr.length;i++){
			int freq=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){

					freq++;
				}
		
			}
			System.out.println(arr[i]+"  -> "+freq);
		
		}

		

	}

}