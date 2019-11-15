package labsproject.api.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class LabRequest{

	@Id
    public String id;
	public String iduser;
    public Date date;
    public Date datetime;
    public String name;	
    public Long labid;	
    public String asign;	
    public Long teacherid;	
    public Long facultyid;	
    public Integer students;	
    public Integer cantmachines;	
    public Integer status;
    public Integer cantconsume;	
    public String observation;	
    public Boolean usemachines;
    public Boolean useconsume;
    public Boolean guide;
    
}
