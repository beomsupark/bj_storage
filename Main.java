import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int num = 1000 - Integer.parseInt(s);
		int[] coin = {500,100,50,10,5,1};
		int count =0;
		for(int i=0;i<coin.length;i++)
		{
			while(num>=coin[i])
			{
				num = num - coin[i];
				count++;
			}
		}
		System.out.println(count);
	}
	
}
