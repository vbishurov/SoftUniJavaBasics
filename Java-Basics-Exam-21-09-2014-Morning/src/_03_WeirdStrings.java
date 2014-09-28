import java.util.Scanner;

public class _03_WeirdStrings {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String line=scanner.nextLine();
		scanner.close();
		char[] junk=line.toCharArray();
		String withoutJunk=new String();
		for (int i = 0; i < junk.length; i++) {
			if (junk[i]=='\\'||junk[i]=='/'||junk[i]=='('||junk[i]==')'
					||junk[i]=='|'||junk[i]==' '||junk[i]=='\t'||junk[i]=='\n') {
				continue;
			}
			else {
				withoutJunk+=""+junk[i];
			}
		}
		String[] words=withoutJunk.split("[^a-zA-Z]+");
		int maxWeight=Integer.MIN_VALUE;
		int indexStart=0;
		for (int i = 0; i < words.length-1; i++) {
			int currentWeight=getWeight(words[i])+getWeight(words[i+1]);
			if (currentWeight>=maxWeight) {
				maxWeight=currentWeight;
				indexStart=i;
			}
		}
		System.out.println(words[indexStart]);
		System.out.println(words[indexStart+1]);
	}
	public static int getWeight(String word){
		int wordWeight=0;
		char[] letters=word.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			switch (letters[i]) {
			case 'a':wordWeight+=1;break;
			case 'b':wordWeight+=2;break;
			case 'c':wordWeight+=3;break;
			case 'd':wordWeight+=4;break;
			case 'e':wordWeight+=5;break;
			case 'f':wordWeight+=6;break;
			case 'g':wordWeight+=7;break;
			case 'h':wordWeight+=8;break;
			case 'i':wordWeight+=9;break;
			case 'j':wordWeight+=10;break;
			case 'k':wordWeight+=11;break;
			case 'l':wordWeight+=12;break;
			case 'm':wordWeight+=13;break;
			case 'n':wordWeight+=14;break;
			case 'o':wordWeight+=15;break;
			case 'p':wordWeight+=16;break;
			case 'q':wordWeight+=17;break;
			case 'r':wordWeight+=18;break;
			case 's':wordWeight+=19;break;
			case 't':wordWeight+=20;break;
			case 'u':wordWeight+=21;break;
			case 'v':wordWeight+=22;break;
			case 'w':wordWeight+=23;break;
			case 'x':wordWeight+=24;break;
			case 'y':wordWeight+=25;break;
			case 'z':wordWeight+=26;break;
			case 'A':wordWeight+=1;break;
			case 'B':wordWeight+=2;break;
			case 'C':wordWeight+=3;break;
			case 'D':wordWeight+=4;break;
			case 'E':wordWeight+=5;break;
			case 'F':wordWeight+=6;break;
			case 'G':wordWeight+=7;break;
			case 'H':wordWeight+=8;break;
			case 'I':wordWeight+=9;break;
			case 'J':wordWeight+=10;break;
			case 'K':wordWeight+=11;break;
			case 'L':wordWeight+=12;break;
			case 'M':wordWeight+=13;break;
			case 'N':wordWeight+=14;break;
			case 'O':wordWeight+=15;break;
			case 'P':wordWeight+=16;break;
			case 'Q':wordWeight+=17;break;
			case 'R':wordWeight+=18;break;
			case 'S':wordWeight+=19;break;
			case 'T':wordWeight+=20;break;
			case 'U':wordWeight+=21;break;
			case 'V':wordWeight+=22;break;
			case 'W':wordWeight+=23;break;
			case 'X':wordWeight+=24;break;
			case 'Y':wordWeight+=25;break;
			case 'Z':wordWeight+=26;break;
			default:break;
			}
		}
		return wordWeight;
	}
}
