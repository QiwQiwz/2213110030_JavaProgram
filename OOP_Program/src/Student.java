
public class Student {
	private String name;
	private int score;

	public void setName(String Name) {
		name = Name;
	}// end of setName()

	public String getName() {
		return name;
	}// end of getName()

	public void setScore(int Score) {
		score = Score;
	}// end of setScore()

	public int getScore() {
		return score;
	}// end of getScore()

	public boolean checkScore() {
		return score >= 0 && score <= 100;
	}// end of checkScore()

	public boolean isPass() {
		if (score >= 50) {
			return true;
		} else {
			return false;
		}
	}// end of isPass()

	public String findGrade() {
		if (score < 50) {
			return "F";
		}

		else if (score < 55) {
			return "D";
		} else if (score < 60) {
			return "D+";
		} else if (score < 65) {
			return "C";
		} else if (score < 70) {
			return "C+";
		} else if (score < 75) {
			return "B";
		} else if (score < 80) {
			return "B+";
		} else {
			return "A";
		}
	}//end of findGrade()
}
