package MVCPatternDemo;

import controller.StudentController;
import model.StudentModel;
import view.StudentView;

public class MVCPatternDemo {

	public static void main(String[] args) 
	{
	
		//chercher le dossier de l'�tudiant bas� sur son num�ro de r�le dans la base de donn�es
	      StudentModel model  = retriveStudentFromDatabase();
	      
	      //Cr�er une vue: �crire les d�tails de l'�tudiant sur la console
	      StudentView view = new StudentView();
	      
	      StudentController controller = new StudentController(model, view);
	      controller.updateView();
	      
	      //mettre � jour les donn�es du mod�le
	      controller.setStudentName("Khaled");
	      controller.updateView();

	}
	
	 private static StudentModel retriveStudentFromDatabase(){
		 
	      StudentModel student = new StudentModel();
	      
	      student.setName("Hegel");
	      student.setRollNo("10");
	      
	      return student;
	   }

}
