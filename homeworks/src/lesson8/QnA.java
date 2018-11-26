package lesson8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class QnA {

	public static Map<Question, Answers[]> quiz = new HashMap<Question, Answers[]>();
	
	public static void addToMap(Question q, Answers[] a) {	
		quiz.put(q, a);
	}
	
	public static void printQuestionMap() {
		
		Set<Question> questionKeys = quiz.keySet();
		Iterator<Question> iQuestions = questionKeys.iterator();
		
		
		while (iQuestions.hasNext()) {
			Question q = iQuestions.next();
			System.out.println(q.getName() + "\n");
			
			for (Answers a : quiz.get(q)) {
				System.out.print(a.getId() + ". " + a.getName() + "\t\t");
				//System.out.print("\t");
			}
			
			System.out.println("\n");
		}
		
	}

}