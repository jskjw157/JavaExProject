package part3.ex4.UI코드분리하기;

public class ExamList {
	
	private Exam[] exams;
	private int current;
	
	
	public Exam get(int i) {
		
		return this.exams[i];
	}

	public void add(Exam exam) {
		
		Exam[] exams = this.exams;
        int size = current;
        
        if(exams.length == size) {
        	Exam[] temp = new Exam[size + 5];
        	
        	for(int i=0; i<size; i++)
        		temp[i] = exams[i];
        	
        	exams = temp;
        	
        }

        	
        else
        	exams[this.current] = exam;
        	current++;
		
	}

	public ExamList() {
		this(3);
		
	}
	
	// Aggregation Has A
	public ExamList(int size) {
		exams = new Exam[size];
		current = 0;
		
	}

	public int size() {
		
		return current;
	}
	
}
