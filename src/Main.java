import mvc.controller.Controller;
import mvc.model.Impegno;
import mvc.view.ViewImpegno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Controller controller = new Controller();
		
		Impegno impegno = new Impegno(null , null,  "maria", "descirzione impegno Maria");
		
		ViewImpegno viewImpegno = new ViewImpegno(impegno);
			
		}
		
		

	}


