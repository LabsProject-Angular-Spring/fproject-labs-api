package labsproject.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import labsproject.api.entity.LabRequest;
import labsproject.api.repository.ILabRequestRepository;
import labsproject.api.service.ILabRequestService;


@Service
public class LabRequestService implements ILabRequestService{

	@Autowired
	private ILabRequestRepository labRequestRepository;
	
	@Override
	public Iterable<LabRequest> getAllList() {
		return labRequestRepository.findAll();
	}

	@Override
	public LabRequest getById(String id) {
		return labRequestRepository.findById(id).get();
	}
	
	@Override
	public LabRequest Insert(LabRequest labRequest) {		
		return labRequestRepository.save(labRequest);
	}
	
	@Override
	public LabRequest Update(LabRequest labRequest, String id) {		
		labRequest.id=id;
		return labRequestRepository.save(labRequest);
	}
	
	@Override
	public List<LabRequest> getByUser(Long id){
		List<LabRequest> UserLabs = new ArrayList<LabRequest>();
		List<LabRequest> AllLabs = labRequestRepository.findAll();
		for(LabRequest Lab: AllLabs) {
			if(Lab.iduser.toString().equals(id.toString())) {
				UserLabs.add(Lab);
			}
		}
		return UserLabs;
	}

}
