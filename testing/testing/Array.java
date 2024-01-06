package testing;

public class Array {

	public static void main(String[] args) {
		int weight[] = {6,3,2,5};
		char name[] = {'M','a','n','i','s','h'};
		int total = 0;
		for (int i=0; i<weight.length; i++){
			total = total + weight[i];
		}
		System.out.println("Total =" + total);
		System.out.println(name);
		System.out.println("I am " + new String(name));
		System.out.println(name.length);
		System.out.println(name[2]);

	}

}
