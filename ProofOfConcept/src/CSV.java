import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.io.PrintWriter;

/**
 * @author sammydamdam
 */
public class CSV {
	List<Node> list;

	public CSV(List<Node> list) {
		this.list = list;

	}

	public void writeFile() {
		try {
			String dir = System.getProperty("user.dir");
			File survey = new File(dir + "survey.csv");
			PrintWriter output = new PrintWriter(survey);

			for (int i = 0; i < list.size(); i++) {
				output.write(String.valueOf(list.get(i).NodeNum));
				output.write("\r\n");
				System.out.println(list.get(i).MacAddr.size());
				for (int j = 0; j < list.get(i).MacAddr.size(); j++) {
					output.write(String.valueOf(list.get(i).MacAddr.get(j)));
					output.write(",");
					output.write(String.valueOf(list.get(i).SSID.get(j)));
					output.write(",");
					output.write(String.valueOf(list.get(i).NodeStrength.get(j)));
					output.write("\r\n");
				}
				output.write("\r\n");
			}

			System.out.println("data is in file");
			output.close();
		} catch (IOException e) {

		}

	}

}
