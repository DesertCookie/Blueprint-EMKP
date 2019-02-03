package io.github.wordandahalf.blueprint.annotations;


import java.lang.annotation.*;


@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.METHOD )
public @interface Inject {
	
	
	String target();
	
	At at();
	
	
}
