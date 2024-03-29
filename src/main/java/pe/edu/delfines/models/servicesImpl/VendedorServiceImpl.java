package pe.edu.delfines.models.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.delfines.models.entity.Vendedor;
import pe.edu.delfines.models.repository.ClienteRepository;
import pe.edu.delfines.models.repository.VendedorRepository;
import pe.edu.delfines.services.VendedorService;
@Service
public class VendedorServiceImpl implements VendedorService {


	@Autowired
	private VendedorRepository vendedorRepository;
	
	
	@Transactional(readOnly = true)
	@Override
	public List<Vendedor> findAll() throws Exception {
		// TODO Auto-generated method stub
		return vendedorRepository.findAll()
				;
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Vendedor> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return vendedorRepository.findById(id);
	}
	@Transactional
	@Override
	public Vendedor save(Vendedor entity) throws Exception {
		// TODO Auto-generated method stub
		return vendedorRepository.save(entity);
	}
	@Transactional
	@Override
	public Vendedor update(Vendedor entity) throws Exception {
		// TODO Auto-generated method stub
		return vendedorRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		vendedorRepository.deleteById(id);
		
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		vendedorRepository.deleteAll();
		
	}
	@Transactional
	@Override
	public List<Vendedor> fetchMayorSueldo(float sueldo) throws Exception {
		// TODO Auto-generated method stub
		return vendedorRepository.fetchMayorSueldo(sueldo);
	}

}
