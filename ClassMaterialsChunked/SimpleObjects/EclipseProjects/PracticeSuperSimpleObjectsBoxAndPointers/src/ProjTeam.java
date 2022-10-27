public class ProjTeam {
	private String tName;
	private Student[] members;
	private int numMems;
	private int max;
	
	public ProjTeam(String tName, int max) {
		this.tName = tName;
		this.max = max;
		this.members = new Student[max];
		this.numMems = 0;
	}
	
	public void addMember(Student mem) {
		if (this.numMems < this.max) {
			this.members[this.numMems] = mem;
			this.numMems++;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProjTeam [tName=");
		builder.append(tName);
		builder.append(", members=[");
		for (int k = 0, z = this.members.length; k < z; k++) {
			builder.append(this.members[k]);
			if (k < (z - 1)) {
				builder.append(",");
			} // end if
		} // end for
		builder.append("], numMems=");
		builder.append(numMems);
		builder.append(", max=");
		builder.append(max);
		builder.append("]");
		return builder.toString();
	}
	
	
}
