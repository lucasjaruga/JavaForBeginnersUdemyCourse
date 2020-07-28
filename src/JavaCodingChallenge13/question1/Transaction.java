package JavaCodingChallenge13.question1;

public class Transaction {
	private int id;
	private String desc;
	
	public Transaction(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDet(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "Transaction [ID = " + id + ", Description = " + desc +"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Transaction) {
			Transaction tId = (Transaction)obj;
			if(this.id == tId.id) {
				return true;
			}
		}
		return false;
	}
}