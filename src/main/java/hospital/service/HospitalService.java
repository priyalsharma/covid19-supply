package hospital.service;


import java.util.List;

import delivery_staff.dao.Delivery_staffDao;
import hospital.dao.HospitalDao;
import hospital.domain.Hospital;

/**
 * logic functions such as register, login
 * @author Priyal Sharma
 *
 */
public class HospitalService {
	private HospitalDao hospitalDao = new HospitalDao();
	
	/**
	 * register a Supplier
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Hospital form) throws HospitalException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Supplier
		Hospital hospital = hospitalDao.findByhospital_id(form.getHospital_id());
		if(hospital.getHospital_id() !=null && hospital.getHospital_id().equals(form.getHospital_id())) throw new HospitalException("This user name has been registered!");
		hospitalDao.createHospital(form);
	}
	
	public List<Object> findHospital() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return HospitalDao.findHospital();
		
	}
}