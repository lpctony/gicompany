class Hey 
{
	 public static void main(String[] src)
{
		 java.util.Scanner  sc=new java.util.Scanner(System.in);
	        int chi,eng,sum;
	        System.out.println("輸入國文");
	        chi=sc.nextInt();
	        System.out.println("輸入英文");
	        eng=sc.nextInt();
	        sum=chi+eng;

	        if(sum>=130)
	        {
	        	System.out.println("恭喜錄取");
	        }
	        else
	        {
	        	System.out.println("總分="+sum+"未達130,不能錄取");
	        }
}
}