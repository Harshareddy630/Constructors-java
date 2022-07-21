class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class parameterizedconstructorjava {
	public static void main(String[] args) {

		Std std1=new Std(2,"sunil");
		Std std2=new Std(4,"karthik");
		std1.display();
		std2.display();
			}

}
