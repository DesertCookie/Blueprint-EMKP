package io.github.wordandahalf.blueprint.annotations;


import java.lang.annotation.*;


@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.METHOD )
public @interface At {
	
	
	/** The beginning of the method. */
	String HEAD = "HEAD";
	/** The end of the method. */
	String TAIL = "TAIL";
	/** Before the return of a method. */
	String BEFORE_RETURN = "BEFORE_RETURN";
	/** Replaces the invocation of the specified method, see {@link At#args()}. */
	String INVOCATION = "INVOCATION";
	
	
	/**
	 * Location the specified code gets injected into.<br> Currently supported values include {@code HEAD}, {@code TAIL}, {@code BEFORE_RETURN} and
	 * {@code INVOCATION}.
	 */
	String location();
	
	/**
	 * Any needed arguments for the location argument.
	 */
	String[] args() default {};
	
	
}
