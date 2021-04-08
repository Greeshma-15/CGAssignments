package lab2;

import java.util.Arrays;

//
public class AlphabetsConversion {
	public String sortStrings(String[]arr){
	int n=arr.length;
	for(int j=0;j<n;j++){
		arr[j]=arr[j].toLowerCase();
	}
	Arrays.sort(arr);
	if(n%2!=0){
		int count=(n/2)+1;
		for(int i=0;i<count;i++){
			arr[i]=arr[i].toUpperCase();
			System.out.println(arr[i]+"");
		}
		for(int i=count;i<n;i++){
			arr[i]=arr[i].toLowerCase();
			System.out.println(arr[i]+"");
		}
	}
		else
		{
			int count=n/2;
			for(int i=0;i<count;i++){
				arr[i]=arr[i].toUpperCase();
				System.out.println(arr[i]+"");
			}
			for(int i=count;i<n;i++){
				arr[i]=arr[i].toLowerCase();
				System.out.println(arr[i]+"");
			}
		}
		return null;
	}
	public static void main(String[] args) {
		AlphabetsConversion a=new AlphabetsConversion();
		String[] arr={"apple","mango","lemon","KIWI"};
		a.sortStrings(arr);
	}
}