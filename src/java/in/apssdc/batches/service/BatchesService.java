package in.apssdc.batches.service;

import in.apssdc.batches.dao.BatchesDAO;
import in.apssdc.batches.model.BatchesModel;
import in.apssdc.batches.model.College;
import in.apssdc.batches.model.TrainingPrograms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.andromeda.commons.model.Response;

public class BatchesService
{
	Response response = new Response();
    BatchesModel batchesModel = new BatchesModel();
	
	@Autowired
	private BatchesDAO batchesDAO;
	
	public Response getTrainingPrograms()
	{
		response.setSuccessful(false);
		List<TrainingPrograms> trainingPrograms = batchesDAO.getTrainingPrograms();
		if(trainingPrograms.size()!=0) {
			batchesModel.setTrainingPrograms(trainingPrograms);
			response.setResponseObject(batchesModel.getTrainingPrograms());
			response.setSuccessful(true);
		}else{
			response.setErrorMessage("Training Programs Not Available!!!");
		}
		return response;
	}

	public Response getColleges()
	{
		response.setSuccessful(false);
		List<College> colleges = batchesDAO.getColleges();
		if(colleges.size()!=0) {
			batchesModel.setColleges(colleges);
			response.setResponseObject(batchesModel.getColleges());
			response.setSuccessful(true);
		}else{
			response.setErrorMessage("Training Programs Not Available!!!");
		}
		return response;
	}

}
