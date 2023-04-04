package ex1_net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex3_InputStream {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.naver.com");
			String line = "";
			
			BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
			while((line = input.readLine()) != null) {
				//readLine�� String���� ��ȯ�ϱ� ������ -1�� �ƴ� null�� �־��ش�.
				System.out.println(line);
				//https://www.naver.com�� ���� ��Ҹ� ���� �ҷ��´�.(html)
			}
			
			input.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}