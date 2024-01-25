package arraysPrograms;

public class TwoDimensionalEx2 {

	public static void main(String[] args) {
		
		int [][] studentMarks=
			{
					{67, 54, 80, 45},//0
					{90, 91, 87, 81},//1
					{35, 60, 71, 49} //2
			};

		int [][] studentMarks2=new int[3][4];
		studentMarks2[0][0]=67;
		studentMarks2[0][1]=54;
		studentMarks2[0][2]=80;
		studentMarks2[0][3]=45;
		
		studentMarks2[1][0]=90;
		studentMarks2[1][1]=91;
		studentMarks2[1][2]=87;
		studentMarks2[1][3]=81;
		
		studentMarks2[2][0]=35;
		studentMarks2[2][1]=60;
		studentMarks2[2][2]=71;
		studentMarks2[2][3]=49;
	}

}
