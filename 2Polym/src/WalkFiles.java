import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WalkFiles {
	public static void main(String[] args) throws IOException {
//		Stream<Path> paths = Files.walk(Paths.get("C:\\ibmgithub2\\AGGI2\\aggi-frontend"));
//		List<String> result = paths.map(x -> x.toString()).filter(f -> f.endsWith("Vue")).collect(Collectors.toList());
//		result.forEach(System.out::println);
//		
//		for(String filepath: result) {
//			File file = new File(filepath);
//			file.renameTo(new File(filepath+"new"));
//		}
		
		Stream<Path> paths = Files.walk(Paths.get("C:\\ibmgithub2\\AGGI2\\aggi-frontend"));
		List<String> result = paths.map(x -> x.toString()).filter(f -> f.endsWith("Vuenew1")).collect(Collectors.toList());
		result.forEach(System.out::println);
		
		for(String filepath: result) {
			File file = new File(filepath);
			file.renameTo(new File(filepath.replace("Vuenew1", "vue")));
		}
	}

}
