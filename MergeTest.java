package MergingSorting;

public class MergeTest {

	public static void main(String[] args) {
	
//MergeSort MergeTest = new MergeSort();

int A[]={4,5,8,10};

int B[]= {1,2,3,6,7,9,12};

int C[]= new int [A.length + B.length];

MergeSort.merge(A, B, C);

String s = "";
for (int i = 0; i < C.length; i++) {
	s+= C[i] + " ";
}
System.out.println(s);
		

	}

}
