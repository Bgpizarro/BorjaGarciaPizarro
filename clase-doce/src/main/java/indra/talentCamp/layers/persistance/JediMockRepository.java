package indra.talentCamp.layers.persistance;

import java.util.*;

import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistance.interfaces.Repository;

import org.apache.commons.lang3.*;

public class JediMockRepository implements Repository<Jedi>{

	private List<Jedi> jedis=new LinkedList<Jedi>();
	
	private int ultimoId() {
		return this.jedis.stream().mapToInt(jedi->jedi.getId()).max().orElse(0);
	}
	
	public List<Jedi> findAll(){
		return Collections.unmodifiableList(this.jedis);
	}
	
	public Jedi findById(int id) throws NotFoundException {
		return this.jedis.stream()
				.filter(j->j.getId()==id)
				.findFirst()
				.orElseThrow(()->new NotFoundException());
	}
	
	public void save(Jedi jedi) {
		jedi.setId(this.ultimoId()+1);
		this.jedis.add(jedi);
	}
	
	public void update(Jedi jedi) {
		//no hace nada
	}
	
	public void delete(int id) throws NotFoundException{
		Jedi j=this.findById(id);
		this.jedis.remove(j);
	}
}
