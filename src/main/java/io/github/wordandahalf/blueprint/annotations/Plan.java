package io.github.wordandahalf.blueprint.annotations;


import java.lang.annotation.*;


/**
 * Used to denote methods that are to be injected into a class provided by its class's {@link Blueprint} annotation
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.METHOD )
public @interface Plan {
	
	
	String method();
	
	PlanType type();
	
	
}
