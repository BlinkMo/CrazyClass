
public class Chapter_1 {
	
	public static void question1()
	{
		for(int i = 1; i < 10;i++)
		{
			for(int j = 1 ;j <= i ;j++)
			{
				System.out.print(i + " x " + j + " = " + i*j);
				if(j != i)
				{
					System.out.print(" , ");
				}
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question1();

	}

}
