class Inverted_con_shape_num{
	public static void main(String[] args){
		int n=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=6-i;k++){
				System.out.print(" "+n);
				n++;
			}
			System.out.println();
		}
	}
}