import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1541 {

	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("-");
		int[]map = new int[s.length];
		int answer =0;
		for(int i=0;i<s.length;i++)
		{
			String[] t = s[i].split("\\+");
			for(int j=0;j<t.length;j++)
			{
				map[i] += Integer.parseInt(t[j]);
			}
			if(i==0)
			{
				answer+=map[i];
			}
			else
			{
				answer-=map[i];
			}
		}
		System.out.println(answer);
	}
}
