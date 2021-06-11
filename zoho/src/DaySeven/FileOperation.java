package DaySeven;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class FileOperation {
	
		public static void main(String[] args) throws IOException {
			
			String s="my self yusuf";
			writeFileEfficiently(s);
			System.out.println("done");
			
			File f = new File("filename.txt");
			f.createNewFile();
			fileWrite(f,"if you want a rain,you have to deal with rainbow!");
			copyTwoFIleUsingStream(f);
			System.out.println(f.getName());
			readingTextFromFile(f);
		}

	
	static void fileWrite(File f,String s)
	{
		
		try {
		      FileWriter myWriter = new FileWriter("filename.txt");
		      myWriter.write(s);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	static void copyTwoFIleUsingStream(File f){
			
		 FileInputStream in = null;
		 FileOutputStream out = null;

	      try {
	         in = new FileInputStream(f);
	         out = new FileOutputStream("output.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
	         
	            try {
	            	if (in != null) {
	            	in.close();
	
	            	}
	            	if (out != null) {
	    	            out.close();
	    	         }
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	         }
	         
	      
		}

		private static void readingTextFromFile(File f)
		{
			StringBuilder st = new StringBuilder();
			
			try(BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(f),"UTF-8"))){
				
				String line="";
				
				while((line=read.readLine()) != null) {
				st.append(line);
			}
				System.out.println(st);
				} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		private static void writeFileEfficiently(String s) {
			
			try(BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("yusuf.txt"),"UTF-8"))){
				
				wr.write(s);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
