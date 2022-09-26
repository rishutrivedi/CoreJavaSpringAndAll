package daysix.collections.map;

import java.util.Objects;

public class Key {
private int index;
private String name;
@Override
public int hashCode() {
	return Objects.hash(index, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Key other = (Key) obj;
	return index == other.index && Objects.equals(name, other.name);
}
public int getIndex() {
	return index;
}
public void setIndex(int index) {
	this.index = index;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Key(int index, String name) {
	super();
	this.index = index;
	this.name = name;
}
public Key() {
	super();
}



}
