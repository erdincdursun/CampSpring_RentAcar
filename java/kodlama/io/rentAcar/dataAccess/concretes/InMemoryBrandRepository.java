package kodlama.io.rentAcar.dataAccess.concretes;

import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import kodlama.io.rentAcar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentAcar.entities.concretes.Brand;

@Repository // bu sınıf bir DataAccess nesnesidir.
public class InMemoryBrandRepository implements BrandRepository {

	List<Brand>brands;
	
	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"Mercides"));
		brands.add(new Brand(3,"Audi"));
		brands.add(new Brand(4,"Fiat"));
		brands.add(new Brand(5,"Renault"));
		brands.add(new Brand(6,"Porsche"));
		
		
	}

	@Override
	public List<Brand> getAll() {
		
		return brands;
	}

}
