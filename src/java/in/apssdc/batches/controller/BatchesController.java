package in.apssdc.batches.controller;

import in.apssdc.batches.service.BatchesService;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.andromeda.commons.model.Response;
import com.google.gson.JsonParser;

@Controller
@RequestMapping("/batches")
public class BatchesController
{
		@Autowired
		private BatchesService batchesService;
		
		Response response = new Response();
	
		@ResponseBody
		@RequestMapping(value = "/digital" , method={RequestMethod.POST,RequestMethod.GET} )
		public Response  sampleData(@RequestBody String json) throws JSONException {
			System.out.println("ok data coming!!!");
			JSONObject jsonObject =  new JSONObject(json);
			System.out.println(jsonObject);
			JSONObject responseObject = new JSONObject();
			responseObject.put("name", "P.Sandhya");
			responseObject.put("role", "AndroidDeveloper");
			response.setSuccessful(true);
			
			response.setResponseObject(responseObject);
			return response;
			/*System.out.println("AID ---> " + jsonObject.get("AID"));
			System.out.println("PID ---> " + jsonObject.get("PID"));*/
			 
			/*System.out.println("AID ----> "  + json.get("AID"));
			System.out.println("PID ----> "  + json.get("PID"));*/
			
		}
		
		@ResponseBody
		@RequestMapping(value = "/trainingPrograms" , method={RequestMethod.POST} )
		public Response getTrainingPrograms() {
			return  batchesService.getTrainingPrograms();
			
			
		}
		
		
		@ResponseBody
		@RequestMapping(value = "/colleges" , method={RequestMethod.POST} )
		public Response getColleges() {
			return  batchesService.getColleges();
			
			
		}
		
		
}

