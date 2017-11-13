package lab1;

import java.io.IOException;

public class readin {
	public static String read(String filename)
	{
		Main.floydready=false;
		Main.graph.clear();
		try
		{
			Main.graph.readin(filename);
			System.out.println("read finish");
			return "";
		}
		catch(IOException e1)
		{
			System.out.println("Error when reading file.");
			return "文件读取出错";
		}
	}

}
