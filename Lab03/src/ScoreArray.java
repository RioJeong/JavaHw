import java.util.Scanner;
public class ScoreArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String course[]={"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[]={95,88,76,62,55};
		
		while(true){
			System.out.print("���� �̸�>>");
			String c = scanner.nextLine();
			int subject=0;
			if(c.equals("�׸�"))
				break;
			else{
				for(int i=0;i<course.length;i++)
					if(course[i].equals(c)){
						System.out.println(course[i]+"�� ������ "+score[i]);
						subject=1;
						break;
					}
				if(subject==0)
					System.out.println("���� �����Դϴ�.");
			}
		
		
		}
		scanner.close();
		
	}

}
