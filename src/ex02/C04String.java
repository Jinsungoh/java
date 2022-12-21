package ex02;

public class C04String {
	public static void main(String[]args) {
		String s ="|"+ " a happy " .trim()+ "|";//머리와꼬리의 space값을 제거한다.
		s = s.concat(" dog");//주어에 목적어를 붙히는 역활을 한다.
		s = s.substring(2);//지정한index이하의 문자열을 잘라낸다.
		System.out.println(s);
		
		s = "hello";
		System.out.printf("%c\n",s.charAt(1));//문자1개를 뜯어낼때쓴다.
		
		int i = "apple".codePointAt(0);//unicode 값을 보여준다.
		i = "a".hashCode();
		i = "b".hashCode();
		i = "b".compareTo("a");
		i = "a".compareTo("b");
		i = "A".compareTo("a");
		i = "A".compareToIgnoreCase("a");
		i = s.indexOf("l");
		i = s.lastIndexOf("l");
		i = s.length();
		
		System.out.println(i);
		
		s = "develop";
		boolean b = s.startsWith("de");
		b = s.endsWith("lop");
		b = s.equals("develop");
		b = s.equals("Develop");
		b = s.equalsIgnoreCase("Develop");
		b = "".isEmpty();
		b = s.matches("[a-zA-Z]*");//문자를썻는가
		b = s.matches("[0-9]*");//숫자를썻는가
		System.out.println(b);
		
	}
	
}
