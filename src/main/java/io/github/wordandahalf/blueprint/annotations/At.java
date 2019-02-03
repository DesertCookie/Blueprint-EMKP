package io.github.wordandahalf.blueprint.annotations;


import java.lang.annotation.*;


@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.METHOD )
public @interface At {
	
	
	/**
	 * Location the specified code gets injected into.<br>
	 * Currently supported values include {@code HEAD}, {@code TAIL}, {@code BEFORE_RETURN} and {@code INVOCATION}.
	 *
	 * @see Pos;
	 */
	String location();
	
	/**
	 * Any needed arguments for the location argument.
	 */
	String[] args() default {};
	
	
	/**
	 * Final fields for use in the {@code location} field of {@link At}.
	 *
	 * @see #HEAD
	 * @see #TAIL
	 * @see #BEFORE_RETURN
	 * @see #INVOCATION
	 */
	public static class Pos {
		
		
		/**The beginning of the method. */
		public static final String HEAD = "HEAD";
		/**The end of the method. */
		public static final String 	TAIL = "TAIL";
		/**Before the return of a method. */
		public static final String 	BEFORE_RETURN = "BEFORE_RETURN";
		/**Replaces the invocation of the specified method, see {@link At#args()}. */
		public static final String 	INVOCATION = "INVOCATION";
		
		
	}
	
	
}
