package ch07.ex04.case05.domain;

public class Score {
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private int avg;
	
	public Score(int Kor, int eng, int math) {
		this.kor = Kor;
		this.eng = eng;
		this.math = math;
	}
		
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public void setMath(int math) {
		this.math = math;
	}



	@Override
	public String toString() {
		return String.format("%5d %5d %5d %4d %4d",
				kor,eng,math,sum,avg);
	}
}
