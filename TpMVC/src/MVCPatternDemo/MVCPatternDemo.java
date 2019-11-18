package MVCPatternDemo;

import controller.StudentController;
import model.StudentModel;
import view.StudentView;

public class MVCPatternDemo {

	public static void main(String[] args) 
	{
	
		//chercher le dossier de l'étudiant basé sur son numéro de rôle dans la base de données
	      StudentModel model  = retriveStudentFromDatabase();
	      
	      //Créer une vue: écrire les détails de l'étudiant sur la console
	      StudentView view = new StudentView();
	      
	      StudentController controller = new StudentController(model, view);
	      controller.updateView();
	      
	      //mettre à jour les données du modèle
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
