package labsproject.api.controller;


import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import labsproject.api.entity.Building;
import labsproject.api.entity.Faculty;
import labsproject.api.entity.LabRequest;
import labsproject.api.entity.User;
import labsproject.api.service.ILabRequestService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})

@RequestMapping(path="/labrequest")
public class LabRequestController {
	
	@Autowired
	private ILabRequestService labRequestService;
		
	@GetMapping("/list")
	public Iterable<LabRequest> getList(){
		return labRequestService.getAllList();
	}
	
	@GetMapping("/userlist/{id}")
	public Iterable<LabRequest> getUserList(@PathVariable Long id){
		return labRequestService.getByUser(id);
	}
	
	@GetMapping("/{id}")
	public LabRequest getById(@PathVariable String id) {
		return labRequestService.getById(id);
	}	
	
	@PostMapping(path="/add", consumes = {"application/json"})
	public @ResponseBody String Insert (@RequestBody Map<String, Object> json) {
		try {
			LabRequest labRequest = new LabRequest();
			labRequest.date=new SimpleDateFormat("yyyy-MM-dd").parse (json.get("date").toString());
			labRequest.datetime=new SimpleDateFormat("hh:mm").parse (json.get("datetime").toString());
			labRequest.name=(json.get("name").toString());
			labRequest.iduser = (json.get("iduser").toString());
			labRequest.labid=Long.parseLong(json.get("labid").toString());
			labRequest.asign=(json.get("asign").toString());
			labRequest.teacherid=Long.parseLong(json.get("teacherid").toString());
			labRequest.facultyid=Long.parseLong(json.get("facultyid").toString());
			labRequest.students=Integer.parseInt(json.get("students").toString());
			labRequest.cantmachines=Integer.parseInt(json.get("cantmachines").toString());
			labRequest.cantconsume=Integer.parseInt(json.get("cantconsume").toString());
			labRequest.observation=(json.get("observation").toString());
			labRequest.usemachines=Boolean.parseBoolean(json.get("usemachines").toString());
			labRequest.useconsume=Boolean.parseBoolean(json.get("useconsume").toString());
			labRequest.guide=Boolean.parseBoolean(json.get("guide").toString());
			labRequest.status = Integer.parseInt((json.get("status").toString()));
			labRequestService.Insert(labRequest);
			return "Saved";	
		}
		catch(Exception ex){
			return "Error: "+ex;	
		}			
	}
	@PutMapping(path="/edit/{id}", consumes = {"application/json"})
	public @ResponseBody String Update (@RequestBody Map<String, Object> json, @PathVariable String id) {
		try {
			LabRequest labRequest = new LabRequest();
			labRequest.date=new SimpleDateFormat("yyyy-MM-dd").parse (json.get("date").toString());
			labRequest.datetime=new SimpleDateFormat("hh:mm").parse (json.get("datetime").toString());
			labRequest.name=(json.get("name").toString());
			labRequest.labid=Long.parseLong(json.get("labid").toString());
			labRequest.asign=(json.get("asign").toString());
			labRequest.teacherid=Long.parseLong(json.get("teacherid").toString());
			labRequest.facultyid=Long.parseLong(json.get("facultyid").toString());
			labRequest.students=Integer.parseInt(json.get("students").toString());
			labRequest.cantmachines=Integer.parseInt(json.get("cantmachines").toString());
			labRequest.cantconsume=Integer.parseInt(json.get("cantconsume").toString());
			labRequest.observation=(json.get("observation").toString());
			labRequest.usemachines=Boolean.parseBoolean(json.get("usemachines").toString());
			labRequest.useconsume=Boolean.parseBoolean(json.get("useconsume").toString());
			labRequest.guide=Boolean.parseBoolean(json.get("guide").toString());
			labRequest.iduser = (json.get("iduser").toString());
			labRequest.status = Integer.parseInt((json.get("status").toString()));
			labRequestService.Update(labRequest,id);
			
			return "Saved";	
		}
		catch(Exception ex){
			return "Error: "+ex;	
		}			
	}	
	
}
