class Palindromic_pyramid{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			for(int j=2;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
//	   1
//    212
//   32123
//  4321234
// 543212345