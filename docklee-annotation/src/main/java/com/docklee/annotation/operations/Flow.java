package com.docklee.annotation.operations;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(value={METHOD,ANNOTATION_TYPE})
@Retention(value=RUNTIME)
@Inherited
public @interface Flow {

}
