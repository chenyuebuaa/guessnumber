
public class GenerateNumber {

	String nubmer ="";
	public String getNumber() {
		// TODO Auto-generated method stub
		int[] a={0,0,0,0,0,0,0,0,0,0};
		for(int j=0;j<4;j++)
		{
			
			int i = (int) (Math.random()*9);
			if(a[i]==0)
			{
				this.nubmer+=i;
				a[i]+=1;
			}else j--;
		}
	
		return this.nubmer;
	}
	public boolean isrepeate() {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++)
			for(int j=i+1;j<4;j++)
			{
				if(this.nubmer.charAt(i)==this.nubmer.charAt(j))
					return true;
			}
		return false;
	}
	

}
