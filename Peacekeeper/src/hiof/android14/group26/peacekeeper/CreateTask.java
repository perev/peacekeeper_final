package hiof.android14.group26.peacekeeper;

import hiof.android14.group26.peacekeeper.models.Tasks;
import android.os.AsyncTask;

public class CreateTask extends AsyncTask<Void, Void, Tasks>{

	String desc;
	double price;
	String creationDate;
	String dueDate;
	int creator;
	int responsible;
	
	
//	public CreateTask(String desc, double price, String creationDate,
//			String dueDate, int creator, int responsible) {
//		
//		this.desc = desc;
//		this.price = price;
//		this.creationDate = creationDate;
//		this.dueDate = dueDate;
//		this.creator = creator;
//		this.responsible = responsible;
//	}


	
	@Override
	protected Tasks doInBackground(Void... params) {
		
		//Tasks task;
		
		//TODO: pass parameters
		//http://stackoverflow.com/questions/12069669/how-can-you-pass-multiple-primitive-parameters-to-asynctask
		Tasks task = MainActivity.getDatasource().createTaskNoResponsibleHouseholdMember("Toilet paper", 40.0, "28.04.2014", "30.04.2014", 1);
		
		
//		if(responsible==0){
//			task = MainActivity.getDatasource().createTaskNoResponsibleHouseholdMember(
//					desc, price, creationDate, dueDate, creator);
//		}else{
//			task = MainActivity.getDatasource().createTaskResponsibleHouseholdMember(
//					desc, price, creationDate, dueDate, creator, responsible);
//		}
		
		
		
		return task;
	}
	
}
