package in.apssdc.batches.model;

import java.util.List;

public class BatchesModel
{
	private List<TrainingPrograms> trainingPrograms;
	private List<College> colleges;
	
	

	public List<College> getColleges()
	{
		return colleges;
	}

	public void setColleges(List<College> colleges)
	{
		this.colleges = colleges;
	}

	public List<TrainingPrograms> getTrainingPrograms()
	{
		return trainingPrograms;
	}

	public void setTrainingPrograms(List<TrainingPrograms> trainingPrograms)
	{
		this.trainingPrograms = trainingPrograms;
	}
	
}
