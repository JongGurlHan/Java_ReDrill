package part3.ex3.Getters와Setters;

import java.util.Scanner;

public class ExamList {
	
	private Exam[] exams;
	private int current;	
	
	public void inputList() {
		Scanner scan = new Scanner(System.in); 
    	
    	System.out.println("┌───────────────────────────┐");
        System.out.println("│           성적  입력                 │");
        System.out.println("└───────────────────────────┘");
        System.out.println();
      
	        
        	int kor, eng, math;
	        
	        do {
		        System.out.printf("국어 : ");
		        kor = scan.nextInt();
	        
		        if(kor < 0 || 100 < kor)
		        	System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
		        
	        }while(kor < 0 || 100 < kor);
	       
	        do {
	        	System.out.printf("영어 : ");
	        	eng = scan.nextInt();
	        	
	        	if(eng < 0 || 100 < eng)
	        		System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");
	        	
	        }while(eng < 0 || 100 < eng);
	     
	        do {
	        	System.out.printf("수학 : ");
	        	math = scan.nextInt();
	        	
	        	if(math < 0 || 100 < math)
	        		System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");
	        	
	        }while(math < 0 || 100 < math);
	        
	        /*
	        Exam exam = new Exam();	        
	        exam.setKor(kor); //exam.kor = kor;
	        exam.setEng(eng);
	        exam.setMath(math);
	        */
	        
	        Exam exam = new Exam(kor, eng, math);
	        
	        
	        Exam[] exams = this.exams;
	        int size = current;
	        
	        if(exams.length == size) {
	        	//1 크기가 5개 더 큰  새로운 배열을 생성하시오
	        	Exam[] temp = new Exam[size + 5];
	        	
	        	//2. 값을 이주시키기	        	
	        	for(int i = 0; i<size; i++) {
	        		temp[i] = exams[i];
	        	}
	        	
	        	//3.  list.exams가  새로 만든 temp배열을 참조하도록 한다.
	        	exams = temp;
	        	
	        	
	        }
	        
	        exams[current] = exam;
	        current++;
	}
		
	//똑같은 함수를 중복 구현 했을경우 코드집중화를 한다.	
	public void printList() {
		printList(current);
	}
	
	public void printList(int size) {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력                   │");
		System.out.println("└───────────────────────────┘");
		System.out.println();
		
		//int size = list.current;
		Exam[] exams = this.exams;
		
		for(int i = 0; i<size; i++) {
			Exam exam = exams[i];
		
			int kor =  exam.getKor(); //exam.kor;
			int eng = exam.getEng();
			int math = exam.getMath();
			 
			int total = exam.total();//kor + eng + math;
			float avg = exam.avg();//total / 3.0f;
			
			System.out.printf("국어  : %3d\n", kor);	        	
			System.out.printf("영어  : %3d\n", eng);	        	
			System.out.printf("수학  : %3d\n", math);	        	
			
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("─────────────────────────────");
		
		}
	}

	
	public ExamList() {
		exams = new Exam[3];
		current =0;
		
	}
	

}
 