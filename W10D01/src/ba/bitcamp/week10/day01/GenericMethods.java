package ba.bitcamp.week10.day01;

import java.awt.Component;
import java.awt.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JComponent;

public class GenericMethods {

	public static <T> void printAll(Collection<T> col) {
		System.out.println(col);
	}

	public static <T> int countOccurences(Collection<T> col, T e) {
		Iterator<T> iter = col.iterator();
		int counter = 0;
		for (int i = 0; i < col.size(); i++) {
			while (iter.hasNext()) {
				if (iter.next().equals(e)) {
					counter++;
				}

			}
		}

		return counter;
	}

	public static <T extends JComponent> void printComponentInfo(Component c) {
		System.out.println("Width: " + c.getWidth() + " Height: "
				+ c.getHeight() + " X: " + c.getX() + " Y: " + c.getY());
	}

	public static <T> void printType(Collection<T> col) {
		if (col instanceof Map) {
			System.out.println("Map");
		} else if (col instanceof List) {
			System.out.println("List");
		} else if (col instanceof Set) {
			System.out.println("Set");
		}
	}

}
