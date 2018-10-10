
public class Person {
private String name;
private String superpower;
	Person(String name, String superpower){
	
}
 public void setName(String name) {
	 this.name = name;
	 System.out.println("Your person's name is " + name);
 }
 public String getName() {
	 return name;
 }

 public void SetSuperpower(String superpower) {
	 this.superpower = superpower;
	 System.out.println(name + "'s superpower is " + superpower);
 }
public String getSuperpower() {
	return superpower;
}
}
