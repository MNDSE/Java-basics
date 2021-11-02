import java.io.File;

public class Mainfile {

	public static void main(String[] args) {
		// File = An abstract representation of file abdd directory pathnames
		
		/* if the file is in the project folder; we do not have to list the path. However, if the file is located in our computer we need
		 * to put the location path and the file name: C:/Users/paris/Downloads/lifeishard.txt
		 */
		
		File file = new File("lifeishard.txt");
		
		if(file.exists()) {
			System.out.println("The file exist");
			
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
		}
		else {
			System.out.println("File doesn't exist");
		}
		

	}

}
