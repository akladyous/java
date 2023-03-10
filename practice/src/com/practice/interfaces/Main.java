package com.practice.interfaces;

import com.practice.interfaces.vehicle.Toyota;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) {

		Method[] methods = Toyota.class.getDeclaredMethods();

		for (Method method : methods) {
			int modifiers = method.getModifiers();
			if (Modifier.isPublic(modifiers)) {
				System.out.println("The method " + method.getName() + " is public");
			}
			if (Modifier.isPrivate(modifiers)) {
				System.out.println("The method " + method.getName() + " is private");
			}
			if (Modifier.isStatic(modifiers)) {
				System.out.println("The method " + method.getName() + " is static");
			}
			if (Modifier.isSynchronized(modifiers)) {
				System.out.println("The method " + method.getName() + " is synchronized");
			}
		}
	}
}
