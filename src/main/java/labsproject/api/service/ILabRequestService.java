package labsproject.api.service;

import java.util.List;

import labsproject.api.entity.LabRequest;

public interface ILabRequestService {
	public Iterable<LabRequest> getAllList();
	public LabRequest getById(String id);
	public List<LabRequest> getByUser(Long id);
	public LabRequest Insert(LabRequest labRequest);
	public LabRequest Update(LabRequest labRequest, String id);
}
