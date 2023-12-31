package Class_5.Annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import Class_5.JsonSerializableException;
import Class_5.Annotations.JsonElement;

public class ObjectToJSONConverter {

    public String convertToJSON(Object obj) throws IllegalArgumentException, IllegalAccessException {
        try {
            CheckIfSerializable(obj);
            initializeObject(obj);
            //return getJsonString(obj)
            return getJsonString(obj);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void CheckIfSerializable(Object obj) throws JsonSerializableException {
        if(Objects.isNull(obj)) {
            throw new JsonSerializableException("Can't serialize null object");
        }

        Class<?> clazz = obj.getClass();
        if(!clazz.isAnnotationPresent(JsonSerializable.class)) {
            throw new JsonSerializableException("This class " + clazz.getSimpleName() + " is not annotated with " + " JSON Serializable annotation");
        }
    }

    private void initializeObject(Object object) throws IllegalAccessException, InvocationTargetException {
        Class<?> clazz = object.getClass();
        for(Method method: clazz.getDeclaredMethods()) {
            method.setAccessible(true);
            method.invoke(object);
        }
    }
    private String getJsonString(Object object) {
    	Class<?> clazz = object.getClass();
    	Map<String, String> jsonElementMap = new HashMap<>();
    	for(Field field : clazz.getDeclaredFields()) {
    		field.setAccessible(true);
    		if(field.isAnnotationPresent(JsonElement.class)) {
    			jsonElementMap.put(getKey(field), field.get(object));
    		}
    	}
    	String jsonString = jsonElementMap.entrySet()
    			.stream()
    			.map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
    			.collect(Collectors.joining(","));
    	return "{" + jsonString + "}";
    }
    
   private String getKey(Field field) {
	   String value = field.getAnnotation(JsonElement.class)
			   .key();
	   return value.isEmpty() ? field.getName() : value;
   }
}