package in.apssdc.batches.dao;

import in.apssdc.batches.model.College;
import in.apssdc.batches.model.TrainingPrograms;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BatchesDAO
{
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	//private BatchesModel batchesModel;
	  
	public List<TrainingPrograms> getTrainingPrograms()
	{
		SqlSession sqlSession = null;
		List<TrainingPrograms> trainingPrograms = null;
		try{
			sqlSession = sqlSessionFactory.openSession();
		    trainingPrograms = sqlSession.selectList("batches.getTrainingPrograms");
		}catch(Exception e) {
			System.out.println("Exception in getTrainingPrograms() in DAO ---" +e);
		}finally{
			sqlSession.close();
		}
		return trainingPrograms;
	}

	public List<College> getColleges()
	{
		SqlSession sqlSession = null;
		List<College> colleges = null;
		try{
			sqlSession = sqlSessionFactory.openSession();
			colleges = sqlSession.selectList("batches.getColleges");
		}catch(Exception e) {
			System.out.println("Exception in getColleges in DAO ---" +e);
		}finally{
			sqlSession.close();
		}
		return colleges;
	}

}
