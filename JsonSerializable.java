package Class_5.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//1st step toward creating the custom annotation is to declare
//using keyword interface
//next to add meta data- runtime visibility - type means it can
//apply to classes
//this class has no method so will mark as marker interface

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonSerializable {
	
}
