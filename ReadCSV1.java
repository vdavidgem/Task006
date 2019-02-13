package comgemdemoHip;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV1 {

	public static void main(String[] arags) {

		ReadCSV1 obj = new ReadCSV1();
		obj.run();
	}

	private void run() {
		// TODO Auto-generated method stub

		String CSVfile = "E:\\New folder (3)";

		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		try {

			br = new BufferedReader(new FileReader(CSVfile));

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] country = line.split(cvsSplitBy);

				System.out.println("Country  [code=" + country[4] + ", name =" + country[5] + "]");
			}
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		System.out.println("completed");
	}

}