package indra.talentCamp.dependencyInjection.ioc;

import java.lang.reflect.Field;
import java.util.*;

public class BeanFactoryV2 {
	
	
	
	List<Dependency> dependencies =new ArrayList<Dependency>();

	public void registerDependency(Class<?> source, String fieldName, Object destination) {
		throw new Error("NotImplementedException");
	}
	
	public void registerDependency(Class<?> source, String fieldName, Class<?> destination) {
		this.dependencies.add(new Dependency(source, fieldName, destination));
	}
	
	public Object createBean(Class<?> source) {
		try {
			Object result =source.getConstructor().newInstance();
			
			List<Dependency> sourceDependencies=this.dependencies.stream()
					.filter(d->d.getSource()==source).toList();
			
			for(Dependency d: sourceDependencies) {
				Object destinationObject= d.getDestination().getConstructor().newInstance();
				Field field= source.getDeclaredField(d.getFieldName());
				field.setAccessible(true);
				field.set(result, destinationObject);
			}
			
			return result;
		}catch(Exception e) {
			throw new Error(e.getMessage());
		}
	}
}
