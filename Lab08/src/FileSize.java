import java.io.*;
public class FileSize {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f = new File("c:\\");
		File[] subfiles = f.listFiles();
		long max =0;
		String name=null;
		for(int i=0;i<subfiles.length;i++){
			File F = subfiles[i];
			if(subfiles[i].isFile()){
				if(max<F.length()){
					max = F.length();
					name = F.getName();
				}
			}
				
		}
		System.out.println("가장 큰 파일은 c:\\"+name+" "+max+"바이트");
	}

}
