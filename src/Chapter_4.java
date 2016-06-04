
public class Chapter_4 {
	
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
			System.out.print("\n");
		}
	}
	
	public static void question2(int count)
	{
		for(int i = 0 ; i < count; i++)
		{
			for(int j = 1 ; j < count - i ; j++)
			{
				System.out.print(" ");
			}
			for(int k = 0 ; k < 2*i + 1 ; k++)
			{
				System.out.print("*");
			}
			for(int l = 1 ; l < count - i ; l++)
			{
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question2(4);

	}

}
