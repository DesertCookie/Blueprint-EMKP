package io.github.wordandahalf.blueprint.annotations;


import java.lang.annotation.*;


@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.METHOD )
public @interface At {
	
	
	public static final String
		HEAD = "HEAD",
		TAIL = "TAIL",
		LINE = "LINE",
		INVOCATION = "INVOCATION",
		FIELD = "FIELD",
		NEW = "NEW";
	
	
	String location() default HEAD;
	
	/**
	 * Any needed arguments for the location
	 */
	String[] args() default {};
	
	
}