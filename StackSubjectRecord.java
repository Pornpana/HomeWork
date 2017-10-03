package th.ac.utcc.cpe.pornpana;

import th.ac.utcc.cpe.pornpana.tast.Stack;
/**
 * @author 5907401003 พรพนา ขำดวง
 */
public class StackSubjectRecord {
	private int maxSize ;
	private SubjectRecord []stackArray ;
	private int top ;
	
	public StackSubjectRecord(int maxSize){
		this.maxSize = maxSize;
		this.stackArray  = new SubjectRecord[this.maxSize];
		this.top = -1 ;
	}
	public void push(SubjectRecord i){
		stackArray[++top] = i ;
	}
	public SubjectRecord pop(){
		return stackArray[top--];
	}
	public boolean isEmpty(){
		return(top == -1);
		
	}
	public boolean isFull(){
		return (top==maxSize-1);
		
	}
	
	public static void main (String[] args){
		SubjectRecord sr1 = new SubjectRecord();
		SubjectRecord sr2 = new SubjectRecord();
		SubjectRecord sr3 = new SubjectRecord();
		sr1.setName("gamem");
		sr1.setCodeName("NC252");
		sr1.setUnit(4);
		sr1.setGrade("a");
		
		sr2.setName("gamemater");
		sr2.setCodeName("NC252");
		sr2.setUnit(2);
		sr2.setGrade("c");
		
		sr3.setName("nina");
		sr3.setCodeName("NC252");
		sr3.setUnit(3);
		sr3.setGrade("b");
	
		StackSubjectRecord stack = new StackSubjectRecord(10);
		stack.push(sr1);
		stack.push(sr2);
		stack.push(sr3);
		
		SubjectRecord sr4 = stack.pop();
		System.out.println(sr4);
		SubjectRecord sr5 = stack.pop();
		System.out.println(sr5);
		SubjectRecord sr6 = stack.pop();
		System.out.println(sr6);
		
		}

}
