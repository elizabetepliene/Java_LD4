// 231RDC043 Elizabete Pliene RDCP0

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("231RDC043 Elizabete Pliene RDCP0 grupa");
		
		String fileName;
		System.out.println("input file name:");
		fileName = sc.nextLine();
		sc.close();
		FileReader fr = new FileReader(fileName);
		sc = new Scanner(fr);
		String s;
		String result;
		Double videja=0.0;
		int paradi = 0;
		int count = 0;
		System.out.println("result: ");
		while(sc.hasNextLine()){
			s = sc.nextLine();
			count = 0;
			videja = 0.0;
			paradi = 0;
			result = "";
			for (int i = 0; i < s.length(); i++){
				char ch = s.charAt(i);
				if(Character.isDigit(ch)){
					videja = videja+Character.getNumericValue(ch);
					if(Character.getNumericValue(ch)<4){
						paradi++;
					}  
					count++;
				}
			}
			videja= videja/count;
			if(videja <=5){
				for(int i =0;i<s.length();i++){
					char ch = s.charAt(i);
					if(Character.isLetter(ch)){
						if(Character.isLowerCase(ch)){
							result = result+ch;
						}
						else
						result=result+" "+ch;
					}

					}
					}

			if(paradi>0&&result!=""){
				System.out.println(result.trim()+" "+paradi);
			}
			}
				
			sc.close();
			}

			
		}

