package Class_5.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//ANOTHER METHOD LEVEL ANNOTATION
//let's imagine before serialization the object to a JSON String
//we want to execute one method to initialize an object
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Init {
	
}

