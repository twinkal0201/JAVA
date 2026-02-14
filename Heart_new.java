class Heart_new{
	public static void main(String[] args) {
		for(int i=1;i<=2;i++){
			for(int j=1;j<=10;j++){
				if(i==1){
					if(j==5||j==9){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				else if(i==2){
					if(j==4||j==6||j==8||j==10){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++){
			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=6-i;j++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
  //   *   *
  //  * * * *
  // * * * * *
  //  * * * *
  //   * * *
  //    * *
  //     *