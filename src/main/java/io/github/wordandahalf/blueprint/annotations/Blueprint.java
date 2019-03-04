package io.github.wordandahalf.blueprint.annotations;


import java.lang.annotation.*;


/**
 * Used to denote classes that contain methods decorated with injection-related annotations
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.TYPE )
public @interface Blueprint {
	
	
	String target();
	
	
}
