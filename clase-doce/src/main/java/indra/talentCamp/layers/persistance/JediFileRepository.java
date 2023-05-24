package indra.talentCamp.layers.persistance;

import indra.talentCamp.layers.models.*;
import indra.talentCamp.layers.persistance.interfaces.Repository;

import java.awt.Color;
import java.io.*;
import java.util.*;

public class JediFileRepository implements Repository<Jedi>{

	private int getJediCount() {
		File archivo=new File("./jedis");
		return archivo.listFiles().length;
	}
	
	public Jedi findById(int id)throws NotFoundException{
		File archivo= new File(String.format("./jedis/%d.txt", id));
		
		if(!archivo.exists()) {
			throw new NotFoundException();
		}
		try {
			try (BufferedReader reader= new BufferedReader(new FileReader(archivo))){
			
				String linea=reader.readLine();
				String[] lineas=linea.split(";");
				
				
				
				Jedi jedi=new Jedi(lineas[1],
						Integer.parseInt(lineas[2]),
						new Color(Integer.parseInt(lineas[3])));
				
				jedi.setId(Integer.parseInt(lineas[0]));
				return jedi;
			}
		} catch(Exception e) {
			throw new NotFoundException();
		}	
	}
	
	public void save(Jedi j) throws SaveErrorException {
		j.setId(this.getJediCount()+1);
		File archivo =new File(String.format("./jedis/%d.txt",j.getId()));
		try {

			archivo.createNewFile();
			try(FileWriter writer=new FileWriter(archivo)){
				writer.write(String.format("%d;%s;%d;%d",
						j.getId(),
						j.getNombre(),
						j.getNivelFuerza(),
						j.getColorLightsaber().getRGB()));
				
				}
		
		} catch(Exception ex) {
			throw new SaveErrorException();
		}
	}
	
	public List<Jedi> findAll(){
		try {
			List<Jedi> jedis=new ArrayList<Jedi>();
			File directorio=new File("./jedis");
			File[] archivos= directorio.listFiles();
			for(File archivo: archivos) {
				String nombre=archivo.getName();
				nombre=nombre.replaceAll(".txt", "");
				Jedi jedi;
				jedi = this.findById(Integer.parseInt(nombre));
				jedis.add(jedi);
			}
			return jedis;
		} catch (Exception ex) {
					// TODO Auto-generated catch block
			throw new Error("Esto es inesperado");
		}		
	}
	
	public void delete (int id)throws NotFoundException{
		File file = new File(String.format("%d.txt", id));
		if(!file.exists()) {
			throw new NotFoundException();
		}
		file.delete();
	}

	@Override
	public void update(Jedi existingObject) {
		// TODO Auto-generated method stub
		
	}
}
