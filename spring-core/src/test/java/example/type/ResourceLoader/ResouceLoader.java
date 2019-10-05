package example.type.ResourceLoader;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.*;

public class ResouceLoader {

	@Test
	public  void test(){
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		ResourceLoader resouceLoader1 = new FileSystemResourceLoader();

		Resource fileResource1 = resouceLoader1.getResource("D:/Users/chenming673/Documents/spark.txt");
		System.out.println("fileResource1 is FileSystemResource:" + (fileResource1 instanceof FileSystemResource));

		Resource fileResource2 = resourceLoader.getResource("/Users/chenming673/Documents/spark.txt");
		System.out.println("fileResource2 is ClassPathResource:" + (fileResource2 instanceof ClassPathResource));

		Resource urlResource1 = resourceLoader.getResource("file:/Users/chenming673/Documents/spark.txt");
		System.out.println("urlResource1 is UrlResource:" + (urlResource1 instanceof UrlResource));

		Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
		System.out.println("urlResource1 is urlResource:" + (urlResource2 instanceof  UrlResource));
	}
}
