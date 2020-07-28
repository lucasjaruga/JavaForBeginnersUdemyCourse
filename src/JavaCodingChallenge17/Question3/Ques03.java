package JavaCodingChallenge17.Question3;

enum Alphabets {
	A("Vowel"),
	B("Consonant"),
	C("Consonant"),
	D("Consonant"),
	E("Vowel"),
	F("Consonant"),
	G("Consonant"),
	H("Consonant"),
	I("Vowel"),
	J("Consonant"),
	K("Consonant"),
	L("Consonant"),
	M("Consonant"),
	N("Consonant"),
	O("Vowel"),
	P("Consonant"),
	Q("Consonant"),
	R("Consonant"),
	S("Consonant"),
	T("Consonant"),
	U("Vowel"),
	V("Consonant"),
	W("Consonant"),
	X("Consonant"),
	Y("Consonant"),
	Z("Consonant");
	
	private String type;
	
	Alphabets (String type){
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}

public class Ques03 {
	public static void main(String[] args) {
		for(Alphabets alphabet : Alphabets.values()) {
			System.out.println(alphabet.toString() + " : " + alphabet.getType());
		}
	}
}