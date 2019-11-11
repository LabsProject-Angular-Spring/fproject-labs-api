package labsproject.api.service.impl;

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

}
