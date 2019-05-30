class Palindrome {
	public static void main(String[] args) {
		String str1 = "A.k.a ";
		String str2 = "Not a polyndrome";
		
		System.out.println(isPalindrome(str1));
		System.out.println(isPalindrome(str2));
	}
	
	public static boolean isPalindrome(String str) {
		if (str == null) {
			return false;
		}
		
		String s = str.trim().toLowerCase();
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
		}
		
		return true;
	}
}