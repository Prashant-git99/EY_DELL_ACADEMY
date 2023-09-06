package Class_5.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//field level annotation
//this annotation declare once


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)

public @interface JsonElement {
	public String key() default "";
	
}