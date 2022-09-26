package Assignment2;

public class Tourist {
private String Name;
private Integer Id;
private String City;

public Tourist() {
	super();
}

public Tourist(Integer id,String name, String city) {
	super();
	Name = name;
	Id = id;
	City = city;
}

public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}

@Override
public String toString() {
	return "Tourist [Name=" + Name + ", Id=" + Id + ", City=" + City + "]";
}

}
