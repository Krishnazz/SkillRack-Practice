package Dailytest;
import java.io.*;
import java.util.*;
public class Keyboard {

	//	 Given a list of words, return the words that can be typed using letters of the alphabet on only one row of American keyboard
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] a=str.split(",");
		HashMap <Character,Integer>  mp =new HashMap<>();
		char[] ch=new char[26];
		for(int i=0;i<26;i++) {
			ch[i]=(char)('a'+i);
		}
		for(int i=0;i<26;i++) {
			switch(ch[i]) {
			case 'q','w','e','r','t','u','y','i','o','p':
				mp.put('q',1);
				mp.put('w',1);
				mp.put('e',1);
				mp.put('r',1);
				mp.put('t',1);
				mp.put('u',1);
				mp.put('y',1);
				mp.put('i',1);
				mp.put('o',1);
				mp.put('p',1);
				break;
				
			case 'a','s','d','f','g','h','j','k','l':
				mp.put('a',2);
				mp.put('s',2);
				mp.put('d',2);
				mp.put('f',2);
				mp.put('g',2);
				mp.put('h',2);
				mp.put('j',2);
				mp.put('k',2);
				mp.put('l',2);
				mp.put('p',2);
				break;
				
			case 'z','x','c','v','b','n','m':
				mp.put('z',3);
				mp.put('x',3);
				mp.put('c',3);
				mp.put('v',3);
				mp.put('b',3);
				mp.put('n',3);
				mp.put('m',3);
				break;
				
			}
			
		}
		
		int flag=0;
		for(int i=0;i<a.length;i++) {
			char[] b=a[i].toCharArray();
			int key=mp.get(b[0]);
			int count=1;
			for(int j=1;j<b.length;j++) {
				if(key==mp.get(Character.toLowerCase(b[j]))) {
					count+=1;
				}
				//flag=1;
			}
			if(count==b.length) {
				System.out.print(a[i]);
				flag=1;
			}
//			    
		}
			if(flag==0)
				System.out.print(-1);
	}

}
