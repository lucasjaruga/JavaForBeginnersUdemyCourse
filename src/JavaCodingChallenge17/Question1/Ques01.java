package JavaCodingChallenge17.Question1;

public class Ques01 {
	enum JobStatus {
		SUCCESS(1), FAILURE(2), WAITING(3);
		
		private int code;
		
		private JobStatus(int code) {
			this.code = code;
		}
		
		public int getCode() {
			return code;
		}
		
		@Override
		public String toString() {
			return name() + "[" + getCode() + "]";
		}
	}

	public static void main(String[] args) {
		for(JobStatus js : JobStatus.values()) {
			System.out.println(js);
		}
	}
}