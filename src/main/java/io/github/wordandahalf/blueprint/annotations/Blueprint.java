package io.github.wordandahalf.blueprint.annotations;


import java.lang.annotation.*;


/**
 * Used to mark classes that contain methods decorated with injection-related annotations like {@link Inject} or {@link Override}.
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.TYPE )
public @interface Blueprint {
	
	
	/** Class to modify. */
	String target();
	
	
}
