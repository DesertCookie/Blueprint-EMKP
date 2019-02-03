package io.github.wordandahalf.blueprint.annotations;


import java.lang.annotation.*;


@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.METHOD )
public @interface Overwrite {
	
	
	String target();
	
	
}
